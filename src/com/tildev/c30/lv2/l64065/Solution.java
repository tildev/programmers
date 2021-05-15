package com.tildev.c30.lv2.l164065;

import java.util.*;

/**
 * 튜플
 * <
 * 2019 카카오 개발자 겨울 인턴십
 *
 * @author tildev
 * @data 2021. 05. 15.
 */
class Solution {
	public int[] solution(String s) {
		// {} 모든 대괄호를 " " 공백으로 치환하여, split(" ,") 을 이용해 각 배열 요소를 뽑아낸다.
		String[] sArr = s.replaceAll("[{}]", " ").trim().split(" ,");
		int[] answer = new int[sArr.length];
		Set<Integer> set = new HashSet<Integer>();
		// 크기가 작은 배열부터 정렬
		Arrays.sort(sArr, (a, b) -> (a.length() - b.length()));
		int i = 0;
		for (String s1 : sArr) {
			for (String subS : s1.split(",")) {
				int a = Integer.parseInt(subS.trim());
				if (set.contains(a)) {
					continue;
				}
				set.add(a);
				answer[i++] = a;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		String s1 = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
		int[] arr = new Solution().solution(s1);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
