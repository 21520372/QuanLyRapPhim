/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author 21522
 */
public class Ve {
    private String maVe;
    private String maLichChieu;
    private String maKhachHang;
    private int giaVe;
    private Date thoiGianDatVe;

    public Ve() {
    }

    public Ve(String maVe, String maLichChieu, String maKhachHang, int giaVe, Date thoiGianDatVe) {
        this.maVe = maVe;
        this.maLichChieu = maLichChieu;
        this.maKhachHang = maKhachHang;
        this.giaVe = giaVe;
        this.thoiGianDatVe = thoiGianDatVe;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public String getMaLichChieu() {
        return maLichChieu;
    }

    public void setMaLichChieu(String maLichChieu) {
        this.maLichChieu = maLichChieu;
    }

    public Date getThoiGianDatVe() {
        return thoiGianDatVe;
    }

    public void setThoiGianDatVe(Date thoiGianDatVe) {
        this.thoiGianDatVe = thoiGianDatVe;
    }
    
    
    
    
}
