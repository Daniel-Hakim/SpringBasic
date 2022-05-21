package com.example.springfundamental.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class PeopleHealthIndicator implements HealthIndicator {
    private final String message_key="PeopleService";

    @Override
    public Health health() {
        if (!isRunningServicePeopleService()) {
            return Health.down().withDetail(message_key, "NOT available").build();
        }
        return Health.up().withDetail(message_key, "available").build();
    }

    private Boolean isRunningServicePeopleService() {
        Boolean isRunning=false;
        //add real logic people service is running(skipped demo)
        return isRunning;
    }


}
