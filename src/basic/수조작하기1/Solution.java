package 수조작하기1;

class Solution {
    public static void main(String[] args) {
        int n1 = 0;
        String control1 = "wsdawsdassw";
        int answer1 = -1;
        int result1 = new Solution().solution(n1, control1);
        PRINT_RESULT(1, result1, answer1);
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

    public int solution(int n, String control) {
        for(int i=0; i<control.length(); i++){
            if(control.charAt(i) == 'w') n += 1;
            else if(control.charAt(i) == 's') n -= 1;
            else if(control.charAt(i) == 'd') n += 10;
            else if(control.charAt(i) == 'a') n -= 10;
        }
        return n;
    }
}