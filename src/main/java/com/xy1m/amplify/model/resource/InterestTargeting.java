package com.xy1m.amplify.model.resource;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class InterestTargeting extends InterestTargetingBase {

    @SuppressWarnings("unchecked")
    public static InterestTargeting fromMap(Map<String, Object> interestMap) {
        InterestTargeting definition = null;

        if (interestMap != null) {
            definition = new InterestTargeting();
            InterestOperator op = InterestOperator.valueOf((String) interestMap.get("op"));

            if (op == InterestOperator.And) {
                List<Map<String, Object>> terms = (List<Map<String, Object>>) interestMap.get("terms");

                List<Interest> and1 = new ArrayList<>();
                List<Interest> and2 = new ArrayList<>();
                List<Interest> exclude = new ArrayList<>();

                for (int i = 0; i < terms.size(); i++) {
                    Map<String, Object> term = terms.get(i);

                    InterestOperator op2 = InterestOperator.valueOf((String) term.get("op"));
                    List<Interest> target;

                    if (op2 == InterestOperator.Not) {
                        List<Map<String, Object>> notTerms = (List<Map<String, Object>>) term.get("terms");

                        for (Map<String, Object> notTerm : notTerms) {
                            List<Map<String, Object>> concepts = (List<Map<String, Object>>) notTerm.get("interestConcepts");

                            for (Map<String, Object> concept : concepts) {
                                exclude.add(toInterest(concept));
                            }
                        }
                    }
                    else {
                        List<Map<String, Object>> concepts = (List<Map<String, Object>>) term.get("interestConcepts");
                        target = i == 0 ? and1 : and2;

                        for (Map<String, Object> concept : concepts) {
                            target.add(toInterest(concept));
                        }
                    }
                }

                definition.setBasic(and1.isEmpty() ? null : and1);
                definition.setAnd(and2.isEmpty() ? null : and2);
                definition.setNot(exclude.isEmpty() ? null : exclude);
            }
            else {
                List<Map<String, Object>> concepts = (List<Map<String, Object>>) interestMap.get("interestConcepts");
                for (Map<String, Object> concept : concepts) {
                    definition.addBasicCondition(toInterest(concept));
                }
            }
        }

        return definition;
    }

    private static Interest toInterest(Map<String, Object> concept) {
        Interest targeting = new Interest();
        targeting.setId((String) concept.get("id"));
        targeting.setName((String) concept.get("name"));
        targeting.setCanBeTargeted((Boolean) concept.get("canBeTargeted"));
        return targeting;
    }

    private static Map<String, Object> toMap(Interest interest) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("id", interest.getId());
        map.put("name", interest.getName());
        map.put("canBeTargeted", interest.getCanBeTargeted());
        return map;
    }

}
