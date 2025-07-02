package Oop.BaiTapChinh;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Nhập thu nhập hàng năm (triệu đồng): ");
//        double thuNhap = scanner.nextDouble();
//        double thue = 0;
//
//        if(thuNhap < 0){
//            System.out.println("Thu nhập không hợp lệ !");
//        }else if (thuNhap <= 5){
//            thue = thuNhap * 0.05;
//        }else if (thuNhap <= 10){
//            thue = thuNhap * 0.10;
//        }else if (thuNhap <= 18){
//            thue = thuNhap * 0.15;
//        }else if (thuNhap <= 32){
//            thue = thuNhap * 0.20;
//        }else if (thuNhap <= 52){
//            thue = thuNhap * 0.25;
//        }else if (thuNhap <= 80){
//            thue = thuNhap * 0.30;
//        }else {
//            thue = thuNhap * 0.35;
//        }
//        if (thuNhap >=0 ){
//            System.out.println("Số tiền thuế phải trả là: " + thue + " triệu đồng");
//        }
//
//        scanner.close();



        double thuNhapChiuThue = 0;

        System.out.println("Thu nhập năm : ");
        double thuNhapNam = scanner.nextLong();

        if(thuNhapNam <= 0){
            System.out.println("Thu nhập không hợp lệ !");
        } else if(thuNhapNam <= 5000000) {
            thuNhapChiuThue = thuNhapNam * 0.05;
        } else if(thuNhapNam <= 10000000) {
            thuNhapChiuThue = thuNhapNam * 0.10;
        } else if(thuNhapNam <= 18000000) {
            thuNhapChiuThue = thuNhapNam * 0.15;
        } else if(thuNhapNam <= 32000000) {
            thuNhapChiuThue = thuNhapNam * 0.20;
        } else if(thuNhapNam <= 52000000) {
            thuNhapChiuThue = thuNhapNam * 0.25;
        } else if(thuNhapNam <= 80000000) {
            thuNhapChiuThue = thuNhapNam * 0.30;
        } else {
            thuNhapChiuThue = thuNhapNam * 0.35;
        }

        System.out.printf("Số tiền thuế phải trả là: %.3f vnđ", thuNhapChiuThue);
    }
}
