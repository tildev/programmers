package com.tildev.exhaustivesearch.level1.q1;


import java.util.ArrayList;
import java.util.List;

/**
 * 모의고사
 *
 * @author tildev
 * @data 2021. 02. 02.
 */
class Solution {
    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int max = 0;
        int[] answer = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (supo1[i % supo1.length] == answers[i]) {
                answer[0]++;
                if (max < answer[0]) {
                    max = answer[0];
                }
            }
            if (supo2[i % supo2.length] == answers[i]) {
                answer[1]++;
                if (max < answer[1]) {
                    max = answer[1];
                }
            }
            if (supo3[i % supo3.length] == answers[i]) {
                answer[2]++;
                if (max < answer[2]) {
                    max = answer[2];
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (answer[i] == max) {
                list.add(i + 1);
            }
        }
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        //int[] answers = {1, 2, 3, 4, 5};
        int[] answers = {1, 3, 2, 4, 2};
        int[] answer = new Solution().solution(answers);
        for (int ans : answer) {
            System.out.print(ans + " ");
        }
    }
}