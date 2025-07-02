package Oop.Example;

import java.util.Scanner;

public class CapDo1c {
//    public static int soNguyenN() {
//        Scanner scanner = new Scanner(System.in);
//        int n;
//        do{
//            System.out.println("Vui lòng nhập vào số lớn hơn 1: ");
//            n = scanner.nextInt();
//        }while (n < 1);
//        return n;
//    }
//
//    public static int tongSoChan(int n){
//        int tong = 0;
//        for (int i = 0; i <= n ; i++) {
//            if (i % 2 == 0) {
//                tong += i;
//            }
//        }
//        return tong;
//    }
//
//    public static void xuatKQ(int tong){
//        System.out.println("Tổng các số chẵn là: " + tong);
//    }

    public static int tinhTongChan(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

//        int n = soNguyenN();
//        int ketQua = tongSoChan(n);
//        xuatKQ(ketQua);
//    }
        int n = 10;
        int ketQua = tinhTongChan(n);
        System.out.println("Tổng các số chẵn: " + n + " là: " + ketQua);

    }
}
