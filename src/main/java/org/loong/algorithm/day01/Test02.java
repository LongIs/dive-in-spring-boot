package org.loong.algorithm.day01;

public class Test02 {


    public static void main(String[] args) {

        // System.out.println(test1(new int[]{1, 2, 3, 4, 6, 4, 7, 4, 4, 4, 4, 1, 4, 1, 3, 2}, 4));
        System.out.println(test2(new int[]{1, 2, 6, 7, 8}, 5));
    }

    public static int test2(int[] nums, int val) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                return i;
            }

            if (nums[i] > val) {
                return i;
            }
        }


        return 1;
    }

    public static int test1 (int[] nums, int val) {

        int i = nums.length;
        int x = 0;

        for (x = 0; x < i; x ++) {

            if (nums[x] == val) {
                nums[x] = nums[i - 1];
                i --;
                x --;
                continue;
            }
            //x ++;
        }
        return x;

    }

}
