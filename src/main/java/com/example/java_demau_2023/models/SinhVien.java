package com.example.java_demau_2023.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sinhvien")
public class SinhVien {
    @Id
    @Column(name = "SoCMND")
    private Integer SoCMND;
    private String HoTen;
    private String Email;
    private String SoDT;
    private String DiaChi;

    public SinhVien(){}
    public SinhVien(int soCMND, String hoTen, String email, String soDT, String diaChi) {
        SoCMND = soCMND;
        HoTen = hoTen;
        Email = email;
        SoDT = soDT;
        DiaChi = diaChi;
    }

    public int getSoCMND() {
        return SoCMND;
    }

    public void setSoCMND(int soCMND) {
        SoCMND = soCMND;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String soDT) {
        SoDT = soDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }
}
