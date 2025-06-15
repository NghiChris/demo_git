package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Nhập tên học viên: ");
//        String ten = scanner.nextLine();
//        System.out.println("Nhập lớp: ");
//        String lop = scanner.nextLine();
//        System.out.println("Nhập tuổi: ");
//        int tuoi = scanner.nextInt();
//
//        System.out.println("Xin Chào: " + ten + "," + "Lớp: " + lop + "," + "tuổi " + tuoi);

//        System.out.println("Nhập tên nhân viên: ");
//        String ten = scanner.nextLine();
//        System.out.println("Nhập số ngày làm: ");
//        int days = scanner.nextInt();
//        System.out.println("Nhập số lương 1 ngày: ");
//        int daily = scanner.nextInt();
//        int tongLuong = days * daily;
//
//        System.out.println("Nhân viên: " + ten + "," + "Total: " + tongLuong);

        System.out.println("Nhập tên Sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập điểm môn học Toán: ");
        float toan = scanner.nextFloat();
        System.out.println("Nhập điểm môn học Lý: ");
        float ly = scanner.nextFloat();
        System.out.println("Nhập điểm môn học Hoá: ");
        float hoa = scanner.nextFloat();

        float dtb = (toan + ly + hoa) / 3;
        System.out.println("Sinh viên: " + name + "," + "Tổng điểm trung bình: " + dtb);

    }
}