package com.tildev.c30.lv2.l72412;

import java.util.*;

/**
 * 순위 검색
 * <p>
 * 2021 KAKAO BLIND RECRUITMENT
 *
 * @author tildev
 * @data 2021. 05. 27.
 */
public class Solution {
    private static final String NONE = "-";

    public void makeMap(Map<String, ArrayList<Integer>> map, String info) {
        String[] infoArr = info.split(" ");

        // 모든 경우의 수
        map.get(infoArr[0] + infoArr[1] + infoArr[2] + infoArr[3]).add(Integer.valueOf(infoArr[4]));
        map.get(NONE + infoArr[1] + infoArr[2] + infoArr[3]).add(Integer.valueOf(infoArr[4]));
        map.get(infoArr[0] + NONE + infoArr[2] + infoArr[3]).add(Integer.valueOf(infoArr[4]));
        map.get(infoArr[0] + infoArr[1] + NONE + infoArr[3]).add(Integer.valueOf(infoArr[4]));
        map.get(infoArr[0] + infoArr[1] + infoArr[2] + NONE).add(Integer.valueOf(infoArr[4]));
        map.get(NONE + NONE + infoArr[2] + infoArr[3]).add(Integer.valueOf(infoArr[4]));
        map.get(NONE + infoArr[1] + NONE + infoArr[3]).add(Integer.valueOf(infoArr[4]));
        map.get(NONE + infoArr[1] + infoArr[2] + NONE).add(Integer.valueOf(infoArr[4]));
        map.get(infoArr[0] + NONE + NONE + infoArr[3]).add(Integer.valueOf(infoArr[4]));
        map.get(infoArr[0] + NONE + infoArr[2] + NONE).add(Integer.valueOf(infoArr[4]));
        map.get(infoArr[0] + infoArr[1] + NONE + NONE).add(Integer.valueOf(infoArr[4]));
        map.get(NONE + NONE + NONE + infoArr[3]).add(Integer.valueOf(infoArr[4]));
        map.get(NONE + NONE + infoArr[2] + NONE).add(Integer.valueOf(infoArr[4]));
        map.get(NONE + infoArr[1] + NONE + NONE).add(Integer.valueOf(infoArr[4]));
        map.get(infoArr[0] + NONE + NONE + NONE).add(Integer.valueOf(infoArr[4]));
        map.get(NONE + NONE + NONE + NONE).add(Integer.valueOf(infoArr[4]));
    }

    public int[] solution(String[] info, String[] query) {
        int[] answer = {};
        Map<String, ArrayList<Integer>> map = new HashMap<>();

        for (String infoS : info) {
            makeMap(map, infoS);
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] info = {
                "java backend junior pizza 150",
                "python frontend senior chicken 210",
                "python frontend senior chicken 150",
                "cpp backend senior pizza 260",
                "java backend junior chicken 80",
                "python backend senior chicken 50"
        };

        String[] query = {
                "java and backend and junior and pizza 100",
                "python and frontend and senior and chicken 200",
                "cpp and - and senior and pizza 250",
                "- and backend and senior and - 150",
                "- and - and - and chicken 100",
                "- and - and - and - 150"
        };

        // result :  {1,1,1,1,2,4}
        int[] ans = new Solution().solution(info, query);
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}