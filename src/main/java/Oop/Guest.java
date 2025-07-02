package Oop;
//tính đa hình: khả năng 1 đối tượng có nhiều hình thái -
// cùng 1 phương thức nhưng có thể có nhiều xử lý khác nhau
public class Guest extends User {
    private String email;

    public Guest(String name, int age, String soDT, String email){
        super(name, age, soDT);
        this.email = email;
    }

    @Override
    public void displayInfo(){
        System.out.println("Email: " + email);
    }

    @Override
    public void welcomeMassege() {
        System.out.println("Welcome Guest " + getName() + ", Limit feature access!");
    }
}
