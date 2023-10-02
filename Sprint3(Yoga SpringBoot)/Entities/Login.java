package com.yogawebsite.yoga.Entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {
    @Id
    private int uId;

    @Column(length = 30, nullable = false)
    private String userName;

    @Column(length = 20 , nullable=false)
    private String password;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Login(int uId, String userName, String password) {
        this.uId = uId;
        this.userName = userName;
        this.password = password;
    }

    public Login() {
    }

    
}
