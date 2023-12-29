package com.example.java_demau_2023.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "truong")
public class Truong {
    @Id
    @Column(name = "MaTruong")
    private int MaTruong;
    private String TenTruong;
    private String diachi;
    private String SoDT;

    public Truong(){}

    public Truong(int maTruong, String tenTruong, String diachi, String soDT) {
        MaTruong = maTruong;
        TenTruong = tenTruong;
        this.diachi = diachi;
        SoDT = soDT;
    }

    public int getMaTruong() {
        return MaTruong;
    }

    public void setMaTruong(int maTruong) {
        MaTruong = maTruong;
    }

    public String getTenTruong() {
        return TenTruong;
    }

    public void setTenTruong(String tenTruong) {
        TenTruong = tenTruong;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String soDT) {
        SoDT = soDT;
    }
}
