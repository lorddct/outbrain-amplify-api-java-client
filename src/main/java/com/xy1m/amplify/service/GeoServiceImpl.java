package com.xy1m.amplify.service;

import com.xy1m.amplify.internal.GeoEndpoint;
import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.model.resource.GeoLocation;

import java.util.List;

public class GeoServiceImpl implements GeoService {

    private final GeoEndpoint endpoint;

    public GeoServiceImpl(GeoEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public List<GeoLocation> search(Authentication auth, String term, Integer limit) throws APIException {
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.search(accessToken, term, limit);
    }
}
