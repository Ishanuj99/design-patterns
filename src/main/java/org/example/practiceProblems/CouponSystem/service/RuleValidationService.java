package org.example.practiceProblems.CouponSystem.service;

import org.example.practiceProblems.CouponSystem.entity.Coupon;

import java.io.IOException;
import java.util.Map;

public interface RuleValidationService {
    boolean validate(Coupon coupon, Map<String, Object> context) throws IOException;
}
