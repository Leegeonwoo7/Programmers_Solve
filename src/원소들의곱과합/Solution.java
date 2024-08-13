package 원소들의곱과합;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a + b);

        int[] num_list1 = new int[]{3, 4, 5, 2, 1};
        int answer1 = 1;
        int result1 = new Solution().solution(num_list1);
        PRINT_RESULT(1, result1, answer1);

        int[] num_list2 = new int[]{5, 7, 8, 3};
        int answer2 = 0;
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

    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int sum = 0;
        int sqr = 0;
        for(int num : num_list){
            mul *= num;
        }
        for(int num : num_list){
            sum += num;
        }
        sqr = sum * sum;

        if (sqr > mul) answer = 1;
        return answer;
    }
}