package org.example.practiceProblems.CouponSystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
    private String id;
    private String description;
    private String conditions; //JSON conditions
    private LocalDateTime validFrom;
    private LocalDateTime validTo;
    private int maxRedemptions;
    private int usedCount = 0;
}
