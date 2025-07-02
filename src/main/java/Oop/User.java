package Oop;
//tính đóng gói
public class User {
    //thuộc tính
    private String name;
    private int age;
    private String soDT;

    //constructor dùng để khởi tạo name, age, soDT
    public User(String name, int age, String soDT){
        this.name = name; // con trỏ this
        this.age = age;
        this.soDT = soDT;
    }

    //phương thức
    //getter vs setter
    //tạo phương thức public để lấy giá trị
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSoDT() {
        return soDT;
    }

    //tạo phương thức đề update giá trị
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    //tạo phương thức để hiển thị thông tin người dùng
    public void displayInfo(){
        System.out.println("Username: " + name + "; Age: " + age + "; Phone number: " + soDT);
    }

    public void welcomeMassege(){
        System.out.println("Welcome: " + name + ", Thanks for being a user! ");
    }
}

