package Oop.BaiTapChinh;



public class BT5 {
    //Cách 1
    public static boolean isPalindrome(String words){
        int indexTrai = 0;
        int indexPhai = words.length() -1;

        while(indexTrai < indexPhai){
            if(words.charAt(indexTrai++) != words.charAt(indexPhai--)){
                return false;
            }
        }
        return true;
    }

    public static String longestPalindrome(String words){
        if( words == null || words.length() < 1) return "";

        String longest = "";

        for (int i = 0; i < words.length(); i++) {
            for (int j = i + 1; j <= words.length(); j++) {
                String sub = words.substring(i, j);
                if(isPalindrome(sub) && sub.length() > longest.length()){
                    longest = sub;
                }
            }
        }
        return longest;
    }

    //Cách 2
//    public static String longestPalindrome(String words){
//        int maxStart = 0, maxLen = 0;
//
//        for (int i = 0; i < words.length(); i++) {
//            int len1 = expandAroundCenter(words, i, i);
//            int len2 = expandAroundCenter(words, i, i + 1);
//            int len = Math.max(len1, len2);
//            if (len > maxLen){
//                maxLen = len;
//                maxStart = i - (len - 1) / 2;
//            }
//        }
//        return words.substring(maxStart, maxStart + maxLen);
//    }
//
//    public static int expandAroundCenter(String words, int left, int right){
//        while(left >= 0 && right < words.length()
//              && words.charAt(left) == words.charAt(right)){
//            left --;
//            right ++;
//        }
//        return right - left - 1;
//    }

    public static void main(String[] args) {

        String input = "babad";
        String result = longestPalindrome(input);
        System.out.println("\nChuỗi con đối xứng dài nhất: " + result);
    }
}
