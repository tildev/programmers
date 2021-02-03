package com.tildev.exhaustivesearch.level2.q1;


import java.util.HashSet;
import java.util.Set;

/**
 * 소수 찾기
 *
 * @author tildev
 * @data 2021. 02. 03.
 */
class Solution {

    private static boolean[] isNotPrimeNumber = new boolean[10_000_000];
    private static Set<Integer> set = new HashSet<>();
    private static int maxValue = 0;

    private void fillIsNotPrimeNumberArray(int n) {
        isNotPrimeNumber[0] = isNotPrimeNumber[1] = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (isNotPrimeNumber[i]) {
                continue;
            }
            for (int j = i * i; j < n + 1; j += i) {
                isNotPrimeNumber[j] = true;
            }
        }
    }

    public int solution(String numbers) {

        String[] str = new String[numbers.length()];

        for (int i = 0; i < numbers.length(); i++) {
            str[i] = Character.toString(numbers.charAt(i));
        }


        int answer = 0;


        return answer;
    }

    public static void main(String[] args) {
        String numbers = "17";
        int answer = new Solution().solution(numbers);

        System.out.println(answer);

    }
}