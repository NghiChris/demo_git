package Oop;

public class NormalUser extends BaseUser{
    public NormalUser(String name, int age){
        super(name, age);
    }

    @Override
    public void showMassege() {
        System.out.println(getName() + " is a normal user");
    }
}
