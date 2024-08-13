package 길이에따른연산;

class Solution {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int answer1 = 51;
        int result1 = new Solution().solution(num_list1);
        PRINT_RESULT(1, result1, answer1);

        int[] num_list2 = new int[]{2, 3, 4, 5};
        int answer2 = 120;
        int result2 = new Solution().solution(num_list2);
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

    /**
     * list의 길이가 11이상이면 합을,
     * list의 길이가 10이하이면 곱을 리턴한다.
     */
    public int solution(int[] num_list) {
        int answer = 0;
        return answer;
    }
}