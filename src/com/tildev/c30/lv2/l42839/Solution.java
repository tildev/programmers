package com.tildev.c30.lv2.l42839;


import java.util.HashSet;
import java.util.Set;

/**
 * 소수 찾기
 * 완전탐색
 *
 * @author tildev
 * @data 2021. 02. 03.
 */
class Solution {

    private static boolean[] isNotPrimeNumber = new boolean[10_000_000];
    private static Set<Integer> set = new HashSet<>();
    private static int maxValue = 0;

    /**
     * n 까지 만큼 소수 판별 배열을 채워 넣는다
     *
     * @param n
     */
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

    /**
     * dfs를 이용하여 순열을 만든다
     *
     * @param arr
     * @param visited
     * @param str     만들어진 문자열
     * @param r       만들어질 순열의 길이
     * @param depth   순열의 길이 체크
     */
    public static void permutationDfs(String[] arr, boolean[] visited, String str, int r, int depth) {
        if (depth == r) {
            int n = Integer.parseInt(str);
            set.add(n);
            if (maxValue < n) {
                maxValue = n;
            }
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            // 방문하지 않은 경우
            if (!visited[i]) {
                visited[i] = true;
                str += arr[i];
                permutationDfs(arr, visited, str, r, depth + 1);
                // 방문한 숫자를 지움
                str = str.substring(0, str.length() - 1);
                visited[i] = false;

            }
        }
    }

    public int solution(String numbers) {
        int len = numbers.length();
        String[] str = new String[len];

        for (int i = 0; i < len; i++) {
            str[i] = Character.toString(numbers.charAt(i));
        }

        boolean[] visited = new boolean[len];
        // 1개부터 배열 길이 만큼 순열을 만듬
        for (int i = 0; i < len; i++) {
            permutationDfs(str, visited, "", i + 1, 0);
        }

        // 가장 큰 수 만큼 소수 판별 배열을 채워 넣는다
        fillIsNotPrimeNumberArray(maxValue);
        
        int answer = 0;

        for (int setValue : set) {
            if (!isNotPrimeNumber[setValue]) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        //String numbers = "17";
        String numbers = "011";
        int answer = new Solution().solution(numbers);

        System.out.println(answer);

    }
}