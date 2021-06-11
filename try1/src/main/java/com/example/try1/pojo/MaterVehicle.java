package com.example.try1.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
public class MaterVehicle {
    @Id
    private String veRegNo;
    @Column(length = 30)
    private String veType="Two Wheeler";
    @Column(length = 50)
    private String chassisNo;
    @Column(length = 50)
    private String engineNo;
    @Column(length = 70)
    private String owner; 
    @Temporal(TemporalType.DATE)
    private Date regDate;
    @Column(length = 40)
    private String veBrand;
    @Column(length = 40)
    private String vevariant; 
    @Column(length = 20)
    private String veColor;
    @Column(length = 50)
    private String bikeName;
    @Temporal(TemporalType.DATE)
    private Date prePolicyStartDate; 
    @Temporal(TemporalType.DATE)
    private Date prePolicyEndDate; 
    @Column(length = 60)
    private String prepolicyNo; 
    @Column(length = 40)
    private String prepolicyCompanyName;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "materVehicleRegId")
    List<User> li=new ArrayList<User>();
    public String getVeRegNo() {
        return veRegNo;
    }
    public void setVeRegNo(String veRegNo) {
        this.veRegNo = veRegNo;
    }
    public String getVeType() {
        return veType;
    }
    public void setVeType(String veType) {
        this.veType = veType;
    }
    public String getChassisNo() {
        return chassisNo;
    }
    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }
    public String getEngineNo() {
        return engineNo;
    }
    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public Date getRegDate() {
        return regDate;
    }
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
    public String getVeBrand() {
        return veBrand;
    }
    public void setVeBrand(String veBrand) {
        this.veBrand = veBrand;
    }
    public String getVevariant() {
        return vevariant;
    }
    public void setVevariant(String vevariant) {
        this.vevariant = vevariant;
    }
    public String getVeColor() {
        return veColor;
    }
    public void setVeColor(String veColor) {
        this.veColor = veColor;
    }
    public String getBikeName() {
        return bikeName;
    }
    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }
    public Date getPrePolicyStartDate() {
        return prePolicyStartDate;
    }
    public void setPrePolicyStartDate(Date prePolicyStartDate) {
        this.prePolicyStartDate = prePolicyStartDate;
    }
    public Date getPrePolicyEndDate() {
        return prePolicyEndDate;
    }
    public void setPrePolicyEndDate(Date prePolicyEndDate) {
        this.prePolicyEndDate = prePolicyEndDate;
    }
    public String getPrepolicyNo() {
        return prepolicyNo;
    }
    public void setPrepolicyNo(String prepolicyNo) {
        this.prepolicyNo = prepolicyNo;
    }
    public String getPrepolicyCompanyName() {
        return prepolicyCompanyName;
    }
    public void setPrepolicyCompanyName(String prepolicyCompanyName) {
        this.prepolicyCompanyName = prepolicyCompanyName;
    }
    public List<User> getLi() {
        return li;
    }
    public void setLi(List<User> li) {
        this.li = li;
    }
    @Override
    public String toString() {
        return "MaterVehicle [bikeName=" + bikeName + ", chassisNo=" + chassisNo + ", engineNo=" + engineNo + ", li="
                + li + ", owner=" + owner + ", prePolicyEndDate=" + prePolicyEndDate + ", prePolicyStartDate="
                + prePolicyStartDate + ", prepolicyCompanyName=" + prepolicyCompanyName + ", prepolicyNo=" + prepolicyNo
                + ", regDate=" + regDate + ", veBrand=" + veBrand + ", veColor=" + veColor + ", veRegNo=" + veRegNo
                + ", veType=" + veType + ", vevariant=" + vevariant + "]";
    }
    
    
}
