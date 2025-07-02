package Oop.BT;

public abstract class NhanVien {
    //thuộc tính
    private String name;
    private int id;
    private double soGioLamViec;

    //constructor
    public NhanVien(String name, int id, double soGioLamViec){
        this.name = name;
        this.id = id;
        this.soGioLamViec = soGioLamViec;
    }

    //phương thức
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSoGioLamViec() {
        return soGioLamViec;
    }
    public abstract double tinhTongLuong();

    public void inThongTin(){
        System.out.println("Nhân Viên: " + name + "; id:" + id + "; Tổng lương: " + tinhTongLuong());
    }
}
