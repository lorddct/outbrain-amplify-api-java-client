package com.xy1m.amplify.model.reference.objects;

import com.google.common.collect.Lists;
import com.xy1m.amplify.model.resource.InterestTargeting;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class InterestDefinition {

    private List<InterestTargeting> and1;
    private List<InterestTargeting> and2;
    private List<InterestTargeting> exclude;

    public List<InterestTargeting> getAnd1() {
        return and1;
    }

    public void setAnd1(List<InterestTargeting> and1) {
        this.and1 = and1;
    }

    public void addAnd1Condition(InterestTargeting interest) {
        if (this.and1 == null) {
            this.and1 = new ArrayList<>();
        }
        this.and1.add(interest);
    }

    public List<InterestTargeting> getAnd2() {
        return and2;
    }

    public void setAnd2(List<InterestTargeting> and2) {
        this.and2 = and2;
    }

    public void addAnd2Condition(InterestTargeting interest) {
        if (this.and2 == null) {
            this.and2 = new ArrayList<>();
        }
        this.and2.add(interest);
    }

    public List<InterestTargeting> getExclude() {
        return exclude;
    }

    public void setExclude(List<InterestTargeting> exclude) {
        this.exclude = exclude;
    }

    public void addExcludeCondition(InterestTargeting interest) {
        if (this.exclude == null) {
            this.exclude = new ArrayList<>();
        }
        this.exclude.add(interest);
    }

    public Map<String, Object> toMap() {
        Map<String, Object> and1Map = null;
        Map<String, Object> and2Map = null;
        Map<String, Object> notMap = null;

        if (and1 != null && !and1.isEmpty()) {
            List<Map<String, Object>> concepts = new ArrayList<>();
            for (InterestTargeting targeting : and1) {
                concepts.add(toMap(targeting));
            }
            and1Map = new LinkedHashMap<>();
            and1Map.put("op", InterestOperator.Or.name());
            and1Map.put("interestConcepts", concepts);
        }

        if (and2 != null && !and2.isEmpty()) {
            List<Map<String, Object>> concepts = new ArrayList<>();
            for (InterestTargeting targeting : and2) {
                concepts.add(toMap(targeting));
            }
            and2Map = new LinkedHashMap<>();
            and2Map.put("op", InterestOperator.Or.name());
            and2Map.put("interestConcepts", concepts);
        }

        if (exclude != null && !exclude.isEmpty()) {
            List<Map<String, Object>> concepts = new ArrayList<>();
            for (InterestTargeting targeting : exclude) {
                concepts.add(toMap(targeting));
            }

            Map<String, Object> excludeMap = new LinkedHashMap<>();
            excludeMap.put("op", InterestOperator.Or.name());
            excludeMap.put("interestConcepts", concepts);

            notMap = new LinkedHashMap<>();
            notMap.put("op", InterestOperator.Not.name());
            notMap.put("terms", Lists.newArrayList(excludeMap));
        }

        if (and1Map != null) {
            if (and2Map != null || notMap != null) {
                List<Map<String, Object>> terms = new ArrayList<>();
                terms.add(and1Map);

                if (and2Map != null) {
                    terms.add(and2Map);
                }

                if (notMap != null) {
                    terms.add(notMap);
                }

                Map<String, Object> result = new LinkedHashMap<>();
                result.put("op", InterestOperator.And.name());
                result.put("terms", terms);
                return result;
            }

            return and1Map;
        }

        return notMap;
    }

    @SuppressWarnings("unchecked")
    public static InterestDefinition fromMap(Map<String, Object> interestMap) {
        InterestDefinition definition = null;

        if (interestMap != null) {
            definition = new InterestDefinition();
            InterestOperator op = InterestOperator.valueOf((String) interestMap.get("op"));

            if (op == InterestOperator.And) {
                List<Map<String, Object>> terms = (List<Map<String, Object>>) interestMap.get("terms");

                List<InterestTargeting> and1 = new ArrayList<>();
                List<InterestTargeting> and2 = new ArrayList<>();
                List<InterestTargeting> exclude = new ArrayList<>();

                for (int i = 0; i < terms.size(); i++) {
                    Map<String, Object> term = terms.get(i);

                    InterestOperator op2 = InterestOperator.valueOf((String) term.get("op"));
                    List<InterestTargeting> target;

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

                definition.setAnd1(and1.isEmpty() ? null : and1);
                definition.setAnd2(and2.isEmpty() ? null : and2);
                definition.setExclude(exclude.isEmpty() ? null : exclude);
            }
            else {
                List<Map<String, Object>> concepts = (List<Map<String, Object>>) interestMap.get("interestConcepts");
                for (Map<String, Object> concept : concepts) {
                    definition.addAnd1Condition(toInterest(concept));
                }
            }
        }

        return definition;
    }

    private static InterestTargeting toInterest(Map<String, Object> concept) {
        InterestTargeting targeting = new InterestTargeting();
        targeting.setId((String) concept.get("id"));
        targeting.setName((String) concept.get("name"));
        targeting.setCanBeTargeted((Boolean) concept.get("canBeTargeted"));
        return targeting;
    }

    private static Map<String, Object> toMap(InterestTargeting interest) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("id", interest.getId());
        map.put("name", interest.getName());
        map.put("canBeTargeted", interest.getCanBeTargeted());
        return map;
    }

}
