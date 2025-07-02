package Oop.OnBt;

import java.util.Scanner;

public class FirstLetter {
    public static String getFirstLetter(String input){
        String[] words = input.trim().split("\\s+");

        //kiểm tra rỗng
        if(input.trim().isEmpty()){
            return ""; //trả về chuỗi rỗng nếu ko có nội dung
        }
        String result = "";
        for(String word:words){
            result += word.charAt(0); //lấy ký tự đầu của chuỗi và thêm khoảng cách
        }
        return result.toUpperCase();
//        return result;
    }

    //split("\\s+"): tách chuỗi thành các từ bằng khoảng trắng.
    //charAt(0): lấy ký tự đầu tiên của từng từ.
    //Character.toUpperCase(): đảm bảo in hoa chữ cái đầu.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần tách: ");
        String input = scanner.nextLine();

        String result = getFirstLetter(input);

        System.out.println("Kết quả: " + result);
    }
}
