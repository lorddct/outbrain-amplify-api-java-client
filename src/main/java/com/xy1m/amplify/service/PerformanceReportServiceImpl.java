package com.xy1m.amplify.service;

import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.internal.PerformanceReportEndpoint;
import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.model.performance_reporting.PeriodicCampaign;
import com.xy1m.amplify.model.performance_reporting.PublisherCampaign;

import java.util.Date;

public class PerformanceReportServiceImpl implements PerformanceReportService {

    private PerformanceReportEndpoint performanceReportEndpoint;

    public PerformanceReportServiceImpl(PerformanceReportEndpoint performanceReportEndpoint) {
        this.performanceReportEndpoint = performanceReportEndpoint;
    }

    @Override
    public PeriodicCampaign getPeriodicByCampaign(Authentication auth, String id, Date from, Date to, int limit, int offSet,
                                                  String breakdown, boolean includeArchivedCampaigns,
                                                  boolean includeConversionDetails, boolean conversionsByClickDate)
                                                            throws APIException {
        if(!id.isEmpty() && from != null && to != null) {
            String accessToken = auth.getToken().getAccessToken();
            return performanceReportEndpoint.getPeriodicCampaign(accessToken, id, from, to, limit, offSet, breakdown,
                    includeArchivedCampaigns, includeConversionDetails, conversionsByClickDate);
        }
        return null;
    }

    @Override
    public PublisherCampaign getPublishersByCampaign(Authentication auth, String id, Date from, Date to, int limit,
                                                     int offSet, boolean includeArchivedCampaigns,
                                                     boolean includeConversionDetails, boolean conversionsByClickDate)
                                                            throws APIException {
        if(!id.isEmpty() && from != null && to != null) {
            String accessToken = auth.getToken().getAccessToken();
            return performanceReportEndpoint.getPublisherCampaign(accessToken, id, from, to, limit, offSet,
                    includeArchivedCampaigns, includeConversionDetails, conversionsByClickDate);
        }
        return null;
    }
}
