package com.tildev.c30.lv2.l42860;


/**
 * 조이스틱
 * <p>
 * 탐욕법(Greedy)
 *
 * @author tildev
 * @data 2021. 05. 02.
 */
class Solution {

  private static final char A = 'A';
  private static final char Z = 'Z';

  public int solution(String name) {
    int nameLen = name.length();

    // 위&아래 움직임 최소 횟수
    int upAndDownMovementMinCnt = 0;
    // 좌&우 움직임 최소 횟수
    int leftAndRightMovementMinCnt = nameLen - 1;

    int upCnt, downCnt;
    for (int i = 0; i < nameLen; i++) {
      char c = name.charAt(i);
      upCnt = c - A;
      downCnt = Z - c + 1;

      upAndDownMovementMinCnt += Math.min(upCnt, downCnt);

      if (name.charAt(i) == A) {
        continue;
      }
      int nextIndex = i + 1;
      while (nextIndex < nameLen && name.charAt(nextIndex) == A) {
        nextIndex++;
      }
      
      // i = 현재위치
      // i*2 = 현재위치 + 돌아갈 거리
      // nameLen - nextIndex = 뒤에서 남은 거리
      leftAndRightMovementMinCnt = Math
          .min(leftAndRightMovementMinCnt, (i * 2 + nameLen - nextIndex));
    }
    int answer = upAndDownMovementMinCnt + leftAndRightMovementMinCnt;

    return answer;
  }

  public static void main(String[] args) {
    // String name = "JEROEN";
    String name = "JAN";
    int answer = new Solution().solution(name);

    System.out.println(answer);

  }
}