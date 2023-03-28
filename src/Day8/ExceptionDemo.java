/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập số:");
            int so = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập số thực:");
            double soThuc = Double.parseDouble(sc.nextLine());
        } catch (InputMismatchException ie) {
            System.out.println("Nhập sai định dạng dữ liệu");
        } catch (NumberFormatException nf) {
            System.out.println("Nhập sai định dạng số thực");
        } catch (Exception ex) {
            System.out.println("Bố của exception");
        } finally {
            System.out.println("Hết bài");
        }
    }
}
