package org.example.practiceProblems.CouponSystem.service.implementation;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.practiceProblems.CouponSystem.entity.Coupon;
import org.example.practiceProblems.CouponSystem.rule.Rule;
import org.example.practiceProblems.CouponSystem.service.RuleFactory;
import org.example.practiceProblems.CouponSystem.service.RuleValidationService;

import java.io.IOException;
import java.util.Map;

public class RuleValidationServiceImpl implements RuleValidationService {
    private final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public boolean validate(Coupon coupon, Map<String, Object> context) throws IOException {
        Map<String, Object> rulesConfig = (Map<String, Object>) objectMapper.readTree(coupon.getConditions());
        for(String condition: rulesConfig.keySet()){
            Rule rule = RuleFactory.(ruleKey);
            if (rule != null && !rule.validate(context, ruleConfig)) {
                return false; // Fail if any rule is not satisfied
            }
        }
        return true;
    }
}
