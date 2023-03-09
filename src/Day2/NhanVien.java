/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

/**
 *
 * @author ThuyVT
 */
public class NhanVien implements IServiceKhachHang, IServiceGDV {

    @Override
    public void chuyenTien() {
        System.out.println("Nhan vien chuyen tien");
    }

    @Override
    public void dangNhap() {
        System.out.println("Nhan vien dang nhap");
    }

    @Override
    public void dangKy() {
        System.out.println("Nhan vien dang ky");

    }

    @Override
    public void rutTien() {
        System.out.println("Nhan vien rut tien");
    }

    @Override
    public void moTaiKhoan() {
        System.out.println("Nhan vien mo tai khoan");

    }

    @Override
    public void khoaTaiKhoan() {
        System.out.println("Nhan vien khoa tai khoan");
    }

}
