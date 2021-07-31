package com.example.internload2.internload2;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "maindata")
public class data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loadid",nullable = false)
    public Long getLoadid() {
        return loadid;
    }

    public void setLoadid(long loadid) {
        this.loadid = loadid;
    }
   @Column(name = "loadingpoint",nullable = false)
    public String getLoadingpoint() {
        return Loadingpoint;
    }

    public void setLoadingpoint(String loadingpoint) {
        Loadingpoint = loadingpoint;
    }
    @Column(name = "unloadingpoint",nullable = false)
    public String getUnloadingpoint() {
        return Unloadingpoint;
    }

    public void setUnloadingpoint(String unloadingpoint) {
        Unloadingpoint = unloadingpoint;
    }
    @Column(name = "producttype",nullable = false)
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
    @Column(name = "nooftruck",nullable = false)
    public String getNoOftruck() {
        return noOftruck;
    }

    public void setNoOftruck(String noOftruck) {
        this.noOftruck = noOftruck;
    }
    @Column(name = "weight",nullable = false)

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    @Column(name = "shipperid",nullable = false)

    public String getShipperid() {
        return shipperid;
    }

    public void setShipperid(String shipperid) {
        this.shipperid = shipperid;
    }
    @Column(name = "date",nullable = false)

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    private  Long loadid;
private String Loadingpoint;
private String Unloadingpoint;
private String productType;
private String noOftruck;
private String weight;
private String shipperid;
private String comment;
private int date;

    public data(){}

    @Override
    public String toString() {
        return "data{" +
                "loadid=" + loadid +
                ", Loadingpoint='" + Loadingpoint + '\'' +
                ", Unloadingpoint='" + Unloadingpoint + '\'' +
                ", productType='" + productType + '\'' +
                ", noOftruck='" + noOftruck + '\'' +
                ", weight='" + weight + '\'' +
                ", shipperid='" + shipperid + '\'' +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }

    public data(String comment, String loadingpoint, String unloadingpoint, String productType, String noOftruck, String weight, String shipperid, int date) {
     //   this.loadid=loadid;
        this.comment=comment;
        this.Loadingpoint = loadingpoint;
        this.Unloadingpoint = unloadingpoint;
        this.productType = productType;
        this.noOftruck = noOftruck;
        this.weight = weight;
        this.shipperid = shipperid;
        this.date = date;
    }
}
