package com.tildev.sort.level1.q1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * K번째수
 *
 * @author tildev
 * @data 2021. 02. 01.
 */
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list;
        for (int i = 0; i < commands.length; i++) {
            list = new ArrayList<>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }
            list.sort(Comparator.naturalOrder());

            answer[i] = list.get(commands[i][2] - 1);
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new Solution().solution(array, commands);
        for (int ans : answer) {
            System.out.print(ans + " ");
        }
    }
}