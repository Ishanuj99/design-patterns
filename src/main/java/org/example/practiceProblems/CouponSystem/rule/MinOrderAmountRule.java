package org.example.practiceProblems.CouponSystem.rule;

import java.util.Map;

public class MinOrderAmountRule implements Rule{
    @Override
    public boolean validate(Map<String, Object> context, Map<String, Object> ruleConfig) {
        double orderAmount = (double) context.getOrDefault("orderAmount", 0);
        double minOrderAmount = (double) context.getOrDefault("MinOrderAmount", 0);
        return orderAmount>=minOrderAmount;
    }
}
