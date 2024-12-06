package org.example.practiceProblems.CouponSystem.service.implementation;

import org.example.practiceProblems.CouponSystem.rule.MinOrderAmountRule;
import org.example.practiceProblems.CouponSystem.rule.Rule;
import org.example.practiceProblems.CouponSystem.rule.UserSegmentRule;
import org.example.practiceProblems.CouponSystem.rule.UserTransactionRule;
import org.example.practiceProblems.CouponSystem.service.RuleFactory;

import java.util.HashMap;
import java.util.Map;

public class RuleFactoryImpl implements RuleFactory {
    public static final Map<String, Rule> RuleRegistry = new HashMap<>();

    static{
        RuleRegistry.put("userSegmentRule", new UserSegmentRule());
        RuleRegistry.put("userTransaction", new UserTransactionRule());
        RuleRegistry.put("minOrderAmountRule", new MinOrderAmountRule());
    }

    public static Rule getRule(String ruleKey){
        return RuleRegistry.get(ruleKey);
    }
}
