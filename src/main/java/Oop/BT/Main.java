package Oop.BT;

public class Main {
    public static void main(String[] args) {
        //yêu cầu: viết chương trình tính lương nhân viên.
        //Biết nhân viên văn phòng = soGioLam * 5000;
        //nhân viên sản xuất = soGioLam * 2000

        //pub abstract nhanvien{} //thuộc tính
        //2 phương thức in thông tin (abstract tinh luong)

        NhanVienVanPhong nv1 = new NhanVienVanPhong("Như",23,100);
        nv1.inThongTin();

        NhanVienSanXuat nv2 = new NhanVienSanXuat("Liễu",3,150);
        nv2.inThongTin();
    }
}
