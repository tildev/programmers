package com.tildev.c30.lv2.l42885;

import java.util.Arrays;

/**
 * 구명보트
 * <p>
 * 탐욕법(Greedy)
 *
 * @author tildev
 * @data 2021. 05. 13.
 */
class Solution {

  public int solution(int[] people, int limit) {
    int answer = 0;

    Arrays.sort(people);
    int startIndex = 0;
    int endIndex = people.length - 1;

    while (true) {
      if (people[startIndex] + people[endIndex] <= limit) {
        startIndex += 1;
      }
      endIndex -= 1;
      answer += 1;
      if (endIndex < startIndex) {
        break;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] people = {70, 50, 80, 50};
    int[] people1 = {70, 80, 50};
    int limit = 100;

    int ans = new Solution().solution(people, limit);

    System.out.println(ans);

  }
}
