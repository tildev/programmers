package com.tildev.c30.lv2.l42883;

/**
 * 큰 수 만들기
 * <p>
 * 탐욕법(Greedy)
 *
 * @author tildev
 * @data 2021. 05. 08.
 */
class Solution {

  public String solution(String number, int k) {
    String answer = "";
    return answer;
  }

  public static void main(String[] args) {
    String number = "1924";
    int k = 2;
    // "94"

    String number1 = "1231234";
    int k1 = 3;
    // "3234"

    String number2 = "4177252841";
    int k2 = 4;
    // "775841"

    String ans = new Solution().solution(number, k);

    System.out.println(ans);

  }
}
