package com.yogawebsite.yoga.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "TrainerDetail")
public class Trainer {
    
    @Id
    private int  tId;

    @NotBlank(message = "Trainer Name Should not be Blank")
    private String tName;


    @NotBlank(message = "Trainer period Should not be Blank")
    private String tDuration;

    @NotBlank(message = "Trainer period Should not be Blank")
    private String tTime;

    @NotNull(message = "Trainer Mobile No should not be Blank")
    private long tMobileNo;

    public Trainer(int tId, String tName,String tDuration,String tTime,long tMobileNo) {
        this.tId = tId;
        this.tName = tName;
        this.tDuration = tDuration;
        this.tTime = tTime;
        this.tMobileNo = tMobileNo;
    }

    public Trainer() {
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettDuration() {
        return tDuration;
    }

    public void settDuration(String tDuration) {
        this.tDuration = tDuration;
    }

    public String gettTime() {
        return tTime;
    }

    public void settTime(String tTime) {
        this.tTime = tTime;
    }

    public long gettMobileNo() {
        return tMobileNo;
    }

    public void settMobileNo(long tMobileNo) {
        this.tMobileNo = tMobileNo;
    }


    

    
}
