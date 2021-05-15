package com.tildev.c30.lv2.l1844;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 게임 맵 최단거리
 * </p>
 * 찾아라 프로그래밍 마에스터
 *
 * @author tildev
 * @data 2021. 05. 15.
 */
public class Solution {
	private static final int[] xArr = { 0, 0, -1, 1 };
	private static final int[] yArr = { -1, 1, 0, 0 };
	private boolean[][] visited;
	private int n, m;

	public int solution(int[][] maps) {
		n = maps.length;
		m = maps[0].length;

		visited = new boolean[n][m];
		return bfs(0, 0, maps);
	}

	public int bfs(int x, int y, int[][] maps) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x, y, 1));
		visited[x][y] = true;

		while (!q.isEmpty()) {
			Node node = q.poll();
			if (node.x == n - 1 && node.y == m - 1)
				return node.distance;

			for (int i = 0; i < 4; i++) {
				int nx = node.x + xArr[i];
				int ny = node.y + yArr[i];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (maps[nx][ny] == 1 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						q.offer(new Node(nx, ny, node.distance + 1));
					}
				}
			}
		}
		return -1;
	}

	public class Node {
		int x;
		int y;
		int distance;

		public Node(int x, int y, int distance) {
			this.x = x;
			this.y = y;
			this.distance = distance;
		}
	}

	public static void main(String[] args) {
		int[][] maps = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
				{ 0, 0, 0, 0, 1 } };

		int ans = new Solution().solution(maps);
		System.out.print(ans + " ");

	}
}
