package com.example.firebase_login_register_example;

public class UserAccount {
    private String email_id;
    private String pw;
    private String idToken; // Firebase Uid (고유 토큰 정보)

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public UserAccount(){}

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
