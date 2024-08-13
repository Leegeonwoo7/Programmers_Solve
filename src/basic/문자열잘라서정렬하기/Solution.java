package 문자열잘라서정렬하기;

import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public static void main(String[] args) {
        String myString1 = "axbxcxdx";
        String[] answer1 = new String[]{"a", "b", "c", "d"};
        String[] result1 = new Solution().solution(myString1);
        PRINT_RESULT(1, result1, answer1);

        String myString2 = "dxccxbbbxaaaa";
        String[] answer2 = new String[]{"aaaa", "bbb", "cc", "d"};
        String[] result2 = new Solution().solution(myString2);
        PRINT_RESULT(2, result2, answer2);

        String myString3 = "zxcxbxaxxxxxxx";
        String[] answer3 = new String[]{"a", "b", "c", "z"};
        String[] result3 = new Solution().solution(myString3);
        PRINT_RESULT(3, result3, answer3);

        String myString4 = "dxccxbbbxxaaaa";
        String[] answer4 = new String[]{"aaaa","bbb","cc","d"};
        String[] result4 = new Solution().solution(myString4);
        PRINT_RESULT(4, result4, answer4);


        String myString5 = "xaxbxcx";
        String[] answer5 = new String[]{"a", "b", "c"};
        String[] result5 = new Solution().solution(myString5);
        PRINT_RESULT(5, result5, answer5);
    }

    public static void PRINT_RESULT(int index, String[] result, String[] answer) {
        boolean correct = Arrays.equals(result, answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(Arrays.toString(result)).append("\n");
        sb.append("\t- 기댓값: \t").append(Arrays.toString(answer)).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public String[] solution(String myString) {

        return Stream.of(myString
                        .split("x"))
                .filter(str->str.length()>0)
                .sorted()
                .toArray(String[]::new);
    }
}