package org.example;

import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        //yêu cầu: viết chương trình tính lương cho phép người dùng nhập vào tên,
        //lương 1 ngày, tổng số ngày làm và in kết quả màn hình,
        //ví dụ: lương 1 ngày là 10đ làm 28=> 280đ
        Scanner scanner = new Scanner(System.in);
//        //ô nhập tên
//        System.out.println("Nhập tên nhân viên: ");
//        String ten = scanner.nextLine();
//
//        //ô nhập số ngày làm
//        System.out.println("Nhập ngày làm: ");
//        int days = scanner.nextInt();
//
//        //số lương 1 ngày
//        System.out.println("Nhập số lương 1 ngày: ");
//        int daily = scanner.nextInt();
//
//        //tổng lương
//        int tongLuong = days * daily;
//
//        System.out.println("Nhân viên: " + ten + "có tổng lương là "+ tongLuong );

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập tên ");
//        String ten = scanner.nextLine();
//        System.out.println("Nhập điểm toán");
//        float toan = scanner.nextFloat();
//        System.out.println("Nhập điểm lý");
//        float ly = scanner.nextFloat();
//        System.out.println("Nhập điểm hoá");
//        float hoa = scanner.nextFloat();
//
//        float dtb = (toan + ly + hoa) / 3;
//
//        System.out.println("Tên " + ten + "có điểm trung bình là " + dtb );

        System.out.println("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.println("Nhập số kw tiêu thụ: ");
        double soKw = scanner.nextDouble();
        double tienDien = 0;
        if(soKw > 0 && soKw <=50){
            tienDien = soKw * 500;
        } else if (soKw > 50 && soKw <= 100){
            tienDien = 50 * 500 + (soKw - 50)* 650;
        } else if (soKw > 100 && soKw <= 200){
            tienDien = 50 * 500 + 50 * 650 + (soKw - 100)* 850;
        } else if (soKw > 200 && soKw <= 350){
            tienDien = 50 * 500 + 50 * 650 + 100 * 850 + (soKw - 200)* 1100;
        }  else if (soKw > 350){
            tienDien = 50 * 500 + 50 * 650 + 100 * 850 + 150 * 1100 + (soKw - 350)* 1300;
        } else {
            System.out.println("vui lòng nhập lại ");
        }
        System.out.println("\n--- HOÁ ĐƠN TIỀN ĐIỆN ---");
        System.out.println("Tên khách hàng: " + name);
        System.out.println("Số Kw tiêu thụ: " + soKw + "Kw");
        System.out.println("Tổng tiền điện phải trả: " + tienDien + "vnd");

    }
}
