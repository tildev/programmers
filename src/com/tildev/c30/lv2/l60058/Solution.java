package com.tildev.c30.lv2.l60058;

/**
 * 괄호 변환 2020 KAKAO BLIND RECRUITMENT
 *
 * @author tildev
 * @data 2021. 05. 01.
 */
class Solution {

  /**
   * 첫번째와 마지막 문자 제거한 후 나머지 문자열의 괄호 방향을 뒤집는다.
   *
   * @param s
   * @return
   */
  private String removeTheFirstAndLastCharAndReversTheString(String s) {
    StringBuilder sb = new StringBuilder();

    char[] cArr = s.toCharArray();

    for (int i = 1; i < cArr.length - 1; i++) {
      if (cArr[i] == '(') {
        sb.append(")");
      } else if (cArr[i] == ')') {
        sb.append("(");
      }
    }
    return sb.toString();
  }

  public String makeUStringAndVString(String p) {

    //공백일 경우 "" 리턴
    if (p.equals("")) {
      return "";
    }

    String u = "";
    String v = "";

    // Are The Parentheses Valid
    boolean isValid = true;
    // Open Parenthesis ('(') Count
    int openPCnt = 0;
    // Close Parenthesis (')') Count
    int closePCnt = 0;

    for (int i = 0; i < p.length(); i++) {
      if (p.charAt(i) == '(') {
        openPCnt += 1;
      } else if (p.charAt(i) == ')') {
        closePCnt += 1;

        // 닫는 괄호의 갯수가 더 많다는 것은 유효하지 않은 괄호임을 의미
        if (openPCnt < closePCnt) {
          isValid = false;
        }
      }

      // 균형이 잡혀 있는 괄호일 때
      if (openPCnt == closePCnt) {
        u = p.substring(0, i + 1);
        v = p.substring(i + 1);
        break;
      }
    }
    // 유효한 괄호일 경우
    if (isValid) {
      return u + makeUStringAndVString(v);

    } else {
      StringBuilder sb = new StringBuilder("(");
      sb.append(makeUStringAndVString(v));
      sb.append(")");

      return sb.append(removeTheFirstAndLastCharAndReversTheString(u)).toString();
    }
  }

  public String solution(String p) {
    String answer = makeUStringAndVString(p);
    return answer;
  }

  public static void main(String[] args) {
    String p = "";
    String p1 = "(()())()";
    String p2 = ")(";
    String p3 = "()))((()";

    System.out.println(new Solution().solution(p));
  }
}
