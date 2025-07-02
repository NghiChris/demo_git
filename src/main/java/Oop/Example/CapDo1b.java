package Oop.Example;

public class CapDo1b {
    public static int findSecondMax(int[] arr){
        if (arr.length < 2){
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr){
            if(num > max) {
                secondMax = max;
                max = num;
            }else if(num > secondMax && num < max){
                secondMax = num;
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        System.out.println(findSecondMax(new int[] {1, 3, 4, 5, 0, 2}));
        System.out.println(findSecondMax(new int[] {10, 5, 10}));
        System.out.println(findSecondMax(new int[] {3}));
    }
}
