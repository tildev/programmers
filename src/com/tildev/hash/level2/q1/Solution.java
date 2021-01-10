package com.tildev.hash.level2.q1;


/**
 * 전화번호 목록 - phone_book
 *
 * @author tildev
 * @data 2020. 01. 10.
 */
class Solution {
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

        System.out.println(new Solution().solution(phoneBook2));
    }
}