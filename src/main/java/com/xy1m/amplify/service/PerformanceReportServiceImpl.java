package com.xy1m.amplify.service;

import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.internal.PerformanceReportEndpoint;
import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.model.performance.reporting.content.PeriodicContent;
import com.xy1m.amplify.model.performance.reporting.periodic.PeriodicCampaign;
import com.xy1m.amplify.model.performance.reporting.publisher.PublisherCampaign;
import com.xy1m.amplify.model.performance.reporting.publishers.Publisher;

import java.time.LocalDate;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class PerformanceReportServiceImpl implements PerformanceReportService {

    private PerformanceReportEndpoint performanceReportEndpoint;

    public PerformanceReportServiceImpl(PerformanceReportEndpoint performanceReportEndpoint) {
        this.performanceReportEndpoint = performanceReportEndpoint;
    }

    @Override
    public PeriodicCampaign getPeriodicByCampaign(Authentication auth,
                                                  String marketerId,
                                                  LocalDate from,
                                                  LocalDate to,
                                                  int limit,
                                                  int offSet,
                                                  String breakdown,
                                                  boolean includeArchivedCampaigns,
                                                  boolean includeConversionDetails,
                                                  boolean conversionsByClickDate) throws APIException {
        checkNotNull(auth);
        checkNotNull(marketerId);
        checkNotNull(from);
        checkNotNull(to);
        checkArgument(!from.isAfter(to));

        String accessToken = auth.getToken().getAccessToken();
        return performanceReportEndpoint.getPeriodicCampaign(
                accessToken,
                marketerId,
                from.toString(),
                to.toString(),
                limit,
                offSet,
                breakdown,
                includeArchivedCampaigns,
                includeConversionDetails,
                conversionsByClickDate);
    }

    @Override
    public PublisherCampaign getPublishersByCampaign(Authentication auth,
                                                     String marketerId,
                                                     LocalDate from,
                                                     LocalDate to,
                                                     int limit,
                                                     int offSet,
                                                     boolean includeArchivedCampaigns,
                                                     boolean includeConversionDetails,
                                                     boolean conversionsByClickDate) throws APIException {

        checkNotNull(auth);
        checkNotNull(marketerId);
        checkNotNull(from);
        checkNotNull(to);
        checkArgument(!from.isAfter(to));

        String accessToken = auth.getToken().getAccessToken();
        return performanceReportEndpoint.getPublisherCampaign(
                accessToken,
                marketerId,
                from.toString(),
                to.toString(),
                limit,
                offSet,
                includeArchivedCampaigns,
                includeConversionDetails,
                conversionsByClickDate);
    }

    @Override
    public PeriodicContent getPeriodicContent(Authentication auth,
                                              String marketerId,
                                              String campaignId,
                                              LocalDate from,
                                              LocalDate to,
                                              int limit,
                                              int offset,
                                              String breakdown,
                                              boolean includeConversionDetails,
                                              boolean conversionsByClickDate) throws APIException {

        checkNotNull(auth);
        checkNotNull(marketerId);
        checkNotNull(from);
        checkNotNull(to);
        checkArgument(!from.isAfter(to));

        String accessToken = auth.getToken().getAccessToken();
        return performanceReportEndpoint.getPeriodicContent(
                accessToken,
                marketerId,
                campaignId,
                from.toString(),
                to.toString(),
                limit,
                offset,
                breakdown,
                includeConversionDetails,
                conversionsByClickDate);
    }

    @Override
    public Publisher getPublisher(Authentication auth,
                                  String marketerId,
                                  LocalDate from,
                                  LocalDate to,
                                  int limit,
                                  int offset,
                                  String sort,
                                  String filter,
                                  boolean includeArchivedCampaigns,
                                  String budgetId,
                                  String campaignId,
                                  boolean includeConversionDetails,
                                  boolean conversionsByClickDate) throws APIException {

        checkNotNull(auth);
        checkNotNull(marketerId);
        checkNotNull(from);
        checkNotNull(to);
        checkArgument(!from.isAfter(to));

        String accessToken = auth.getToken().getAccessToken();
        return performanceReportEndpoint.getPublisher(
                accessToken,
                marketerId,
                from.toString(),
                to.toString(),
                limit,
                offset,
                sort,
                filter,
                includeArchivedCampaigns,
                budgetId,
                campaignId,
                includeConversionDetails,
                conversionsByClickDate);
    }

}
