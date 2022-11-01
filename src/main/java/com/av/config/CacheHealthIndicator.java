package com.av.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class CacheHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        long result = checkSomething();
        if (result <= 50) {
            return Health.down().withDetail("Random <= 50", result).build();
        }
        return Health.up().build();
    }

    private long checkSomething() {
        return ThreadLocalRandom.current().nextInt(1, 100);
    }


}
