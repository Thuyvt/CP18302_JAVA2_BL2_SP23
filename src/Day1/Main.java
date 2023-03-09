/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MonAn> list = new ArrayList<>();
        QuanLyMonAn ql = new QuanLyMonAn();
        System.out.println("==========MENU========");
        System.out.println("1.Nhap");
        System.out.println("2.Xuat");
        System.out.println("3.Tinh tong");
        System.out.println("4.Tim max");
        System.out.println("5.Sap xep");
        System.out.println("6.Ke thua");

        String menu = sc.nextLine();
        switch (menu) {
            case "1" -> {
                ql.nhap(list);
                break;
            }
            case "2" -> {
                ql.xuat(list);
                break;
            }
            case "3" -> {
                ql.tongTien(list);
                break;
            }
            case "4" -> {
                ql.timMax(list);
                break;
            }
            case "5" -> {
                ql.sapXep(list);
                break;
            }
            case "6" -> {
                ql.keThua(list);
                break;
            }
        }

    }
}
