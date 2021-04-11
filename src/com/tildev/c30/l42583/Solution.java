package com.tildev.c30.l42583;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 다리를 지나는 트럭
 * 스택/큐
 *
 * @author tildev
 * @data 2021. 04. 11.
 */
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int bWeight = 0;
        int time = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int tw : truck_weights) {
            while (true) {
                if (q.isEmpty()) {
                    q.offer(tw);
                    bWeight += tw;
                    time++;
                    break;
                } else if (q.size() == bridge_length) {
                    bWeight -= q.poll();
                } else {
                    time++;
                    if (bWeight + tw <= weight) {
                        bWeight += tw;
                        q.add(tw);
                        break;
                    } else {
                        q.add(0);
                    }
                }
            }
        }
        return time + bridge_length;
    }

    public static void main(String[] args) {
        int bridgeLength = 2;
        int weight = 10;
        int[] truckWeights = {7, 4, 5, 6};
        int ans = new Solution().solution(bridgeLength, weight, truckWeights);

        System.out.println(ans);

    }
}
