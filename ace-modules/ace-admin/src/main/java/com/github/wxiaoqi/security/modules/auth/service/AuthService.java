package com.github.wxiaoqi.security.modules.auth.service;


import com.github.wxiaoqi.security.modules.auth.util.user.JwtAuthenticationRequest;

public interface AuthService {
    String login(JwtAuthenticationRequest authenticationRequest) throws Exception;
    String refresh(String oldToken) throws Exception;
    void validate(String token) throws Exception;
}
