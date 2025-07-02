package org.example;

import java.util.Scanner;

public class CauDieuKien {
    public static void main(String[] args) {
        //Câu lệnh if
        //if(điều kiện){thực hiện logic}
        //điều kiện đúng
        if(9 > 2){
            System.out.println("điều kiện đúng");
        }
        //điều kiện sai
        if(2 > 9){
            System.out.println("điều kiện đúng");
        }

        //Viết chương trình kiểm tra xem hôm nay có phải ngày đi học không?
        int day = 4;
        if(day == 4 || day == 8){
            System.out.println("Hôm nay đi học");
        }

        //câu if.. else
        //if(điều kiện){thực hiện logic} else {thực hiện logic2}

        int a = 8;
        int b = 10;
        if(a > b){
            System.out.println("số a lớn số b");
        }else {
            System.out.println("số b lớn số a");
        }
        //yêu cầu viết chương cho phép người dùng nhập vào số tuổi,
        //kiểm tra xem đã đủ tuổi học đại học chưa (>18t)

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số tuồi : ");
//        int age = scanner.nextInt();

//        if(age > 18){
//            System.out.println("Bạn đủ tuồi học Đại Học");
//        }else {
//            System.out.println("Bạn chưa đủ tuồi học Đại Học");
//        }

        //toán tử 3 ngôi -> điều kiện ? thực hiện logic 1 ; thực hiện logic 2
//        String result = (age > 18) ? "Bạn đủ tuổi học đại học" : "Bạn chưa đủ tuổi";
//        System.out.println(result);

        //if(điều kiện 1){thực hiện logic1} else if(điều kiện 2){thực hiện logic2} else{logic3}
        int c = 10;
        if(c == 10){
            System.out.println("Số 10");
        }else if (c == 11) {
            System.out.println("Số 11");
        }else if (c == 12) {
            System.out.println("Số 12");
        }else {
            System.out.println("Vui lòng nhập lại số");
        }

        //Viết chương trình kiểm tra học sinh, cho phép nhập vào điểm toán, lý, hoá
        //sau đó tính điểm trung bình, nếu điểm trung bình <5-> học sinh
        //5-6: học sinh trung bình
        //6.1-7: học sinh khá
        //7.1-8: học sinh giỏi
        //8.1-10: học sinh xuất sắc

//        System.out.println("Nhập điểm Toán: ");
//        float toan = scanner.nextFloat();
//        System.out.println("Nhập điểm Lý: ");
//        float ly = scanner.nextFloat();
//        System.out.println("Nhập điểm Hoá: ");
//        float hoa = scanner.nextFloat();
//        float dtb = (toan + ly + hoa) / 3;
//
//        if(0 > dtb && dtb <= 5){
//            System.out.println("Học sinh yếu");
//        }else if (5.1 <= dtb && dtb <= 6){
//            System.out.println("Học sinh trung bình");
//        }else if (6.1 <= dtb && dtb <= 7){
//            System.out.println("Học sinh khá");
//        }else if (7.1 <= dtb && dtb <= 8){
//            System.out.println("Học sinh giỏi");
//        }else if (8.1 <= dtb && dtb <= 10){
//            System.out.println("Học sinh xuất sắc");
//        }else {
//            System.out.println("Vui lòng nhập lại...");
//        }

//        System.out.println("Nhập tên khách hàng: ");
//        String name = scanner.nextLine();
//        System.out.println("Nhập số KW: ");
//        int kw = scanner.nextInt();
//        int tienDien = 0;
//        if(kw > 0 && kw <=50){
//            tienDien = kw * 500;
//        }else if (kw > 50 && kw <= 100){
//            tienDien = 50 * 500 + (kw - 50)* 650;
//        }else if (kw > 100 && kw <= 200){
//            tienDien = 50 * 500 + 50 * 650 + (kw - 100)* 850;
//        }else if (kw > 200 && kw <= 350){
//            tienDien = 50 * 500 + 50 * 650 + 100 * 850 + (kw - 200)* 1100;
//        }else if (kw > 350){
//            tienDien = 50 * 500 + 50 * 650 + 100 * 850 + 150 * 1100 + (kw - 350)* 1300;
//        }else {
//            System.out.println("Vui lòng nhập lại ");
//        }
//        System.out.println("Khách hàng " + name + "," + "có số tiền điện phải đóng là: " + tienDien + "vnd");

        //switch case
//        switch (giá trị đem đi so sánh){
//            case giá trị so sánh
//                    thực hiện logic
//                    break
//        }

        int d = 15;
        switch (d){
            case 5:
                System.out.println("số 5");
                break;
            case 10:
                System.out.println("số 5");
                break;
            default:
                System.out.println("Vui lòng nhập lại");
        }

        //lưu ý: nên switch case - giá so sánh là giá trị cụ thể, điều kiện đơn giản (==)



    }
}
