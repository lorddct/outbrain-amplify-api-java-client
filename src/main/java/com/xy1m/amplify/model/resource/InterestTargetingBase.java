package com.xy1m.amplify.model.resource;

import java.util.ArrayList;
import java.util.List;

abstract class InterestTargetingBase {

    List<Interest> basic;
    List<Interest> and;
    List<Interest> not;

    public List<Interest> getBasic() {
        return basic;
    }

    public void setBasic(List<Interest> basic) {
        this.basic = basic;
    }

    public void addBasicCondition(Interest interest) {
        if (this.basic == null) {
            this.basic = new ArrayList<>();
        }
        this.basic.add(interest);
    }

    public List<Interest> getAnd() {
        return and;
    }

    public void setAnd(List<Interest> and) {
        this.and = and;
    }

    public void addAndCondition(Interest interest) {
        if (this.and == null) {
            this.and = new ArrayList<>();
        }
        this.and.add(interest);
    }

    public List<Interest> getNot() {
        return not;
    }

    public void setNot(List<Interest> not) {
        this.not = not;
    }

    public void addNotCondition(Interest interest) {
        if (this.not == null) {
            this.not = new ArrayList<>();
        }
        this.not.add(interest);
    }

}
