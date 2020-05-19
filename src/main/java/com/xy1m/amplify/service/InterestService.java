package com.xy1m.amplify.service;

import com.xy1m.amplify.model.ResultsInterest;
import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.model.resource.Interest;


public interface InterestService {
    ResultsInterest<Interest> search(Authentication auth, String term, Integer limit) throws APIException;

    ResultsInterest<Interest> getAll(Authentication auth) throws APIException;
}
