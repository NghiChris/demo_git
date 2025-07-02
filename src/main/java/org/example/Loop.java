package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");

        //vòng lặp while
        //giá trị ban đầu
//        while(điều kiện){
//            thực hiện logic
//            thay đổi giá trị ban đầu
//        }

        //Yêu cầu: in ra 5 dòng hello world
//        int i = 1; //giá trị ban đầu
//        while (i <= 5){ //điều kiện thực hiện vòng lặp
//            System.out.println("Hello Testing 05"); //thực hiện yêu cầu
//            i++; //i = i + 1 hoặc i += 1 thay đổi giá trị ban đầu
//        }

        //yêu cầu viết chương trình cho phép người dùng số n, in ra giao diện n lần dòng Hello Testing 05
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vô số lần: ");
//        int soLan = scanner.nextInt();
//
//        int lan = 1;
//        while(lan <= soLan){
//            System.out.println("Hello Testing 05");
//            lan++;
//        }

        //vòng lập do ... while
//        giá trị ban đầu
//        do {
//            thực hiện logic
//
//            làm thay đổi giá trị ban đầu
//        }while(điều kiện)

//        int index = 1;
//        do{
//            System.out.println("Giá trị i: " + index);
//            index++;
//        }while(index <=10);

        //vòng lập for
        //for(giá trị khởi tạo; điều kiện; cập nhật lại giá trị khởi tạo)
//        for(int j = 1; j <=8; j++){
//            System.out.println("Giá trị j: " + j);
//        }

        //Bài tập 1: viết chương trình cho phép người dùng nhập vào số n
        //Tính tổng số từ 1 đến N
        System.out.println("Nhập vào số lần: ");
        int n1 = scanner.nextInt();
        int tong1 = 0;
        for(int i = 0; i <= n1; i++ ){
            tong1 += i;
        }
        System.out.println("Total number: " + tong1);

        //Bài tập 2: Viết chương trình cho phép người dùng nhập số n
        //Tính tổng số chẵn từ 0 đến n
        System.out.println("Nhập vào số lần: ");
        int n2 = scanner.nextInt();
        int tong2 = 0;
        for(int k = 0; k <= n2; k++ ){
            if(k % 2 == 0) {
                tong2 += k;
            }
        }
        System.out.println("Total number: " + tong2);

        //tổng chẵn
        for(int k = 0; k <=n2; k +=2 ){
            tong2 += k;
        }

        //chia hết cho 3 => for(int k = 3; k <= n; k +=3){}
        System.out.println("tổng n = " + tong2);

    }
}
