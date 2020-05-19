package com.xy1m.amplify.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xy1m.amplify.model.campaign.Campaign;
import com.xy1m.amplify.model.resource.InterestTargeting;

import java.util.Map;

public class InterestParsingTest {

    private static String json1 = "{\n" +
            "    \"id\": \"003fd4e9405f0d036134c35baa776fe2fa\",\n" +
            "    \"name\": \"18891/d6af42c9-6a40-42c4-b173-56e4ce907fc0_1_2\",\n" +
            "    \"enabled\": false,\n" +
            "    \"creationTime\": \"2020-05-11 11:21:00\",\n" +
            "    \"lastModified\": \"2020-05-12 08:31:24\",\n" +
            "    \"cpc\": 0.1000,\n" +
            "    \"autoArchived\": false,\n" +
            "    \"minimumCpc\": 0.03,\n" +
            "    \"currency\": \"USD\",\n" +
            "    \"targeting\": {\n" +
            "        \"platform\": [\n" +
            "            \"DESKTOP\"\n" +
            "        ],\n" +
            "        \"locations\": [\n" +
            "            {\n" +
            "                \"id\": \"ef6332561bbb44cd7311fbb4a484a7ed\",\n" +
            "                \"geoType\": \"PostalCode\",\n" +
            "                \"name\": \"54001, Amery\",\n" +
            "                \"canonicalName\": \"54001, Amery, Wisconsin, United States\",\n" +
            "                \"code\": \"54001\",\n" +
            "                \"parent\": {\n" +
            "                    \"id\": \"fc4deb5112fb4415a9edacdf4aafb0d8\",\n" +
            "                    \"geoType\": \"Country\",\n" +
            "                    \"name\": \"United States\",\n" +
            "                    \"canonicalName\": \"United States\",\n" +
            "                    \"code\": \"US\"\n" +
            "                }\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"6e6572aec162eb66f243741b4815e72c\",\n" +
            "                \"geoType\": \"PostalCode\",\n" +
            "                \"name\": \"4800-013, Guimarães\",\n" +
            "                \"canonicalName\": \"4800-013, Guimarães, Braga, Portugal\",\n" +
            "                \"code\": \"4800-013\",\n" +
            "                \"parent\": {\n" +
            "                    \"id\": \"652b70ffce4a747b8d0252320ad2b725\",\n" +
            "                    \"geoType\": \"Country\",\n" +
            "                    \"name\": \"Portugal\",\n" +
            "                    \"canonicalName\": \"Portugal\",\n" +
            "                    \"code\": \"PT\"\n" +
            "                }\n" +
            "            }\n" +
            "        ],\n" +
            "        \"language\": \"en\",\n" +
            "        \"interests\": {\n" +
            "            \"op\": \"Or\",\n" +
            "            \"interestConcepts\": [\n" +
            "                {\n" +
            "                    \"id\": \"00affd9a3a10aa177cef75137360deefc7\",\n" +
            "                    \"name\": \"Family Sedans\",\n" +
            "                    \"canBeTargeted\": true\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        \"operatingSystems\": [\n" +
            "            \"MacOs\"\n" +
            "        ],\n" +
            "        \"includeCellularNetwork\": true\n" +
            "    },\n" +
            "    \"marketerId\": \"00118e811359eaf7f8af4dcf19bef7c5d0\",\n" +
            "    \"contentType\": \"ARTICLES\",\n" +
            "    \"budget\": {\n" +
            "        \"id\": \"007704fd270eab7241bca718b845ade4da\",\n" +
            "        \"name\": \"18891/d6af42c9-6a40-42c4-b173-56e4ce907fc0_1_2\",\n" +
            "        \"shared\": false,\n" +
            "        \"amount\": 100.00,\n" +
            "        \"currency\": \"USD\",\n" +
            "        \"creationTime\": \"2020-05-11 11:20:46\",\n" +
            "        \"lastModified\": \"2020-05-11 17:41:54\",\n" +
            "        \"startDate\": \"2020-05-11\",\n" +
            "        \"endDate\": \"2020-05-15\",\n" +
            "        \"runForever\": false,\n" +
            "        \"type\": \"CAMPAIGN\",\n" +
            "        \"pacing\": \"SPEND_ASAP\"\n" +
            "    },\n" +
            "    \"suffixTrackingCode\": \"asdf\",\n" +
            "    \"prefixTrackingCode\": {},\n" +
            "    \"liveStatus\": {\n" +
            "        \"onAirReason\": \"OUTSTANDING_UNPAID_BALANCE\",\n" +
            "        \"campaignOnAir\": false,\n" +
            "        \"amountSpent\": 0.00,\n" +
            "        \"onAirModificationTime\": \"2020-05-11 11:21:01\"\n" +
            "    },\n" +
            "    \"campaignOptimization\": {\n" +
            "        \"optimizationType\": \"TRAFFIC\"\n" +
            "    },\n" +
            "    \"readonly\": false,\n" +
            "    \"blockedSites\": {},\n" +
            "    \"startHour\": \"12:00 AM\",\n" +
            "    \"trackingPixels\": {\n" +
            "        \"enabled\": true,\n" +
            "        \"urls\": [\n" +
            "            \"https://ad.doubleclick.net/ddm/trackimp/N1068.1381590INPOWERED/B23582423.266469505;dc_trk_aid=461391988;dc_trk_cid=126196116;ord=[timestamp];dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;tfua=?\"\n" +
            "        ]\n" +
            "    },\n" +
            "    \"onAirType\": \"StartHour\",\n" +
            "    \"promotedLinksSequences\": {\n" +
            "        \"enabled\": false,\n" +
            "        \"type\": \"Carousel\"\n" +
            "    },\n" +
            "    \"objective\": \"Traffic\"\n" +
            "}";


    private static String json2 = "{\n" +
            "    \"id\": \"003fd4e9405f0d036134c35baa776fe2fa\",\n" +
            "    \"name\": \"18891/d6af42c9-6a40-42c4-b173-56e4ce907fc0_1_2\",\n" +
            "    \"enabled\": false,\n" +
            "    \"creationTime\": \"2020-05-11 11:21:00\",\n" +
            "    \"lastModified\": \"2020-05-12 08:31:24\",\n" +
            "    \"cpc\": 0.1000,\n" +
            "    \"autoArchived\": false,\n" +
            "    \"minimumCpc\": 0.03,\n" +
            "    \"currency\": \"USD\",\n" +
            "    \"targeting\": {\n" +
            "        \"platform\": [\n" +
            "            \"DESKTOP\"\n" +
            "        ],\n" +
            "        \"locations\": [\n" +
            "            {\n" +
            "                \"id\": \"ef6332561bbb44cd7311fbb4a484a7ed\",\n" +
            "                \"geoType\": \"PostalCode\",\n" +
            "                \"name\": \"54001, Amery\",\n" +
            "                \"canonicalName\": \"54001, Amery, Wisconsin, United States\",\n" +
            "                \"code\": \"54001\",\n" +
            "                \"parent\": {\n" +
            "                    \"id\": \"fc4deb5112fb4415a9edacdf4aafb0d8\",\n" +
            "                    \"geoType\": \"Country\",\n" +
            "                    \"name\": \"United States\",\n" +
            "                    \"canonicalName\": \"United States\",\n" +
            "                    \"code\": \"US\"\n" +
            "                }\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"6e6572aec162eb66f243741b4815e72c\",\n" +
            "                \"geoType\": \"PostalCode\",\n" +
            "                \"name\": \"4800-013, Guimarães\",\n" +
            "                \"canonicalName\": \"4800-013, Guimarães, Braga, Portugal\",\n" +
            "                \"code\": \"4800-013\",\n" +
            "                \"parent\": {\n" +
            "                    \"id\": \"652b70ffce4a747b8d0252320ad2b725\",\n" +
            "                    \"geoType\": \"Country\",\n" +
            "                    \"name\": \"Portugal\",\n" +
            "                    \"canonicalName\": \"Portugal\",\n" +
            "                    \"code\": \"PT\"\n" +
            "                }\n" +
            "            }\n" +
            "        ],\n" +
            "        \"language\": \"en\",\n" +
            "        \"interests\": {\n" +
            "            \"op\": \"And\",\n" +
            "            \"terms\": [\n" +
            "                {\n" +
            "                    \"op\": \"Or\",\n" +
            "                    \"interestConcepts\": [\n" +
            "                        {\n" +
            "                            \"id\": \"00affd9a3a10aa177cef75137360deefc7\",\n" +
            "                            \"name\": \"Family Sedans\",\n" +
            "                            \"canBeTargeted\": true\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": \"00b0d5a3185c0617e721d4417bd77a5d7b\",\n" +
            "                            \"name\": \"Hatchbacks\",\n" +
            "                            \"canBeTargeted\": true\n" +
            "                        }\n" +
            "                    ]\n" +
            "                },\n" +
            "                {\n" +
            "                    \"op\": \"Not\",\n" +
            "                    \"terms\": [\n" +
            "                        {\n" +
            "                            \"op\": \"Or\",\n" +
            "                            \"interestConcepts\": [\n" +
            "                                {\n" +
            "                                    \"id\": \"002ce5e0bc6c7e3142cfb20f45e21bb33f\",\n" +
            "                                    \"name\": \"Allergies\",\n" +
            "                                    \"canBeTargeted\": true\n" +
            "                                },\n" +
            "                                {\n" +
            "                                    \"id\": \"003631f386d772d9f7238b4488219902bd\",\n" +
            "                                    \"name\": \"Crime\",\n" +
            "                                    \"canBeTargeted\": true\n" +
            "                                }\n" +
            "                            ]\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        \"operatingSystems\": [\n" +
            "            \"MacOs\"\n" +
            "        ],\n" +
            "        \"includeCellularNetwork\": true\n" +
            "    },\n" +
            "    \"marketerId\": \"00118e811359eaf7f8af4dcf19bef7c5d0\",\n" +
            "    \"contentType\": \"ARTICLES\",\n" +
            "    \"budget\": {\n" +
            "        \"id\": \"007704fd270eab7241bca718b845ade4da\",\n" +
            "        \"name\": \"18891/d6af42c9-6a40-42c4-b173-56e4ce907fc0_1_2\",\n" +
            "        \"shared\": false,\n" +
            "        \"amount\": 100.00,\n" +
            "        \"currency\": \"USD\",\n" +
            "        \"creationTime\": \"2020-05-11 11:20:46\",\n" +
            "        \"lastModified\": \"2020-05-11 17:41:54\",\n" +
            "        \"startDate\": \"2020-05-11\",\n" +
            "        \"endDate\": \"2020-05-15\",\n" +
            "        \"runForever\": false,\n" +
            "        \"type\": \"CAMPAIGN\",\n" +
            "        \"pacing\": \"SPEND_ASAP\"\n" +
            "    },\n" +
            "    \"suffixTrackingCode\": \"asdf\",\n" +
            "    \"prefixTrackingCode\": {},\n" +
            "    \"liveStatus\": {\n" +
            "        \"onAirReason\": \"OUTSTANDING_UNPAID_BALANCE\",\n" +
            "        \"campaignOnAir\": false,\n" +
            "        \"amountSpent\": 0.00,\n" +
            "        \"onAirModificationTime\": \"2020-05-11 11:21:01\"\n" +
            "    },\n" +
            "    \"campaignOptimization\": {\n" +
            "        \"optimizationType\": \"TRAFFIC\"\n" +
            "    },\n" +
            "    \"readonly\": false,\n" +
            "    \"blockedSites\": {},\n" +
            "    \"startHour\": \"12:00 AM\",\n" +
            "    \"trackingPixels\": {\n" +
            "        \"enabled\": true,\n" +
            "        \"urls\": [\n" +
            "            \"https://ad.doubleclick.net/ddm/trackimp/N1068.1381590INPOWERED/B23582423.266469505;dc_trk_aid=461391988;dc_trk_cid=126196116;ord=[timestamp];dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;tfua=?\"\n" +
            "        ]\n" +
            "    },\n" +
            "    \"onAirType\": \"StartHour\",\n" +
            "    \"promotedLinksSequences\": {\n" +
            "        \"enabled\": false,\n" +
            "        \"type\": \"Carousel\"\n" +
            "    },\n" +
            "    \"objective\": \"Traffic\"\n" +
            "}";

    private static String json3 = "{\n" +
            "    \"id\": \"003fd4e9405f0d036134c35baa776fe2fa\",\n" +
            "    \"name\": \"18891/d6af42c9-6a40-42c4-b173-56e4ce907fc0_1_2\",\n" +
            "    \"enabled\": false,\n" +
            "    \"creationTime\": \"2020-05-11 11:21:00\",\n" +
            "    \"lastModified\": \"2020-05-12 08:31:24\",\n" +
            "    \"cpc\": 0.1000,\n" +
            "    \"autoArchived\": false,\n" +
            "    \"minimumCpc\": 0.03,\n" +
            "    \"currency\": \"USD\",\n" +
            "    \"targeting\": {\n" +
            "        \"platform\": [\n" +
            "            \"DESKTOP\"\n" +
            "        ],\n" +
            "        \"locations\": [\n" +
            "            {\n" +
            "                \"id\": \"ef6332561bbb44cd7311fbb4a484a7ed\",\n" +
            "                \"geoType\": \"PostalCode\",\n" +
            "                \"name\": \"54001, Amery\",\n" +
            "                \"canonicalName\": \"54001, Amery, Wisconsin, United States\",\n" +
            "                \"code\": \"54001\",\n" +
            "                \"parent\": {\n" +
            "                    \"id\": \"fc4deb5112fb4415a9edacdf4aafb0d8\",\n" +
            "                    \"geoType\": \"Country\",\n" +
            "                    \"name\": \"United States\",\n" +
            "                    \"canonicalName\": \"United States\",\n" +
            "                    \"code\": \"US\"\n" +
            "                }\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"6e6572aec162eb66f243741b4815e72c\",\n" +
            "                \"geoType\": \"PostalCode\",\n" +
            "                \"name\": \"4800-013, Guimarães\",\n" +
            "                \"canonicalName\": \"4800-013, Guimarães, Braga, Portugal\",\n" +
            "                \"code\": \"4800-013\",\n" +
            "                \"parent\": {\n" +
            "                    \"id\": \"652b70ffce4a747b8d0252320ad2b725\",\n" +
            "                    \"geoType\": \"Country\",\n" +
            "                    \"name\": \"Portugal\",\n" +
            "                    \"canonicalName\": \"Portugal\",\n" +
            "                    \"code\": \"PT\"\n" +
            "                }\n" +
            "            }\n" +
            "        ],\n" +
            "        \"language\": \"en\",\n" +
            "        \"interests\": {\n" +
            "            \"op\": \"And\",\n" +
            "            \"terms\": [\n" +
            "                {\n" +
            "                    \"op\": \"Or\",\n" +
            "                    \"interestConcepts\": [\n" +
            "                        {\n" +
            "                            \"id\": \"004d6e5b27fca3b3c753c8625cfcd4306d\",\n" +
            "                            \"name\": \"Autonomous Cars\",\n" +
            "                            \"canBeTargeted\": true\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": \"00affd9a3a10aa177cef75137360deefc7\",\n" +
            "                            \"name\": \"Family Sedans\",\n" +
            "                            \"canBeTargeted\": true\n" +
            "                        }\n" +
            "                    ]\n" +
            "                },\n" +
            "                {\n" +
            "                    \"op\": \"Or\",\n" +
            "                    \"interestConcepts\": [\n" +
            "                        {\n" +
            "                            \"id\": \"000a2f1448cebd9fe6efb6a03b2abf4c59\",\n" +
            "                            \"name\": \"Home Appliances\",\n" +
            "                            \"canBeTargeted\": true\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": \"00c2bca9e9fced50c8a8d1d440601d6a6a\",\n" +
            "                            \"name\": \"Home Entertainment Systems\",\n" +
            "                            \"canBeTargeted\": true\n" +
            "                        }\n" +
            "                    ]\n" +
            "                },\n" +
            "                {\n" +
            "                    \"op\": \"Not\",\n" +
            "                    \"terms\": [\n" +
            "                        {\n" +
            "                            \"op\": \"Or\",\n" +
            "                            \"interestConcepts\": [\n" +
            "                                {\n" +
            "                                    \"id\": \"002ce5e0bc6c7e3142cfb20f45e21bb33f\",\n" +
            "                                    \"name\": \"Allergies\",\n" +
            "                                    \"canBeTargeted\": true\n" +
            "                                },\n" +
            "                                {\n" +
            "                                    \"id\": \"003631f386d772d9f7238b4488219902bd\",\n" +
            "                                    \"name\": \"Crime\",\n" +
            "                                    \"canBeTargeted\": true\n" +
            "                                }\n" +
            "                            ]\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        \"operatingSystems\": [\n" +
            "            \"MacOs\"\n" +
            "        ],\n" +
            "        \"includeCellularNetwork\": true\n" +
            "    },\n" +
            "    \"marketerId\": \"00118e811359eaf7f8af4dcf19bef7c5d0\",\n" +
            "    \"contentType\": \"ARTICLES\",\n" +
            "    \"budget\": {\n" +
            "        \"id\": \"007704fd270eab7241bca718b845ade4da\",\n" +
            "        \"name\": \"18891/d6af42c9-6a40-42c4-b173-56e4ce907fc0_1_2\",\n" +
            "        \"shared\": false,\n" +
            "        \"amount\": 100.00,\n" +
            "        \"currency\": \"USD\",\n" +
            "        \"creationTime\": \"2020-05-11 11:20:46\",\n" +
            "        \"lastModified\": \"2020-05-11 17:41:54\",\n" +
            "        \"startDate\": \"2020-05-11\",\n" +
            "        \"endDate\": \"2020-05-15\",\n" +
            "        \"runForever\": false,\n" +
            "        \"type\": \"CAMPAIGN\",\n" +
            "        \"pacing\": \"SPEND_ASAP\"\n" +
            "    },\n" +
            "    \"suffixTrackingCode\": \"asdf\",\n" +
            "    \"prefixTrackingCode\": {},\n" +
            "    \"liveStatus\": {\n" +
            "        \"onAirReason\": \"OUTSTANDING_UNPAID_BALANCE\",\n" +
            "        \"campaignOnAir\": false,\n" +
            "        \"amountSpent\": 0.00,\n" +
            "        \"onAirModificationTime\": \"2020-05-11 11:21:01\"\n" +
            "    },\n" +
            "    \"campaignOptimization\": {\n" +
            "        \"optimizationType\": \"TRAFFIC\"\n" +
            "    },\n" +
            "    \"readonly\": false,\n" +
            "    \"blockedSites\": {},\n" +
            "    \"startHour\": \"12:00 AM\",\n" +
            "    \"trackingPixels\": {\n" +
            "        \"enabled\": true,\n" +
            "        \"urls\": [\n" +
            "            \"https://ad.doubleclick.net/ddm/trackimp/N1068.1381590INPOWERED/B23582423.266469505;dc_trk_aid=461391988;dc_trk_cid=126196116;ord=[timestamp];dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;tfua=?\"\n" +
            "        ]\n" +
            "    },\n" +
            "    \"onAirType\": \"StartHour\",\n" +
            "    \"promotedLinksSequences\": {\n" +
            "        \"enabled\": false,\n" +
            "        \"type\": \"Carousel\"\n" +
            "    },\n" +
            "    \"objective\": \"Traffic\"\n" +
            "}";

    public static void main(String[] arg) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Campaign campaign = objectMapper.readValue(json3, Campaign.class);
        Map<String, Object> interestMap = campaign.getTargeting().getInterestsMap();
        InterestTargeting targeting = InterestTargeting.fromMap(interestMap);
        System.out.println(targeting);
        System.out.println(interestMap);
    }

}
