package com.example.java_demau_2023.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tot_nghiep")
public class TotNghiep {
    @Id
    @Column(name = "SoCMND")
    private int SoCMND;

    private int MaTruong;

    private int MaNganh;
    private String HeTN;
    private String NgayTN;
    private String LoaiTN;

    public TotNghiep(){}

    public TotNghiep(int soCMND, int maTruong, int maNganh, String heTN, String ngayTN, String loaiTN) {
        SoCMND = soCMND;
        MaTruong = maTruong;
        MaNganh = maNganh;
        HeTN = heTN;
        NgayTN = ngayTN;
        LoaiTN = loaiTN;
    }

    public int getSoCMND() {
        return SoCMND;
    }

    public void setSoCMND(int soCMND) {
        SoCMND = soCMND;
    }

    public int getMaTruong() {
        return MaTruong;
    }

    public void setMaTruong(int maTruong) {
        MaTruong = maTruong;
    }

    public int getMaNganh() {
        return MaNganh;
    }

    public void setMaNganh(int maNganh) {
        MaNganh = maNganh;
    }

    public String getHeTN() {
        return HeTN;
    }

    public void setHeTN(String heTN) {
        HeTN = heTN;
    }

    public String getNgayTN() {
        return NgayTN;
    }

    public void setNgayTN(String ngayTN) {
        NgayTN = ngayTN;
    }

    public String getLoaiTN() {
        return LoaiTN;
    }

    public void setLoaiTN(String loaiTN) {
        LoaiTN = loaiTN;
    }
}
