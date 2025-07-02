package Oop.BaiTapChinh;

public class BT4 {
    public static int[] towSum(int[] numbers, int target){
        int left = 0;
        int right = numbers.length -1;

        while (left < right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                // chỉ số bắt đầu từ 1 theo yêu cầu đề bài
                return new int[]{left + 1, right + 1};
            }else if(sum < target){
                left ++; //Tăng bên trái đề tổng lớn hơn
            }else {
                right --; //Giảm bên phải để tổng nhỏ hơn
            }
        }
        return new int[]{-1, -1}; // không tìm thấy (trường hợp ko có đáp án)
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = towSum(numbers,target);

        System.out.println("\n Output: [" + result[0] + ", " + result[1] + "]");
    }
}
