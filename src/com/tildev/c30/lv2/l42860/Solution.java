package com.tildev.c30.lv2.l42860;


/**
 * 조이스틱
 * <p>
 * 탐욕법(Greedy)
 *
 * @author tildev
 * @data 2021. 05. 02.
 */

/**
 * fail case
 *
 * 좌 우 고려시, 한 방향으로의 이동만을 고려했으나,
 * ABCDAAAAAAAAAAAAAEE 의 경우,
 * 우측으로 진행하다 AAA... 를 만났을 때
 * 좌측으로 되돌아가 EE를 처리하는 것이 최소 이동 횟수를 가질 수 있다.
 */
class Solution_FAIL {

  private static final char A = 'A';
  private static final char Z = 'Z';

  public int getLeftAndRightMovementMinCnt(char[] cNameArr) {
    int sumCnt = 0;
    int sumReversCnt = 0;
    for (int i = 1; i < cNameArr.length - 1; i++) {
      if (cNameArr[i] == 'A') {
        sumCnt++;
      } else {
        break;
      }
    }

    for (int i = cNameArr.length - 1; i > 0; i--) {
      if (cNameArr[i] == 'A') {
        sumReversCnt++;
      } else {
        break;
      }
    }
    if (sumCnt > sumReversCnt) {
      return cNameArr.length - sumCnt - 1;
    } else {
      return cNameArr.length - sumReversCnt - 1;
    }
  }


  public int getUpAndDownMovementMinCnt(char[] cNameArr) {
    int totalCnt = 0;
    int frontCnt, behindCnt;
    for (char c : cNameArr) {
      frontCnt = c - A;
      behindCnt = Z - c + 1;

      if (frontCnt > behindCnt) {
        totalCnt += behindCnt;
      } else {
        totalCnt += frontCnt;
      }
    }
    return totalCnt;
  }


  // Up and down
  // Right and left
  public int solution(String name) {
    int answer = 0;

    char[] cNameArr = name.toCharArray();

    answer += getLeftAndRightMovementMinCnt(cNameArr);
    answer += getUpAndDownMovementMinCnt(cNameArr);

    return answer;
  }

  public static void main(String[] args) {
    // String name = "JEROEN";
    String name = "JAN";
    int answer = new Solution_FAIL().solution(name);

    System.out.println(answer);

  }
}