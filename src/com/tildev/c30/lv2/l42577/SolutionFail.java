package com.tildev.c30.lv2.l42577;

/**
 * 전화번호 목록
 * <p>
 * 해시
 *
 * 시간초과
 * 
 * @author tildev
 * @data 2021. 05. 13.
 */
class SolutionFail {

  public boolean solution(String[] phone_book) {
    for (int i = 0; i < phone_book.length - 1; i++) {
      for (int j = i + 1; j < phone_book.length; j++) {
        if (phone_book[i].startsWith(phone_book[j])) {
          return false;
        }
        if (phone_book[j].startsWith(phone_book[i])) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String[] phoneBook = {"119", "97674223", "1195524421"};
    String[] phoneBook1 = {"123", "456", "789"};
    String[] phoneBook2 = {"12", "123", "1235", "567", "88"};

    boolean ans = new SolutionFail().solution(phoneBook);

    System.out.println(ans);

  }
}
