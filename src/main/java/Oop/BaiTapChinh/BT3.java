package Oop.BaiTapChinh;

import java.util.HashMap;
import java.util.Scanner;

public class BT3 {
    public static String xoaKyTuLapLai(String kyTu){
        HashMap<Character, Boolean> seen = new HashMap<>();
        // cách 1
//        StringBuilder result = new StringBuilder();
        //StringBuilder là một lớp trong Java dùng để xử lý chuỗi ký tự một cách hiệu quả
        //khi thực hiện nhiều thao tác nối (append), chỉnh sửa, xóa, chèn chuỗi.
        //new StringBuilder() tạo ra một đối tượng StringBuilder rỗng (chưa có nội dung gì).

//        for (char c : kyTu.toCharArray()) {
        // .toCharArray() chuyển chuỗi thành mảng các ký tự (char[]) để dễ lặp.
        // VD: "hello" → ['h', 'e', 'l', 'l', 'o']
//            if (!seen.containsKey(c)){
//                seen.put(c, true); // đánh dấu đã gặp ký tự
//                result.append(c); // thêm vào kết quả
//            }
//        }
//        return result.toString();

        //Cách 2
//        String result = "";
//        for (int i = 0; i < kyTu.length(); i++) {
//            char c = kyTu.charAt(i);
//            if(!seen.containsKey(c)){
//                seen.put(c,true); // đánh dấu đã gặp ký tự
//                result += c; // thêm vào kết quả
//            }
//        }
//        return result;

        //Cách 3
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < kyTu.length(); i++) {
            char c = kyTu.charAt(i);
            if(!seen.containsKey(c)){
                seen.put(c,true);
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String result = xoaKyTuLapLai(input);
        System.out.println("Chuỗi sau khi xoá ký tự lặp lại: " + result);

    }
}
