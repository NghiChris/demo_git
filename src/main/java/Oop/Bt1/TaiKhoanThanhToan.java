package Oop.Bt1;

public class TaiKhoanThanhToan extends TaiKhoan {
    //constructor
    public TaiKhoanThanhToan(String soTaiKhoan, String chuTaiKhoan, double soDu){
        super(soTaiKhoan, chuTaiKhoan, soDu);
    }

    @Override
    public double tinhLai() {
        return 0;
    }
}
