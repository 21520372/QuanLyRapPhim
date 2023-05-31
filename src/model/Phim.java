/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalTime;
/**
 *
 * @author 21522
 */
public class Phim {
    private String maPhim;
    private String tenPhim;
    private String theLoai;
    private String daoDien;
    private LocalTime ThoiLuong;
    private int namSanXuat;

    public Phim() {
    }

    public Phim(String maPhim, String tenPhim, String theLoai, String daoDien, LocalTime ThoiLuong, int namSanXuat) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.theLoai = theLoai;
        this.daoDien = daoDien;
        this.ThoiLuong = ThoiLuong;
        this.namSanXuat = namSanXuat;
    }

    public String getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getDaoDien() {
        return daoDien;
    }

    public void setDaoDien(String daoDien) {
        this.daoDien = daoDien;
    }

    public LocalTime getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(LocalTime ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }
    
    
    
}
