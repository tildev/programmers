package com.tildev.c30.lv2.l42746;


import java.util.Arrays;

/**
 * 가장 큰 수
 * 정렬
 *
 * @author tildev
 * @data 2021. 02. 05.
 */
class Solution {

    public String solution(int[] numbers) {
        String[] strArr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strArr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strArr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (strArr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        String answer = new Solution().solution(numbers);

        System.out.println(answer);

    }
}