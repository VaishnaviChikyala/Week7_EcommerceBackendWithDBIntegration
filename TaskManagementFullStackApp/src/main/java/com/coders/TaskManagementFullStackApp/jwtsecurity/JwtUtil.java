package com.coders.TaskManagementFullStackApp.jwtsecurity;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
private final String SECRET = "secretkey";
public String generateTokenString1(String username) {
return Jwts.builder()
.setSubject(username)
.setIssuedAt(new Date())
.setExpiration(new Date(System.currentTimeMillis()+86400000))
.signWith(SignatureAlgorithm.HS256, SECRET)
.compact();
}
public String extractUsername(String token) {
return Jwts.parser().setSigningKey(SECRET)
.parseClaimsJws(token).getBody().getSubject();
}
public String generateToken(String username) {
	// TODO Auto-generated method stub
	return null;
}
}
