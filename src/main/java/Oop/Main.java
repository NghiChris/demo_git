package Oop;

public class Main {
    public static void main(String[] args) {
        //tạo ra 1 đối tượng là user
        User user = new User("Quyên",18,"0971234556");
        user.displayInfo();
        user.welcomeMassege();

        user.setName("Ngân");
        user.setAge(30);
        user.displayInfo();

        //tạo ra 1 đối tượng là admin
        Admin admin = new Admin("Vy",28,"0912244765","ADMIN");
        admin.displayAdminInfo();

        Guest guest = new Guest("Phương",20,"2334654765867","phuong@gmail.com");
        guest.displayInfo();
        guest.welcomeMassege();

        BaseUser user1 = new NormalUser("Vân",22);
        user1.showMassege();
    }
}
