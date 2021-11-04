package com.dem.demo.entityDTO;

import javax.validation.constraints.NotBlank;

public class LoginRequest {

    @NotBlank
    private String username;


    @NotBlank
    private String passowrd;

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return passowrd;
    }

    public void setPassword(String password){
        this.passowrd = password;
    }
}
