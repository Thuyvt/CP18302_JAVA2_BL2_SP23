/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class LapTopService {

    // Kiểm tra string có chứa ký tự và số
    public boolean isChuoi(String str) {
        return str.matches("[a-z A-Z 0-9]+");
    }

    // Kiểm tra số nguyên
    public boolean isSoNguyen(String str) {
        return str.matches("\\d+");
    }

    // Kiểm tra số thực
    public boolean isSoThuc(String str) {
        return str.matches("\\d+(\\.\\d+)?");
    }

    // tìm kiếm
    // toLowerCase(): biến chuỗi thành viết thường
    // toUpperCase(): biến chuỗi thành viết hoa
    // startWiths(): chuỗi bắt đầu bằng ký tự ...
    // endWiths(): chuỗi kết thúc bằng ký tự ...
    // contains(): chuỗi có chứa ký tự ...
    // subString(): cắt chuỗi từ ... đến ...
    public List<LapTop> timByTenVaGia(List<LapTop> dsGoc, String ten) {
        List<LapTop> dsTim = new ArrayList<>();
        for (LapTop lt : dsGoc) {
            if (lt.getTen().toLowerCase().contains(ten.toLowerCase())) {
                dsTim.add(lt);
            }
        }
        return dsTim;
    }

    // sắp xếp hang
    public void sapXep(List<LapTop> dsGoc) {
        // sắp xếp giảm
        dsGoc.sort(Comparator.comparing(LapTop::getHang).reversed());
        // sắp xếp tăng
//        dsGoc.sort(Comparator.comparing(LapTop::getHang));

    }
}
