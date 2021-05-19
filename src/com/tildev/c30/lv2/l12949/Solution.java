package com.tildev.c30.lv2.l12949;

/**
 * 행렬의 곱셈
 * <p>
 * 연습문제
 *
 * @author tildev
 * @data 2021. 05. 19.
 */
public class Solution {

  public int[][] solution(int[][] arr1, int[][] arr2) {
    int resultX = arr1.length;
    int resultY = arr2[0].length;
    int resultZ = arr1[0].length; //arr2.length;
    int[][] answer = new int[resultX][resultY];
    for (int i = 0; i < resultX; i++) {
      for (int j = 0; j < resultY; j++) {
        for (int h = 0; h < resultZ; h++) {
          answer[i][j] += (arr1[i][h] * arr2[h][j]);
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
    int[][] arr2 = {{3, 3}, {3, 3}};

    int[][] resultArr = new Solution().solution(arr1, arr2);
    for (int[] result : resultArr) {
      for (int r : result) {
        System.out.print(r+ " ");
      }
      System.out.println();
    }
  }
}
