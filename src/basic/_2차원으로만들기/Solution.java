package _2차원으로만들기;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int n1 = 2;
        int[][] answer1 = new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] result1 = new Solution().solution(num_list1, n1);
        PRINT_RESULT(1, result1, answer1);

        int[] num_list2 = new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n2 = 3;
        int[][] answer2 = new int[][]{{100, 95, 2}, {4, 5, 6}, {18, 33, 948}};
        int[][] result2 = new Solution().solution(num_list2, n2);
        PRINT_RESULT(2, result2, answer2);
    }

    public static void PRINT_RESULT(int index, int[][] result, int[][] answer) {
        boolean correct = Arrays.deepEquals(result, answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(Arrays.deepToString(result)).append("\n");
        sb.append("\t- 기댓값: \t").append(Arrays.deepToString(answer)).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
            
        return answer;
    }
}