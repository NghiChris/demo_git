package Oop.Bt1;

public abstract class TaiKhoan {
    //thuộc tính
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;

    //contructor
    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu){
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }

    //phương thức
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public String getChuTaiKhoan() {
        return chuTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }
    public abstract double tinhLai();

    public void hienThiThongTin(){
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.println("Chủ tài khoản: " + chuTaiKhoan);
        System.out.println("Số dư: " + soDu);
        System.out.println("Số tiền lãi: " + tinhLai());
        System.out.println("......................................");
    }
}
