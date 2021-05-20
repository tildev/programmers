package com.tildev.c30.lv2.l12953;

/**
 * N개의 최소공배수
 * <p>
 * 연습문제
 *
 * @author tildev
 * @data 2021. 05. 20.
 */
public class Solution {

  // 최대공약수
  private static int getGCD(int a, int b) {
    while (b > 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  // 최소공배수
  public static int getLcm(int a, int b, int gcd) {
    return (a * b) / gcd;
  }

  public int solution(int[] arr) {
    int answer = arr[0];
        
    for (int i = 1; i < arr.length; i++) {
      answer = getLcm(answer, arr[i], getGCD(answer, arr[i]));
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] arr = {2, 6, 8, 14}; // result : 168
    int[] arr2 = {1, 2, 3}; // result : 6

    int ans = new Solution().solution(arr);
    System.out.print(ans + " ");

  }
}
