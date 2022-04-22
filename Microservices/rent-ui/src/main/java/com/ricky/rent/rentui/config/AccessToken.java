package com.ricky.rent.rentui.config;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;

public class AccessToken {
    public static String getToken(){
        OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails)
                SecurityContextHolder.getContext().getAuthentication().getDetails();
        return details.getTokenType().concat(" ").concat(details.getTokenValue());
    }
}
