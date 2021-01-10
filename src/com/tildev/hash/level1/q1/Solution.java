package com.tildev.hash.level1.q1;


import java.util.Arrays;

/**
 * 완주하지 못한 선수
 *
 * @author tildev
 * @data 2020. 01. 10.
 */
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }


    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        new Solution().solution(participant, completion);
    }
}