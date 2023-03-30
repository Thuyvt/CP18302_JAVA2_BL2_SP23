/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.io.Serializable;

/**
 *
 * @author ThuyVT
 */
public class GiuongBenh implements Serializable {

    private String tenBn;
    private int maBn;
    private String soPhong;
    private int soGiuong;
    private String tenBs;
    private String chucVu;
    private boolean vip;
    private String khoa;
    private double tien;
    private int soNgay;

    public GiuongBenh() {
    }

    public GiuongBenh(String tenBn, int maBn, String soPhong, int soGiuong, String tenBs, String chucVu, boolean vip, String khoa, double tien, int soNgay) {
        this.tenBn = tenBn;
        this.maBn = maBn;
        this.soPhong = soPhong;
        this.soGiuong = soGiuong;
        this.tenBs = tenBs;
        this.chucVu = chucVu;
        this.vip = vip;
        this.khoa = khoa;
        this.tien = tien;
        this.soNgay = soNgay;
    }

    public String getTenBn() {
        return tenBn;
    }

    public void setTenBn(String tenBn) {
        this.tenBn = tenBn;
    }

    public int getMaBn() {
        return maBn;
    }

    public void setMaBn(int maBn) {
        this.maBn = maBn;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public int getSoGiuong() {
        return soGiuong;
    }

    public void setSoGiuong(int soGiuong) {
        this.soGiuong = soGiuong;
    }

    public String getTenBs() {
        return tenBs;
    }

    public void setTenBs(String tenBs) {
        this.tenBs = tenBs;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public void inThongTin() {
        System.out.println("Tên bệnh nhân:" + this.tenBn);
        System.out.println("Mã bệnh nhân:" + this.maBn);
        System.out.println("Số phòng:" + this.soPhong);
        System.out.println("Số giường" + this.soGiuong);
        System.out.println("Bác sĩ phụ trách:" + this.tenBs);
        System.out.println("Chức vụ: " + this.chucVu);
        System.out.println("Phòng vip:" + this.vip);
        System.out.println("Khoa:" + this.khoa);
        System.out.println("Tiền:" + this.tien);
        System.out.println("Số ngày:" + this.soNgay);
    }
    
    public double tinhTien() {
        return this.tien * this.soNgay;
    }
}
