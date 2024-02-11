package com.example.configuration.filter;

import com.example.model.request.UserDTO;
import com.example.util.JwtUtil;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;
import io.jsonwebtoken.ExpiredJwtException;
import java.io.IOException;


public class JwtRequestFilter extends OncePerRequestFilter {

    private JwtUtil jwtUtil;

    private final String TOKEN_PREFIX = "Bearer ";
    private final String HEADER_STRING = "Authorization";

    public JwtRequestFilter() {
        jwtUtil = new JwtUtil();
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, jakarta.servlet.FilterChain chain) throws ServletException, IOException {
        final String authorizationHeader = request.getHeader(HEADER_STRING);

        UserDTO  userData  = null;
        String jwtToken = null;


        if (authorizationHeader != null && authorizationHeader.startsWith(TOKEN_PREFIX)) {
            jwtToken = authorizationHeader.substring(TOKEN_PREFIX.length());
            System.out.println("Check Data : "+jwtToken);
            try {
                System.out.println("Check Data 2 : "+jwtUtil.extractUser(jwtToken));
                userData = new Gson().fromJson(jwtUtil.extractUser(jwtToken), UserDTO.class);
                System.out.println("Check Data 3 : "+userData.toString());
            } catch (ExpiredJwtException e) {
                // Handle token expiration
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                response.getWriter().write("Token expired");
                response.getWriter().flush();
                return;
            }
        }

        if (userData != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            // Validate the token and set up the authentication in SecurityContextHolder
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                    userData, null, null);
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        }
        chain.doFilter(request, response);
    }
}


