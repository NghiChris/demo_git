package Oop.Example;

import java.util.Scanner;

public class CapDo1e {
    public static String inChuCaiDau(String chuoi){
        if(chuoi == null || chuoi.trim().isEmpty()){
            return "";
        }

        String[] tu = chuoi.trim().split("\\s+");
        StringBuilder ketQua = new StringBuilder();

        for(String t:tu){
            if(!t.isEmpty()){
                ketQua.append(t.charAt(0)).append(" ");
            }
        }

        //loại bỏ khoảng trống cuối cùng
        return ketQua.toString().trim();
    }
    public static void main(String[] args) {
//        String input1 = "Xin Chào Các Bạn";
//        String input2 = "Hello World";
//
//        System.out.println(inChuCaiDau(input1));
//        System.out.println(inChuCaiDau(input2));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần tách: ");
        String input = scanner.nextLine();

        String result = inChuCaiDau(input);

        System.out.println("Kết quả: " + result);
    }
}
