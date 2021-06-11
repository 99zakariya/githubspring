package com.example.try1.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;

@Entity
public class User {
    @Id
    @GeneratedValue
   private int uid;
   @OneToOne(cascade = CascadeType.ALL,targetEntity = SessionDetail.class)
   private SessionDetail sessId;
   @ManyToOne(cascade = CascadeType.ALL,targetEntity = MaterVehicle.class)
   @JoinColumn(name = "materVehicleRegId")
   private MaterVehicle materVehicleRegId;
   @Column(length = 100)
   private String uEmail;
   @Column(length = 15)
   private String umobile;



    public User() {
    }
    public User(SessionDetail sessId, MaterVehicle materVehicleRegId, String uEmail, String umobile) {
        this.sessId = sessId;
        this.materVehicleRegId = materVehicleRegId;
        this.uEmail = uEmail;
        this.umobile = umobile;
    }
    public MaterVehicle getMaterVehicleRegId() {
        return materVehicleRegId;
    }
    public void setMaterVehicleRegId(MaterVehicle materVehicleRegId) {
        this.materVehicleRegId = materVehicleRegId;
    }
    public String getuEmail() {
        return uEmail;
    }
    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }
    public String getUmobile() {
        return umobile;
    }
    public void setUmobile(String umobile) {
        this.umobile = umobile;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public SessionDetail getSessId() {
        return sessId;
    }
    public void setSessId(SessionDetail sessId) {
        this.sessId = sessId;
    }
    
   
}
