package com.xy1m.amplify.service;

import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.model.budget.BudgetListResponse;
import com.xy1m.amplify.model.marketer.Marketer;
import com.xy1m.amplify.model.marketer.MarketerListResponse;

public interface MarketerService {

    Marketer get(Authentication auth, String marketerId, String extraFields) throws APIException;

    MarketerListResponse getAll(Authentication auth, String extraFields) throws APIException;

    BudgetListResponse getBudgets(Authentication auth, String marketerId, boolean detachedOnly, String extraFields) throws APIException;

}
