package Oop.Bt1;

public class TaiKhoanTietKiem extends TaiKhoan {
   //thuộc tính
    private double laiSuat;

    //constructor
    public TaiKhoanTietKiem(String soTaiKhoan, String chuTaiKhoan, double soDu, double laiSuat){
        super(soTaiKhoan, chuTaiKhoan, soDu);
        this.laiSuat = laiSuat;
    }

    @Override
    public double tinhLai() {
        return getSoDu() * laiSuat;
    }
}
