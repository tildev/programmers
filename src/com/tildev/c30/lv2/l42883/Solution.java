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
    StringBuilder answer = new StringBuilder();

    int index = 0;
    int max = 0;
    // k 개의 수를 제거 해야 하므로,
    // 최댓값은 적어도 뒤에서 k개 앞에서는 나와야 한다
    for (int i = 0; i < number.length() - k; i++) {
      max = 0;
      for (int j = index; j <= k + i; j++) {
        if (max < number.charAt(j) - '0') {
          max = number.charAt(j) - '0';
          index = j + 1;
        }
      }
      answer.append(max);
    }
    return answer.toString();
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
