package Oop;
//tính kế thừa, để admin kế thừa lại user
public class Admin extends User {
    //thuộc tính riêng của admin
//    private String name;
//    private int age;
//    private String soDT;
    private String role;

    //constructor để khởi tạo
    public Admin(String name, int age, String soDT, String role){
//        this.name = name;
//        this.age = age;
//        this.soDT = soDT;
        super(name, age, soDT); //gọi lại constructor của lớp cha (user)
        this.role = role;
    }

    //tạo phương thức đề lấy giá trị
    public String getRole() {
        return role;
    }

    //tạo phương thức để update giá trị
    public void setRole(String role) {
        this.role = role;
    }

    public void displayAdminInfo(){
        displayInfo(); //kế thừa từ lớp cha (name,age,soDT)
        System.out.println("Role: " + role);
    }
}
