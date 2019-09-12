package com.boarding.serverAPI.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Logindata {

    @Id
    private ObjectId _id;
    private String username;
    private String password;
    private boolean loginStatus;
    private String email;

    public Logindata(ObjectId _id, String username, String password, boolean loginStatus, String email){
        this._id=_id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.loginStatus=loginStatus;

    }

    public String  get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }
}
