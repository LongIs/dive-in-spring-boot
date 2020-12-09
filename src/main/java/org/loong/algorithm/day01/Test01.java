package org.loong.algorithm.day01;

import java.util.Arrays;

public class Test01 {

    public static void main(String[] args) {

        //test1();
        //test2();
        //test3();
        test4();
    }

    public static void test4() {

        // 2\3\7

        // 50 33 14

        int count = 0;
        for (int i = 0; i <= (100 / 2); i++) {
            for (int j = 0; j <= ((100 - (2*i)) / 3); j++) {

                if ((100 - (2*i + 3*j)) >= 0 && (100 - (2*i + 3*j)) %7 == 0) {
                    System.out.println(2*i + "-" + j*3 + "-" + (100 - (2*i + 3*j)));
                    count++;
                }

            }
        }

        System.out.println(count);

    }

    public static void test3() {
        int[] a = {1, 3, 4, 1, 4, 4, 1, 4, 4};
        /*int count = 0;
        int max = 0;
        int curentCount = 0;

        for (int i = 0; i < a.length; i++) {
            curentCount = 0;
            for (int j = 0; j < a.length; j ++) {

                if (a[i] == a[j]) {
                    curentCount ++;
                }

            }

            if (curentCount > count) {
                count = curentCount;
                max = a[i];
            }
        }
        System.out.println(max + "-" + count);*/

        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (b[i] == a[i]) {

            }
        }

    }

    public static void test2() {
        int[] a = {9, 4, 2, 11, 111};

        for (int i = 0; i < a.length; i++) {

            if (i > a.length/2) {
                break;
            }

            int temp = a[a.length - 1 - i];
            a[a.length - 1 -i] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));

    }

    public static void test1() {
        int[] a = {9, 4, 2, 11, 111};

        int[] b = new int[5];

        for (int i = 0; i < a.length; i++) {
            b[a.length - 1 -i] = a[i];
        }
        System.out.println(Arrays.toString(b));
    }

}
