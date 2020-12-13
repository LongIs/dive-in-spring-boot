package org.loong.algorithm.recursion;

public class Testo1 {


    public static void main(String[] args) {
        System.out.println(sum(new int[]{5, 5, 5, 5}, 0));
    }

    public static int sum(int[] i, int index) {
        if (i.length == index) {
            return 0;
        }

        return i[index] + sum(i, index + 1);

    }



}
