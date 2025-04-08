package com.train.config;

import com.train.entity.TrainSchedule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {

    @Bean
    public TrainSchedule getInstance(){
        return new TrainSchedule();
    }
}
