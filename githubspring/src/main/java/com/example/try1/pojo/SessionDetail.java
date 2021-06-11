package com.example.try1.pojo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SessionDetail {
    @Id
    @GeneratedValue()
    private long id;
    @Column(length=50)
    private String sessinonId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(length=200)
    private String userAgent;
    @Column(length=30)
    private String ipAddress;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "sessId")
    User reg;
   
    public SessionDetail(){}
    public SessionDetail(String sessinonId, Date timeStamp, String userAgent, String ipAddress) {
        this.sessinonId = sessinonId;
        this.timeStamp = timeStamp;
        this.userAgent = userAgent;
        this.ipAddress = ipAddress;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getSessinonId() {
        return sessinonId;
    }
    public void setSessinonId(String sessinonId) {
        this.sessinonId = sessinonId;
    }
    public Date getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getUserAgent() {
        return userAgent;
    }
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
    public String getIpAddress() {
        return ipAddress;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    @Override
    public String toString() {
        return "sessionDetails [id=" + id + ", ipAddress=" + ipAddress + ", sessinonId=" + sessinonId + ", timeStamp="
                + timeStamp + ", userAgent=" + userAgent + "]";
    }
    
    
}
