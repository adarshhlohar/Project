package com.yogawebsite.yoga.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "YogaStudent")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int yId;

    @NotBlank(message="The first name should not be blank")
    private String firstName;

    @NotBlank(message="The last name should not be blank")
    private String lastName;

    @NotBlank(message = "The UserName Should not be blank")
    @Column(unique = true)
    private String userName;

    @NotNull(message = "The mobile no should not be null")
    private long mobileNo;

    @NotBlank(message = "passWord should not be blank")
    private String passWord;

    @NotBlank(message = "Confirm passWord should not be blank")
    private String confirmPassWord;

    public int getyId() {
        return yId;
    }

    public void setyId(int yId) {
        this.yId = yId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getConfirmPassWord() {
        return confirmPassWord;
    }

    public void setConfirmPassWord(String confirmPassWord) {
        this.confirmPassWord = confirmPassWord;
    }

    public User(int yId, String firstName, String lastName, String userName, long mobileNo, String passWord,
            String confirmPassWord) {
        this.yId = yId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.mobileNo = mobileNo;
        this.passWord = passWord;
        this.confirmPassWord = confirmPassWord;
    }

    
    public User() {
    }

    

}
