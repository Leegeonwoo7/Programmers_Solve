package 더크게합치기;

class Solution {
    public static void main(String[] args) {
        int a1 = 9;
        int b1 = 91;
        int answer1 = 991;
        int result1 = new Solution().solution(a1, b1);
        PRINT_RESULT(1, result1, answer1);

        int a2 = 89;
        int b2 = 8;
        int answer2 = 898;
        int result2 = new Solution().solution(a2, b2);
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

    public int solution(int a, int b) {
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);

        String afterA = aStr + bStr;
        String afterB = bStr + aStr;

        if(Integer.parseInt(afterA) > Integer.parseInt(afterB)){
            return Integer.parseInt(afterA);
        }else if(Integer.parseInt(afterB) > Integer.parseInt(afterA)){
            return Integer.parseInt(afterB);
        }else return Integer.parseInt(afterA);
    }
}