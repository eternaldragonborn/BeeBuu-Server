package com.example.beebuuserver.Model;

public class Token {
    private String Token;
    private Boolean isServerToken;

    public Token() {
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public Boolean getServerToken() {
        return isServerToken;
    }

    public void setServerToken(Boolean serverToken) {
        isServerToken = serverToken;
    }

    public Token(String token, Boolean isServerToken) {
        Token = token;
        this.isServerToken = isServerToken;
    }
}
