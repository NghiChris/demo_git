package Oop.OnBt;

import java.util.Scanner;

public class XoaNguyenAm {
    public static boolean isNguyenAm(char kyTu){
        kyTu = Character.toLowerCase(kyTu);//chuyển về chữ thường để kiểm tra
        return kyTu == 'a' || kyTu == 'e' || kyTu == 'i' || kyTu == 'o' || kyTu == 'u';
    }

    public static String chuoiKhongCoNguyenAm(String input){
        String output = ""; //kết quả
        for (int i = 0; i < input.length(); i++) {
            char kyTu = input.charAt(i); //lấy ra từng ký tự trong chuỗi thông qua index
            System.out.println("Chuỗi ký tự: " + kyTu);
            if (!isNguyenAm(kyTu)) { //kiểm tra xem có phải là nguyên âm hay k
                output += kyTu; // đưa ký tự vào chuỗi nếu k phải là nguyên âm
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần xử lý: ");
        String input = scanner.nextLine();

        String output = chuoiKhongCoNguyenAm(input);
        System.out.println("Chuỗi sau khi xử lý: " + output);

    }


}
