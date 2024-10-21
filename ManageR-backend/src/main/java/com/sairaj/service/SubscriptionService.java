package com.sairaj.service;

import com.sairaj.domain.PlanType;
import com.sairaj.model.Subscription;
import com.sairaj.model.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
