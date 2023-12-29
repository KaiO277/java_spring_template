package com.example.java_demau_2023.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nganh")
public class Nganh {
    @Id
    @Column(name = "MaNganh")
    private int MaNganh;
    private String TenNganh;
    private String LoaiNganh;

    public Nganh(){}

    public Nganh(int maNganh, String tenNganh, String loaiNganh) {
        MaNganh = maNganh;
        TenNganh = tenNganh;
        LoaiNganh = loaiNganh;
    }

    public int getMaNganh() {
        return MaNganh;
    }

    public void setMaNganh(int maNganh) {
        MaNganh = maNganh;
    }

    public String getTenNganh() {
        return TenNganh;
    }

    public void setTenNganh(String tenNganh) {
        TenNganh = tenNganh;
    }

    public String getLoaiNganh() {
        return LoaiNganh;
    }

    public void setLoaiNganh(String loaiNganh) {
        LoaiNganh = loaiNganh;
    }
}
