package 한번만등장한문자;

import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        String s1 = "abcabcadc";
        String answer1 = "d";
        String result1 = new Solution().solution(s1);
        PRINT_RESULT(1, result1, answer1);

        String s2 = "abdc";
        String answer2 = "abcd";
        String result2 = new Solution().solution(s2);
        PRINT_RESULT(2, result2, answer2);

        String s3 = "hello";
        String answer3 = "eho";
        String result3 = new Solution().solution(s3);
        PRINT_RESULT(3, result3, answer3);
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

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] countArr = new int[26];
        for(int i=0; i<s.length(); i++ ){
            countArr[s.charAt(i)-97]++;
        }

        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<countArr.length; i++){
            if(countArr[i] == 1){
                list.add((char)(i+97));
            }
        }

        for (Character c : list) {
            sb.append(c);
        }

        return sb.toString();
    }
}