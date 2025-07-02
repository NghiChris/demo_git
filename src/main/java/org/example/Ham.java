package org.example;

public class Ham {
    //hàm được định nghĩa ở đậy
    //có 2 loại hàm
    //hàm ko có giá trị trả về (hàm thực hiện logic)
    //    static void tenHam(){}
    static void greeting(){
        System.out.println("Hello World");
    }

    //hàm có giá trị trả về
    //    static <kiểu dữ liệu> tenHam(truyền tham số){}
    static double dtb(double diemToan, double diemLy, double diemHoa) {
        double dtb = (diemToan + diemLy + diemHoa) / 3;
        return dtb;
    }
    public static void main(String[] args) {
        greeting();
        greeting();
        greeting();
        greeting();

        double diemToan = 10;
        double diemLy = 8;
        double diemHoa = 5;
        double dtb = dtb(diemToan, diemLy, diemHoa);
        System.out.println(dtb);

    }
}
