/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8;

import Day5.LapTop;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ThuyVT
 */
public class CollectionDemo {

    public static void main(String[] args) {
        // HashSet: Loại bỏ phần tử trùng lặp
        Set<String> setStr = new HashSet<>();
        // add(): thêm giá trị và set
        setStr.add("Java 1");
        setStr.add("Java 1");
        setStr.add("Java 2");
        setStr.add("C");
        System.out.println(setStr);
        // remove() : xóa các phần tử bằng giá trị
        setStr.remove("Java 1");
        System.out.println("Set sau khi xóa");
        System.out.println(setStr);

        // TreeSet : sắp xếp giá trị các phần tử
        Set<Integer> setInt = new TreeSet<>();
        setInt.add(19);
        setInt.add(1);
        setInt.add(5);
        setInt.add(5);
        System.out.println(setInt);

        // Lưu trữ danh sách lap top
        List<LapTop> listLap = new ArrayList<>();
        LapTop lapM2 = new LapTop("M2", 33000, "Mac", 1, false);
        listLap.add(lapM2);
        listLap.add(lapM2);
        listLap.add(new LapTop("M1", 31000, "Mac", 1, false));
        listLap.add(new LapTop("M4", 32000, "Mac", 1, false));
        listLap.add(new LapTop("M5", 30000, "Mac", 1, false));
        Set<LapTop> hashSetLap = new HashSet<>();
        // addAll():chuyển list thành hashSet
        hashSetLap.addAll(listLap);
        // for: duyệt các phần tử
        System.out.println("Danh sách lap top:");
        for (LapTop item : hashSetLap) {
            System.out.print(item.getTen() + " ");
        }
        // addAll(): chuyển list thành treeSet
        Set<LapTop> treeSetLap = new TreeSet<>();
        treeSetLap.addAll(listLap);
        System.out.println("Danh sách lap top = treeSet:");
        for (LapTop item : treeSetLap) {
            System.out.print(item.getTen() + " ");
        }

        // Map
        Map<String, String> hashMap = new HashMap<>();
        // put(): thêm dữ liệu vào map
        hashMap.put("MOB1023", "Java 2");
        hashMap.put("MOB1023", "Java 2");
        hashMap.put("MOB1014", "Java 1");
        hashMap.put("COM108", "C");
        // get(key): Lấy giá trị theo key
        System.out.println("\nMôn MOB1023 là môn:" + hashMap.get("MOB1023"));
        // keySet(): lấy ra set của tất cả các key
        Set<String> keys = hashMap.keySet();
        for (String k : keys) {
            System.out.println(hashMap.get(k) + " ");
        }
    }
}
