package org.example.practiceProblems.CouponSystem.rule;

import java.util.Map;

public class UserTransactionRule implements Rule {
    @Override
    public boolean validate(Map<String, Object> context, Map<String, Object> ruleConfig) {
        int userTransactions = (int) context.get("userTransactions");
        double totalTransactionAmount = (double) context.get("totalTransactionAmount");

        int minTransactions = (int) ruleConfig.get("minimumTransactions");
        double minTransactionAmount = (double) ruleConfig.get("minimumTransactionAmount");

        return userTransactions >= minTransactions && totalTransactionAmount >= minTransactionAmount;
    }
}

