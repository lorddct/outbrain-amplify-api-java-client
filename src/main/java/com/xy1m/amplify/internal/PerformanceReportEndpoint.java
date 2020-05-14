package com.xy1m.amplify.internal;

import com.xy1m.amplify.model.performance.reporting.content.PeriodicContent;
import com.xy1m.amplify.model.performance.reporting.periodic.PeriodicCampaign;
import com.xy1m.amplify.model.performance.reporting.publisher.PublisherCampaign;
import com.xy1m.amplify.model.performance.reporting.publishers.Publisher;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.Date;

public interface PerformanceReportEndpoint {

    @GET(Paths.API_PATH_PREFIX + "/reports/marketers/{id}/campaigns/periodic")
    @Headers("Content-Type: application/json")
    PeriodicCampaign getPeriodicCampaign(@Header("OB-TOKEN-V1") String accessToken,
                                         @Path("id") String id,
                                         @Query("from") Date from,
                                         @Query("to") Date to,
                                         @Query("limit") int limit,
                                         @Query("offset") int offset,
                                         @Query("breakdown") String breakdown,
                                         @Query("includeArchivedCampaigns") boolean includeArchivedCampaigns,
                                         @Query("includeConversionDetails") boolean includeConversionDetails,
                                         @Query("conversionsByClickDate") boolean conversionsByClickDate);


    @GET(Paths.API_PATH_PREFIX + "/reports/marketers/{id}/campaigns/publishers")
    @Headers("Content-Type: application/json")
    PublisherCampaign getPublisherCampaign(@Header("OB-TOKEN-V1") String accessToken,
                                           @Path("id") String id,
                                           @Query("from") Date from,
                                           @Query("to") Date to,
                                           @Query("limit") int limit,
                                           @Query("offset") int offset,
                                           @Query("includeArchivedCampaigns") boolean includeArchivedCampaigns,
                                           @Query("includeConversionDetails") boolean includeConversionDetails,
                                           @Query("conversionsByClickDate") boolean conversionsByClickDate);


    @GET(Paths.API_PATH_PREFIX + "/reports/marketers/{id}/campaigns/{campaignId}/periodicContent")
    @Headers("Content-Type: application/json")
    PeriodicContent getPeriodicContent(@Header("OB-TOKEN-V1") String accessToken,
                                       @Path("id") String id,
                                       @Path("campaignId") String campaignId,
                                       @Query("from") Date from,
                                       @Query("to") Date to,
                                       @Query("limit") int limit,
                                       @Query("offset") int offset,
                                       @Query("breakdown") String breakdown,
                                       @Query("includeConversionDetails") boolean includeConversionDetails,
                                       @Query("conversionsByClickDate") boolean conversionsByClickDate);

    @GET(Paths.API_PATH_PREFIX + "/reports/marketers/{id}/publishers")
    @Headers("Content-Type: application/json")
    Publisher getPublisher(@Header("OB-TOKEN-V1") String accessToken,
                           @Path("id") String id,
                           @Query("from") Date from,
                           @Query("to") Date to,
                           @Query("limit") int limit,
                           @Query("offset") int offset,
                           @Query("sort") String sort,
                           @Query("filter") String filter,
                           @Query("includeArchivedCampaigns") boolean includeArchivedCampaigns,
                           @Query("budgetId") String budgetId,
                           @Query("campaignId") String campaignId,
                           @Query("includeConversionDetails") boolean includeConversionDetails,
                           @Query("conversionsByClickDate") boolean conversionsByClickDate);
}
