package com.interpace.accociate;

public class BorderRuleImpl implements BorderRule {
    @Override
    public String Region() {
        System.out.println("the Region Running in the BorderRuleImpl");
        return null;
    }

    @Override
    public boolean team_code() {
        System.out.println("the teamcode Running in the BorderRuleImpl");
        return false;
    }
}
