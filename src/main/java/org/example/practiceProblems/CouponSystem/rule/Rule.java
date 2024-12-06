package org.example.practiceProblems.CouponSystem.rule;

import java.util.Map;

public interface Rule {
    boolean validate(Map<String, Object> context, Map<String, Object> ruleConfig);
}
