package Oop.Example;

public class CapDo1a {
    public static boolean isNguyenAm(char kyTu){
        kyTu = Character.toLowerCase(kyTu);
        return kyTu == 'a' || kyTu == 'e' || kyTu == 'i' || kyTu == 'o' || kyTu == 'u';
    }
    public static String chuoiKhongCoNguyenAm(String input){
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char kyTu = input.charAt(i);
            if(!isNguyenAm(kyTu)){
                output += kyTu;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println(chuoiKhongCoNguyenAm("Cybersoft"));
        System.out.println(chuoiKhongCoNguyenAm("Hello"));

    }
}
