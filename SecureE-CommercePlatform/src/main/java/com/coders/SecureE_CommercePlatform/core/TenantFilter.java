package com.coders.SecureE_CommercePlatform.core;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class TenantFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain)
            throws ServletException, IOException {

        String tenant = request.getHeader("X-Tenant-ID");
        if (tenant == null) {
            response.sendError(HttpStatus.BAD_REQUEST.value(),
                "Tenant ID missing");
            return;
        }

        TenantContext.setTenant(tenant);
        chain.doFilter(request, response);
        TenantContext.clear();
    }
}

