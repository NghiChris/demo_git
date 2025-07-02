package Oop.OnBt;

import java.util.Scanner;

public class DemTuTrongChuoi {
    public static int wordCount(String input){
        //trim() xoá khoảng trắng đầu và cuối chuỗi
        // split("\\s+") chia chuỗi theo 1 hoặc nhiều khoảng trắng.
        String[] word = input.trim().split("\\s+");

        //kiểm tra rỗng
        if(input.trim().isEmpty()){
            return 0;
        }
        return word.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần đếm: ");
        String input = scanner.nextLine();

        int wordCount = wordCount(input);

        System.out.println("Số từ trong chuỗi: " + wordCount);

    }
}
