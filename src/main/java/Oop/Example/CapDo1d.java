package Oop.Example;

import java.util.Scanner;

public class CapDo1d {
    public static int demSoTu(String chuoi){
        //Xóa khoảng trắng đầu vs cuối, sau đó tách chuỗi theo dấu cách
        if(chuoi == null || chuoi.trim().isEmpty()){
            return 0;
        }
        //tách theo 1 hoặc nhiều dấu cách
        String[] tu = chuoi.trim().split("\\s+");
        return tu.length;
    }

    public static void main(String[] args) {
        String chuoi = "Xin chào các bạn";
        int soTu = demSoTu(chuoi);
        System.out.println("Số từ trong chuỗi là: " + soTu);
    }
}
