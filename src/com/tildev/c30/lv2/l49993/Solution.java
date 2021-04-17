package com.tildev.c30.lv2.l49993;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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

    /**
     * 다른 사람 풀이 법 ****
     *
     * @param skill
     * @param skill_trees
     * @return
     */
    public int solution1(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skillTrees = {"BACDE", "CBADF", "AECB", "BDA"};

        int ans = new Solution().solution(skill, skillTrees);

        System.out.println(ans);

    }
}
