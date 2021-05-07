package com.tildev.c30.lv2.l42626;

import java.util.PriorityQueue;

/**
 * 더 맵게
 * <p>
 * 힙(Heap)
 *
 * @author tildev
 * @data 2021. 05. 05.
 */
class Solution {

  public int solution(int[] scoville, int K) {
    int answer = 0;
    PriorityQueue<Integer> sQueue = new PriorityQueue<>();

    for (int s : scoville) {
      sQueue.offer(s);
    }

    while (sQueue.peek() < K) {
      // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return
      if (sQueue.size() == 1) {
        return -1;
      }
      int a = sQueue.poll();
      int b = sQueue.poll();

      sQueue.offer(a + b * 2);
      answer += 1;
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] scoville = {1, 2, 3, 9, 10, 12};
    int k = 7;
    int ans = new Solution().solution(scoville, k);

    System.out.println(ans);

  }
}
