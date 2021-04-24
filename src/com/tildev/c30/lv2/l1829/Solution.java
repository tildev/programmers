package com.tildev.c30.lv2.l1829;

/**
 * 카카오프렌즈 컬러링북
 * 2017 카카오코드 예선
 *
 * @author tildev
 * @data 2021. 04. 24.
 */
class Solution {

    private static final int[] xArr = {0, 0, -1, 1};
    private static final int[] yArr = {-1, 1, 0, 0};

    private static int sizeOfOneArea = 0;

    /**
     * dfs
     *
     * @param x
     * @param y
     */
    private static void dfs(int x, int y, int[][] picture, boolean[][] visited) {
        if (visited[x][y]) {
            return;
        }

        visited[x][y] = true;
        sizeOfOneArea++;

        int impX;
        int impY;
        for (int i = 0; i < 4; i++) {
            impX = x + xArr[i];
            impY = y + yArr[i];

            // 해당 배열의 범위
            if (impX >= 0 && impY >= 0 && impX < picture.length && impY < picture[0].length) {
                if (picture[impX][impY] == picture[x][y] && (!visited[impX][impY])) {
                    dfs(impX, impY, picture, visited);
                }
            }
        }
    }

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0 && !visited[i][j]) {
                    numberOfArea++;
                    dfs(i, j, picture, visited);
                }
                if (sizeOfOneArea > maxSizeOfOneArea) {
                    maxSizeOfOneArea = sizeOfOneArea;
                }
                sizeOfOneArea = 0;
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public static void main(String[] args) {
        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        int[] ans = new Solution().solution(m, n, picture);

        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}
