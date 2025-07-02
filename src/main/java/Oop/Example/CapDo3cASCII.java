package Oop.Example;

public class CapDo3cASCII {
    public static String minWindow(String s, String t){
        if(s.length() < t.length()) return "";

        int[] target = new int[128]; //dùng bảng ASCII (0-127)
        for(char words : t.toCharArray()) target[words]++;

        int left = 0, minLen = Integer.MAX_VALUE, start = 0;
        int count = t.length();

        for(int right = 0; right < s.length(); right++){
            if(target[s.charAt(right)] > 0) count--;
            target[s.charAt(right)]--;

            while(count == 0){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }

                target[s.charAt(left)]++;
                if(target[s.charAt(left)] > 0) count++;
                left ++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("\nOutput: " + minWindow(s, t));
    }
}
