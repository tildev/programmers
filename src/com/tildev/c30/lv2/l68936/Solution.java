package com.tildev.c30.lv2.l68936;

/**
 * 쿼드압축 후 개수 세기
 * <p>
 * 월간 코드 챌린지 시즌1
 *
 * @author tildev
 * @data 2021. 05. 20.
 */
public class Solution {
  public int[] solution(int[][] arr) {
    int[] answer = {};
    return answer;
  }  

  public static void main(String[] args) {
    int[][] arr = {{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}}; // result : 168

    int[] ans = new Solution().solution(arr);
    for (int a : ans) {
      System.out.print(ans + " ");
    }
  }
}
