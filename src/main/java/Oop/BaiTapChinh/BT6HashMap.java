package Oop.BaiTapChinh;

import java.util.HashMap;
import java.util.Map;

public class BT6HashMap {
    public static String minWindow(String s, String t){
        // Cách 1
//        if(s.length() == 0 || t.length() == 0) return "";
//
//        HashMap<Character, Integer> mapT = new HashMap<>();
//        HashMap<Character, Integer> windowCounts = new HashMap<>();
//
//        for(char c : t.toCharArray()){
//            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
//        }
//
//        int left = 0, right = 0;
//        int required = mapT.size();
//        int formed = 0;
//        int[] ans = {-1, 0, 0};
//
//        while(right < s.length()){
//            char c = s.charAt(right);
//            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);
//
//            if(mapT.containsKey(c) && windowCounts.get(c).intValue() == mapT.get(c).intValue()){
//                formed ++;
//            }
//
//            while(left <= right && formed == required){
//                c = s.charAt(left);
//                if(ans[0] == -1 || right - left + 1 < ans[0]){
//                    ans[0] = right - left + 1;
//                    ans[1] = left;
//                    ans[2] = right;
//                }
//
//                windowCounts.put(c, windowCounts.get(c) - 1);
//                if(mapT.containsKey(c) && windowCounts.get(c).intValue() < mapT.get(c).intValue()){
//                    formed --;
//                }
//                left ++;
//            }
//            right ++;
//        }
//        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);

        // Cách 2
//        if (s.length() < t.length()) return "";
//
//        //đếm ký tự cần có trong
//        HashMap<Character, Integer> mapT = new HashMap<>();
//        HashMap<Character, Integer> window = new HashMap<>();
//        for(char word : t.toCharArray()){
//            mapT.put(word, mapT.getOrDefault(word, 0) + 1);
//        }
//
//        //duyệt chuỗi s với 2 con trỏ
//        int left = 0, count = 0;
//        int minLen = Integer.MAX_VALUE, start = 0;
//
//        for(int right = 0; right < s.length(); right ++){
//            char word = s.charAt(right);
//            window.put(word, window.getOrDefault(word,0) + 1);
//
//            if(mapT.containsKey(word) && window.get(word).intValue() <= mapT.get(word).intValue()){
//                count ++;
//            }
//
//            //khi cửa sổ hiển tại đã chứa đủ tất cả ký tự của t
//            while(count == t.length()){
//                if(right - left + 1 < minLen){
//                    minLen = right - left + 1;
//                    start = left;
//                }
//
//                //thu nhỏ cửa số từ
//                char leftWord = s.charAt(left);
//                window.put(leftWord, window.get(leftWord) - 1);
//                if (mapT.containsKey(leftWord) && window.get(leftWord).intValue() < mapT.get(leftWord).intValue()){
//                    count --;
//                }
//                left ++;
//            }
//        }
//        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);

        //Cách 3
        if(s.length() < t.length()) return "";

        Map<Character, Integer> need = new HashMap<>();
        for(char word : t.toCharArray()) need.put(word, need.getOrDefault(word,0) + 1);

        int left = 0, matched = 0, minLen = Integer.MAX_VALUE, start = 0;
        Map<Character, Integer> window = new HashMap<>();

        for(int right = 0; right < s.length(); right ++){
            char word = s.charAt(right);
            window.put(word, window.getOrDefault(word,0) + 1);

            if(need.containsKey(word) && window.get(word).intValue() <= need.get(word).intValue()) matched ++;

            while(matched == t.length()){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }

                char kyTu = s.charAt(left ++);
                window.put(kyTu, window.get(kyTu) - 1);
                if(need.containsKey(kyTu) && window.get(kyTu).intValue() < need.get(kyTu).intValue()) matched --;
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
