package Oop.BaiTapChinh;

import java.util.Scanner;

public class BT2 {
    public static boolean isPalindrome(String word){
        int indexTrai = 0;
        int indexPhai = word.length() -1;

        while(indexTrai < indexPhai){
            if(word.charAt(indexTrai)!= word.charAt(indexPhai)){
                return false;
            }
            indexTrai ++;
            indexPhai --;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần kiểm tra đối xứng: ");
        String input = scanner.nextLine();

        if(isPalindrome(input)){
            System.out.println(" true => chuỗi là đối xứng ");
        }else {
            System.out.println(" false => chuỗi không phải là đối xứng ");
        }

    }
}
