package com.example.security.Config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.security.Controller.UserDetailsServiceImpl;
import com.example.security.Config.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	@Autowired
	private UserDetailsServiceImpl userDetailsServiceImpl;

	@Autowired
	private JwtUtil jwtUtil;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String headerTokenInfo = request.getHeader("Authorization");

		String useremail = null;
		String jwtToken = null;

		if (headerTokenInfo != null && headerTokenInfo.startsWith("Bearer ")) {
			jwtToken = headerTokenInfo.substring(7);
			try {
				useremail = this.jwtUtil.extractUsername(jwtToken);
			} catch (Exception e) {
				System.out.println("User email not found..");
				e.printStackTrace();
			}
		}else {
			System.out.println("Token is invalid..");
		}
		
		if( useremail != null && SecurityContextHolder.getContext().getAuthentication() ==null ) {
			final UserDetails userDetails = userDetailsServiceImpl.loadUserByUsername(useremail);
			if(this.jwtUtil.validateToken(jwtToken, userDetails)) {
				UsernamePasswordAuthenticationToken authenticationToken = 
						new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
			authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
			
			SecurityContextHolder.getContext().setAuthentication(authenticationToken);
			}
		}else {
			System.out.println("Token is not valid");
		}
		
		filterChain.doFilter(request, response);
	}

}
