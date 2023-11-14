package com.tsukemendog.openbankinglink.security.filter;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String tenantId = request.getParameter("testId");

        System.out.println("Once 필터");
        if (tenantId != null) {
            return;
        }
        throw new AccessDeniedException("Access denied");
    }
}
