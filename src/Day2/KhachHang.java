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
public class KhachHang implements IServiceKhachHang {

    @Override
    public void chuyenTien() {
        System.out.println("Chuyen tien thanh cong");
    }

    @Override
    public void dangNhap() {
        System.out.println("Dang nhap thanh cong");

    }

    @Override
    public void dangKy() {
        System.out.println("Dang ky thanh cong");

    }

    @Override
    public void rutTien() {
        System.out.println("Rut tien thanh cong");

    }

}
