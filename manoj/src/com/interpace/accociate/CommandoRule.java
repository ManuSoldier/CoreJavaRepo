package com.interpace.accociate;

public class CommandoRule {

    private BorderRule borderRule;

    public CommandoRule(BorderRule borderRule)
    {
        System.out.println("the const is running in the CommandoRule");
        this.borderRule=borderRule;
    }

    public void major()
    {
        System.out.println("ther major is runnng the commando");
        String reg=borderRule.Region();
        boolean team=borderRule.team_code();

        if(reg!=null && team)
        {
            System.out.println("there is some Rules in Border");
        }
        else
        {
            System.out.println("there is no Rules in the Border");
        }
    }

}
