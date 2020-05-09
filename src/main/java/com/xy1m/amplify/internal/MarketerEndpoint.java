package com.xy1m.amplify.internal;

import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.model.budget.BudgetListResponse;
import com.xy1m.amplify.model.marketer.Marketer;
import com.xy1m.amplify.model.marketer.MarketerListResponse;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MarketerEndpoint {

    @GET(Paths.API_PATH_PREFIX + "/marketers/{marketerId}")
    @Headers("Content-Type: application/json")
    Marketer getById(@Header("OB-TOKEN-V1") String accessToken,
                     @Path("marketerId") String marketerId);

    @GET(Paths.API_PATH_PREFIX + "/marketers")
    @Headers("Content-Type: application/json")
    MarketerListResponse getAll(@Header("OB-TOKEN-V1") String accessToken) throws APIException;

    @GET(Paths.API_PATH_PREFIX + "/marketers/{marketerId}/budgets")
    @Headers("Content-Type: application/json")
    BudgetListResponse getBudgetsByMarketerId(@Header("OB-TOKEN-V1") String accessToken,
                                              @Path("marketerId") String marketerId,
                                              @Query("detachedOnly") boolean detachedOnly);

}
