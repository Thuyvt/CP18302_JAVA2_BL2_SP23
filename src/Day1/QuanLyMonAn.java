/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QuanLyMonAn {

    Scanner sc = new Scanner(System.in);

    public void nhap(List<MonAn> list) {
        int nhapTiep = 1;

        do {
            String ten = getInput("ten:");
            int gia = Integer.parseInt(getInput("gia:"));
            int soLuong = Integer.parseInt(getInput("so luong:"));
            list.add(new MonAn(ten, gia, soLuong));
            nhapTiep = Integer.parseInt(getInput(" tiep hay khong 1 - co / 2 - khong:"));
        } while (nhapTiep == 1);

    }

    public String getInput(String message) {
        System.out.println("Nhap " + message);
        return sc.nextLine();
    }

    public void xuat(List<MonAn> list) {
        if (list.isEmpty()) {
            System.out.println("Danh danh trong");
        } else {
            for (MonAn item : list) {
                System.out.println(item.toString());
            }
        }
    }

    public void tongTien(List<MonAn> list) {
        int tongTien = 0;
        if (list.isEmpty()) {
            System.out.println("Danh danh trong");
        } else {
            for (MonAn item : list) {
                  tongTien += item.getTongTien();
            }
            System.out.println("Tong tien phai tra la :" + tongTien);
        }
    }
    
    public void timMax(List<MonAn> list) {
        if (list.isEmpty()) {
            System.out.println("Danh danh trong");
        } else {
            MonAn max = list.get(0);
            for (MonAn item : list) {
                if (max.getTongTien() < item.getTongTien()) {
                    max = item;
                }
            }
            System.out.println("Mon co tong tien phai tra lon nhat la :" + max.toString());
        }
    }
    
    public void sapXep(List<MonAn> list) {
        if (list.isEmpty()) {
            System.out.println("Danh danh trong");
        } else {
            // C1
            Collections.sort(list, Comparator.comparing(MonAn::getTongTien).reversed());
            xuat(list);
            
            // C2: lamda expression
            list.sort((mon1, mon2) -> mon2.getTongTien() - mon1.getTongTien());
            xuat(list);
        }
    }
}
