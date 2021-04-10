package com.tildev.c30.l49993;

/**
 * 스킬트리
 *
 * @author tildev
 * @data 2021. 04. 10.
 */
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String s : skill_trees) {
            char[] sc = s.toCharArray();

            for (char c : sc) {
                int imp = skill.indexOf(c);
                if (imp == -1) {
                    s = s.replace(String.valueOf(c), "");
                }
            }
            if (skill.indexOf(s) == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skillTrees = {"BACDE", "CBADF", "AECB", "BDA"};

        int ans = new Solution().solution(skill, skillTrees);

        System.out.println(ans);

    }
}
