package A로B만들기;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        String before1 = "olleh";
        String after1 = "hello";
        int answer1 = 1;
        int result1 = new Solution().solution(before1, after1);
        PRINT_RESULT(1, result1, answer1);

        String before2 = "allpe";
        String after2 = "apple";
        int answer2 = 0;
        int result2 = new Solution().solution(before2, after2);
        PRINT_RESULT(2, result2, answer2);
    }

    public static void PRINT_RESULT(int index, int result, int answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        Arrays.sort(afterArr);
        Arrays.sort(beforeArr);

        String result = new String(beforeArr);
        String result2 = new String(afterArr);

        String str = "str   ";
        String resultStr = str.stripTrailing();
        System.out.println(resultStr);

        return result.equals(result2) ? 1 : 0;

    }
}