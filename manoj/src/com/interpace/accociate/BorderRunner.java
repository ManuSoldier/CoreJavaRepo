package com.interpace.accociate;

public class BorderRunner {

    public static void main(String[] args)
    {
        System.out.println("the main in running the borderRunner");
        BorderRule borderRule=new BorderRuleImpl();

        CommandoRule commandoRule=new CommandoRule(borderRule);
        commandoRule.major();

    }
}
