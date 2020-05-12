package com.xy1m.amplify.model.campaign;

public enum CampaignExtraField {

    CustomAudience,
    Locations,
    InterestsTargeting,
    BidBySections,
    BlockedSites,
    PlatformTargeting,
    CampaignOptimization,
    Scheduling;

    public static boolean isValid(String extraField) {
        for (CampaignExtraField field : values()) {
            if (field.name().equals(extraField)) {
                return true;
            }
        }
        return false;
    }

    public static String serialize(CampaignExtraField[] extraFields) {
        if (extraFields != null) {
            String separator = "";
            StringBuilder sb = new StringBuilder();
            for (CampaignExtraField field : extraFields) {
                sb.append(separator).append(field.name());
                separator = ",";
            }
            return sb.toString();
        }
        return null;
    }

}
