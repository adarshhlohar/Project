package com.yogawebsite.yoga.Configuration;

import java.io.IOException;

import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtFilter extends GenericFilterBean{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
                final HttpServletRequest request2=(HttpServletRequest) request;
                final HttpServletResponse response2= (HttpServletResponse) response;
                final String authHeader = request2.getHeader("authorization"); 

                if ("OPTIONS".equals(request2.getMethod())) {
                    response2.setStatus(HttpServletResponse.SC_OK);
                    chain.doFilter(request2, response2);
                }else{
                    if (authHeader == null || !authHeader.startsWith("Bearer ")) {
                        throw new ServletException("Missing or Invalid Authrization header");
                    }
                    final String token = authHeader.substring(7);
                    try {
                        final Claims claims = Jwts.parser().setSigningKey("secretkey").parseClaimsJws(token).getBody();
                        request2.setAttribute("claims", claims);
                    } catch (final Exception e) {
                        throw new ServletException("Invalid token");
                    }
                    chain.doFilter(request, response);
                }
    }
    
}
