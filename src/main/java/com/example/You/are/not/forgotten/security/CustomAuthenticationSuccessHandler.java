package com.example.You.are.not.forgotten.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {

        if (authentication.getAuthorities().contains((new SimpleGrantedAuthority("ROLE_BANNED")))){

            response.sendRedirect(request.getContextPath() + "/banned");
        }
        else{
            response.sendRedirect(request.getContextPath() + "/index");
        }
    }
}
