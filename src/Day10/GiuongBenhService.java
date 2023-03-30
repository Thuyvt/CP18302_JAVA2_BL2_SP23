/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class GiuongBenhService {
    public String ghiFile(String path, List<GiuongBenh> danhSach) {
        try {
            // B1: Mở luồng ghi từ chương trình ra file
            FileOutputStream fos = new FileOutputStream(path);
            // B2: Mở luồng ghi file dạng đối tượng
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            // B3: ghi đối tượng vào file
            oos.writeObject(danhSach);
            
            // B4: thực hiện đóng luồng
            oos.close();
            fos.close();
            // B5: implements Serializable bên đối tượng cần lưu vào file
            return "Ghi file thành công";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Ghi file thất bại";
        }
    }
    
    public String docFile(String path, List<GiuongBenh> danhSach) {
        try {
            // B1: mở luồng đọc file từ file vào chương trình
            FileInputStream fis = new FileInputStream(path);
            // B2: mở luồng đọc file dạng đối tượng
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            // B3: đọc dữ liệu đối tượng, ghi vào là gì, thì đọc bằng loại đó
            List<GiuongBenh> dsFile = (List<GiuongBenh>) ois.readObject();
            // làm trắng lại danhSach gốc
            danhSach.clear();
            // thêm tất cả danh sách từ file vào danhSach gốc
            danhSach.addAll(dsFile);
            System.out.println("Danh Sach doc từ file" + danhSach.size());
            // B4: đóng luồng
            ois.close();
            fis.close();
            
            return "Đọc file thành công";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Đọc file thất bại";
        }
    }
}
