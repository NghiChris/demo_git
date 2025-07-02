package org.example;

public class Mang {
    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 20;
        //khởi tạo giá trị
        int [] numbers = {10,20,30,40};
        String[] name = {"Ngân", "Thi", "Kara"};
        //                  0       1       2
        //length bắt đầu từ  1      2       3
        System.out.println(name[1]);
        name[0] = "abd";
        System.out.println(name[0]);

        //độ dài của mảng
        int length = numbers.length;
        System.out.println("Độ dài của mảng: " + length);

        //duyệt mảng dùng lặp for
//        for(int i = 0; i < name.length; i++){
//            System.out.println("Tên thứ: " + (i+1) + ": " + name[i]);
//        }
//
//        //duyệt mảng dùng lặp for-each (chỉ dùng cho mảng)
//        for(int number: numbers){
//            System.out.println(number);
//        }
//
//        //nâng cao: duyệt mảng ngược
//        for(int index = numbers.length - 1; index >= 0; index-- ){
//            System.out.println(numbers[index]);
//        }

    }
}
