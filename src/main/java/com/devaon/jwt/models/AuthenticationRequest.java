package com.devaon.jwt.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by qwone4@gmail.com on 2020-05-12
 * Blog : http://aonee.tistory.com
 * Github : http://github.com/devAon
 */
@Getter
@Setter
public class AuthenticationRequest {
    private String username;
    private String password;
    private String token;

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String username, String password , String token) {
        this.username = username;
        this.password = password;
        this.token = token;
    }
}
