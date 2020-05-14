package com.xy1m.amplify.service;

import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.internal.PerformanceReportEndpoint;
import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.model.performance.reporting.content.PeriodicContent;
import com.xy1m.amplify.model.performance.reporting.periodic.PeriodicCampaign;
import com.xy1m.amplify.model.performance.reporting.publisher.PublisherCampaign;
import com.xy1m.amplify.model.performance.reporting.publishers.Publisher;

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

    @Override
    public PeriodicContent getPeriodicContent(Authentication auth, String id, String campaignId, Date from, Date to,
                                              int limit, int offset, String breakdown, boolean includeConversionDetails,
                                              boolean conversionsByClickDate) throws APIException {

        if (!id.isEmpty() && !campaignId.isEmpty() && from != null && to != null) {
            String accessToken = auth.getToken().getAccessToken();
            return performanceReportEndpoint.getPeriodicContent(accessToken, id, campaignId, from, to, limit, offset,
                    breakdown, includeConversionDetails, conversionsByClickDate);
        }
        return null;
    }

    @Override
    public Publisher getPublisher(Authentication auth, String id, Date from, Date to, int limit, int offset,
                                  String sort, String filter, boolean includeArchivedCampaigns, String budgetId,
                                  String campaignId, boolean includeConversionDetails, boolean conversionsByClickDate)
                                                throws APIException {

        if (!id.isEmpty() && from != null && to != null) {
            String accessToken = auth.getToken().getAccessToken();
            return performanceReportEndpoint.getPublisher(accessToken, id, from, to, limit, offset, sort, filter,
                    includeArchivedCampaigns, budgetId, campaignId, includeConversionDetails, conversionsByClickDate);
        }
        return null;
    }


}
