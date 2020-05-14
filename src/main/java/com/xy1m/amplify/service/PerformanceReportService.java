package com.xy1m.amplify.service;

import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.model.performance.reporting.content.PeriodicContent;
import com.xy1m.amplify.model.performance.reporting.periodic.PeriodicCampaign;
import com.xy1m.amplify.model.performance.reporting.publisher.PublisherCampaign;
import com.xy1m.amplify.model.performance.reporting.publishers.Publisher;

import java.time.LocalDate;

public interface PerformanceReportService {

    PeriodicCampaign getPeriodicByCampaign(Authentication auth, String marketerId, LocalDate from, LocalDate to, int limit, int offSet,
                                           String breakdown, boolean includeArchivedCampaigns,
                                           boolean includeConversionDetails, boolean conversionsByClickDate) throws APIException;

    PublisherCampaign getPublishersByCampaign(Authentication auth, String marketerId, LocalDate from, LocalDate to, int limit, int offSet,
                                              boolean includeArchivedCampaigns, boolean includeConversionDetails,
                                              boolean conversionsByClickDate) throws APIException;

    PeriodicContent getPeriodicContent(Authentication auth, String marketerId, String campaignId, LocalDate from, LocalDate to, int limit,
                                       int offset, String breakdown, boolean includeConversionDetails,
                                       boolean conversionsByClickDate) throws APIException;

    Publisher getPublisher(Authentication auth, String marketerId, LocalDate from, LocalDate to, int limit, int offset, String sort,
                           String filter, boolean includeArchivedCampaigns, String budgetId, String campaignId,
                           boolean includeConversionDetails, boolean conversionsByClickDate) throws APIException;
}
