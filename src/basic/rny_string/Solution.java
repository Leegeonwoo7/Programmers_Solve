package rny_string;

class Solution {
    public static void main(String[] args) {
        String rny_string1 = "masterpiece";
        String answer1 = "rnasterpiece";
        String result1 = new Solution().solution(rny_string1);
        PRINT_RESULT(1, result1, answer1);

        String rny_string2 = "programmers";
        String answer2 = "prograrnrners";
        String result2 = new Solution().solution(rny_string2);
        PRINT_RESULT(2, result2, answer2);

        String rny_string3 = "jerry";
        String answer3 = "jerry";
        String result3 = new Solution().solution(rny_string3);
        PRINT_RESULT(3, result3, answer3);

        String rny_string4 = "burn";
        String answer4 = "burn";
        String result4 = new Solution().solution(rny_string4);
        PRINT_RESULT(4, result4, answer4);
    }

    public static void PRINT_RESULT(int index, String result, String answer) {
        boolean correct = result.equals(answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public String solution(String rny_string) {
        String result = "";
        for(int i=0; i<rny_string.length(); i++){
            if(rny_string.charAt(i) == 'm'){
                result += "rn";
            }else{
                result += rny_string.charAt(i);
            }
        }
        return result;
    }
}