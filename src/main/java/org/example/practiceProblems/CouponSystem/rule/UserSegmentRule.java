package org.example.practiceProblems.CouponSystem.rule;

import java.util.Map;

public class UserSegmentRule implements Rule{
    @Override
    public boolean validate(Map<String, Object> context, Map<String, Object> ruleConfig) {
        String userSegment = (String) context.get("userSegment");
        String allowedSegment = (String) ruleConfig.get("allowedSegment");
        return allowedSegment.equals(userSegment);
    }
}
