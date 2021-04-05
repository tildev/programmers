package monthlycodechallenge.level1.picktwoandadd;

import java.util.*;

/**
 * 두 개 뽑아서 더하기
 *
 * @author tildev
 * @data 2021. 04. 05.
 */
public class Solution {
    public int[] solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        int[] answer = new Solution().solution(numbers);

        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}
