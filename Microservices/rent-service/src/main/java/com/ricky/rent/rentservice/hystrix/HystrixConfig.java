package com.ricky.rent.rentservice.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HystrixConfig {
    @Autowired
    Environment environment;

    @Bean
    public HystrixCommand.Setter config() {
        HystrixCommand.Setter config = HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory
                .asKey("rentcloud"));
        HystrixCommandProperties.Setter commandProperties = HystrixCommandProperties.Setter();
        String timeout = environment.toString();
        if(timeout==null)
            timeout="500";
        commandProperties.withExecutionTimeoutInMilliseconds(Integer.parseInt(timeout));
        config.andCommandPropertiesDefaults(commandProperties);
        return config;
    }
}
