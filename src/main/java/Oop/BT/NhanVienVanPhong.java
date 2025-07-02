package Oop.BT;

public class NhanVienVanPhong extends NhanVien {
    //constructor
    public NhanVienVanPhong(String name, int id, double soGioLamViec){
        super(name, id, soGioLamViec);
    }

    @Override
    public double tinhTongLuong() {
        return getSoGioLamViec() * 5000;
    }
}
