package com.xy1m.amplify.service;

import com.google.common.base.Joiner;
import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.internal.CampaignEndpoint;
import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.model.campaign.Campaign;
import com.xy1m.amplify.model.campaign.CampaignExtraField;
import com.xy1m.amplify.model.campaign.MultipleCampaignsResponse;
import com.xy1m.amplify.model.campaign.SingleCampaignUpdateResponse;
import com.xy1m.amplify.model.reference.types.FetchType;
import com.xy1m.amplify.model.resource.GeoLocation;

import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;


public class CampaignServiceImpl implements CampaignService {

    private final CampaignEndpoint endpoint;

    public CampaignServiceImpl(CampaignEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public Campaign get(Authentication auth, String id, CampaignExtraField... extraFields) throws APIException {
        checkArgument(id != null, "Id required");
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.get(accessToken, id, CampaignExtraField.serialize(extraFields));
    }

    @Override
    public Campaign update(Authentication auth, Campaign campaign, CampaignExtraField... extraFields) throws APIException {
        checkArgument(campaign != null, "Campaign required");
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.update(accessToken, campaign.getId(), CampaignExtraField.serialize(extraFields), campaign);
    }

    @Override
    public Campaign create(Authentication auth, Campaign campaign, CampaignExtraField... extraFields) throws APIException {
        checkArgument(campaign != null, "Campaign required");
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.create(accessToken, CampaignExtraField.serialize(extraFields), campaign);
    }

    @Override
    public List<SingleCampaignUpdateResponse> batchUpdate(Authentication auth, List<Campaign> campaigns) {
        checkArgument(campaigns != null && !campaigns.isEmpty(), "Campaigns required");
        checkArgument(campaigns.size() <= 25, "Update up to 25 campaigns once");
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.batchUpdate(accessToken, null, campaigns);
    }

    @Override
    public MultipleCampaignsResponse batchGet(Authentication auth, List<String> ids, String extraFields) {
        checkArgument(ids != null && !ids.isEmpty(), "Ids required");
        checkArgument(ids.size() <= 50, "Retrieve up to 50 campaigns once");
        return endpoint.batchGet(auth.getToken().getAccessToken(), Joiner.on(",").join(ids), extraFields);
    }

    @Override
    public MultipleCampaignsResponse getByBudgetId(Authentication auth, String budgetId) {
        checkArgument(budgetId != null, "budgetId required");
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.getByBudgetId(accessToken, budgetId);
    }

    @Override
    public MultipleCampaignsResponse getByMarketerId(Authentication auth,
                                                     String marketerId,
                                                     Boolean includeArchived,
                                                     FetchType fetch,
                                                     String extraFields,
                                                     Integer limit,
                                                     Integer offset) {
        checkArgument(marketerId != null, "marketerId required");
        checkArgument(limit <= 50, "Max limit is 50");
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.getByMarketerId(accessToken, marketerId, includeArchived, fetch, extraFields, limit, offset);
    }

    @Override
    public List<GeoLocation> getGeoLocationsByCampaignId(Authentication auth, String campaignId) {
        checkArgument(campaignId != null, "campaignId required");
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.getGeoLocationsByCampaignId(accessToken, campaignId);
    }
}
