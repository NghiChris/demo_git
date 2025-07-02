package org.example;

import java.util.Scanner;

public class Baitap2 {

//    static int tinhTongLuong(int tongGio, int luong1Ngay){
//        int tongLuong = tongGio * luong1Ngay;
//        return tongLuong;
//    }

    static double diemTrungBinh(double diemToan, double diemLy, double diemHoa) {
        double dtb = (diemToan + diemLy + diemHoa) / 3;
        return dtb;
    }

    static String xepLoai(double dtb) {
        String result = "";
        if (0 < dtb && dtb <= 5) {
            result = "Học sinh yếu:";
        } else if (5.1 <= dtb && dtb <= 6) {
            result = "Học sinh trung bình";
        } else if (6.1 <= dtb && dtb <= 7) {
            result = "Học sinh khá";
        } else if (7.1 <= dtb && dtb <= 8) {
            result = "Học sinh giỏi";
        } else if (8.1 <= dtb && dtb <= 10) {
            result = "Học sinh xuất sắc";
        } else {
            result = "vui lòng nhập lại ";
        }
        return result;
    }

    public static void main(String[] args) {
        //viết chương trình tính lương, cho phép người dùng nhập vào số ngày làm
        //số tiền 1 ngày , tổng lương = số ngày làm * số tiền 1 ngày
        //Lưu ý tách hàm ra xử lý

        //mô hình IPO
        //input
        //giá trị từ phía người dùng nhập
        //tổng số giờ làm, số lương 1 giờ
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số giờ làm");
//        int tongGio = scanner.nextInt();
//        System.out.println("Nhập lương 1 ngày");
//        int luong1Ngay = scanner.nextInt();

        //process
        //giá trị từ người dùng nhập đi thực hiện logic yêu cầu của bài toán
        //tongLuong = tổng số giờ làm * số lương 1 giờ
//        int tongLuong = tinhTongLuong(tongGio, luong1Ngay);

        //output
        //giá trị đầu ra từ yêu cầu của đề
        //sout("...")
//        System.out.println("Lương của bạn là: " + tongLuong + "usd");

        //Viết chương trình đánh giá học sinh, cho phép nhập vào điểm toán, lý, hoá
        //tính điểm trung bình và đánh giá học sinh
        // <=5: học sinh yếu
        //5.1-6: học sinh trung bình
        //6.1-7: học sinh khá
        //7.1-8: học sinh giỏi
        //8.1-10: học sinh xuất sắc
        //Lưu ý: tách hàm tính điềm trung bình và tách hàm xếp loại

        //input
        System.out.println("Nhập điểm Toán: ");
        double toan = scanner.nextDouble();
        System.out.println("Nhập điểm Lý: ");
        double ly = scanner.nextDouble();
        System.out.println("Nhập điểm Hoá: ");
        double hoa = scanner.nextDouble();

        //process
        double dtb = diemTrungBinh(toan, ly, hoa);
        String danhGia = xepLoai(dtb);

        System.out.println("Điểm trung bình :" + dtb);
        System.out.println("Xếp loại: " + danhGia);

    }
}
