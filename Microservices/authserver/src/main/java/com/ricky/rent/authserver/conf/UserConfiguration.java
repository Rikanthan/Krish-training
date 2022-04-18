package com.ricky.rent.authserver.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {
    PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Override
    public void init(AuthenticationManagerBuilder builder) throws Exception{
        builder
                .inMemoryAuthentication()
                .withUser("ricky")
                .password(passwordEncoder.encode("rickypassword"))
                .roles("USER","ADMIN","MANAGER")
                .authorities("READ","WRITE","UPDATE","DELETE").and()
                .withUser("rohit")
                .password(passwordEncoder.encode("rohitpassword"))
                .roles("USER")
                .authorities("READ","WRITE");
    }
}
