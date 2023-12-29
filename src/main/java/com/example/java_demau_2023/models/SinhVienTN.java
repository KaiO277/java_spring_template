package com.example.java_demau_2023.models;


public class SinhVienTN {
    private int SoCMND;
    private int MaTruong;
    private int MaNganh;
    private String HeTN;
    private String NgayTN;
    private String LoaiTN;
    private String HoTen;
    private String Email;
    private String SoDT;
    private String DiaChi;

    public SinhVienTN(){}

    public SinhVienTN(int soCMND, int maTruong, int maNganh, String heTN, String ngayTN, String loaiTN, String hoTen, String email, String soDT, String diaChi) {
        SoCMND = soCMND;
        MaTruong = maTruong;
        MaNganh = maNganh;
        HeTN = heTN;
        NgayTN = ngayTN;
        LoaiTN = loaiTN;
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
