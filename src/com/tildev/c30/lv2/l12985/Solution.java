package com.tildev.c30.lv2.l12985;

/**
 * 예상 대진표
 * <p>
 * 2017 팁스타운
 * <p>
 * a 와 b 가 같은 그룹이 되면 된다. 
 * 따라서, 예시에서 총 명수 8 명에 a 가 4 b 가 7 일때,
 * <p>
 * 첫 경기의 1, 2 = 1 그룹 / 3, 4 = 2 그룹 / 5, 6 = 3 그룹 / 7, 8 = 4 그룹 이렇게 그룹핑 되고,
 * <p>
 * 다시 한번 더 경기하면 1그룹, 2 그룹 = 두번째 경기의 1그룹 / 3그룹, 4 그룹 = 두번째 경기의 2그룹
 * <p>
 * 이런식이 된다. 즉, a 와 b 가 같은 그룹이 되는 공식을 찾으면 된다.
 * <p>
 * @author tildev
 * @data 2021. 05. 16.
 */
class Solution {
	public int solution(int n, int a, int b) {
		int answer = 0;

		while (a != b) {
			answer++;
			a = (a + 1) / 2;
			b = (b + 1) / 2;
		}

		return answer;
	}

	public static void main(String[] args) {
		int n = 8, a = 4, b = 7;

		int ans = new Solution().solution(n, a, b);

		System.out.println(ans);

	}
}
