package Oop.OnBt;

public class SecondMax {
    public static int findSecondMax(int[] arr){
        //kiểm tra số phân tử trong mảng
        if(arr.length < 2){
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        //Duyệt qua từng phân tử trong mảng
        for(int num : arr){
            if(num > max){
                secondMax = max;
                max = num;
            }else if(num > secondMax && num < max){
                //nếu num nằm giữa max và secondMax, cập nhật lại secondMax
                secondMax = num;
            }
        }
        return secondMax;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 0, 1, 2};

        System.out.println("Output " + findSecondMax(arr1));
    }
}
