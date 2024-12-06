package org.example.practiceProblems.CouponSystem.service;

import org.example.practiceProblems.CouponSystem.entity.Coupon;

public interface CouponService {
    Coupon createCoupon();
    void deleteCoupon(String id);
    Coupon getCoupon(String id);
}
