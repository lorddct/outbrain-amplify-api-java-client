package com.xy1m.amplify.model.resource;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InterestTargetingCreate extends InterestTargetingBase {

    public Map<String, Object> toMap() {
        Map<String, Object> basicMap = null;
        Map<String, Object> andMap = null;
        Map<String, Object> notMap = null;

        if (basic != null && !basic.isEmpty()) {
            basicMap = new LinkedHashMap<>();
            basicMap.put("op", InterestOperator.Or.name());
            basicMap.put("ids", basic.stream().map(Interest::getId).collect(Collectors.toList()));
        }

        if (and != null && !and.isEmpty()) {
            andMap = new LinkedHashMap<>();
            andMap.put("op", InterestOperator.Or.name());
            andMap.put("ids", and.stream().map(Interest::getId).collect(Collectors.toList()));
        }

        if (not != null && !not.isEmpty()) {
            Map<String, Object> internalMap = new HashMap<>();
            internalMap.put("op", InterestOperator.Or.name());
            internalMap.put("ids", not.stream().map(Interest::getId).collect(Collectors.toList()));

            notMap = new HashMap<>();
            notMap.put("op", InterestOperator.Not.name());
            notMap.put("terms", Lists.newArrayList(internalMap));
        }

        if (basicMap != null) {
            if (andMap != null || notMap != null) {
                List<Map<String, Object>> terms = new ArrayList<>();
                terms.add(basicMap);

                if (andMap != null) {
                    terms.add(andMap);
                }

                if (notMap != null) {
                    terms.add(notMap);
                }

                Map<String, Object> result = new LinkedHashMap<>();
                result.put("op", InterestOperator.And.name());
                result.put("terms", terms);
                return result;
            }
            return basicMap;
        }
        return notMap;
    }

}
