package 모스부호;

class Solution {
    public static void main(String[] args) {
        String letter1 = ".... . .-.. .-.. ---";
        String answer1 = "hello";
        String result1 = new Solution().solution(letter1);
        PRINT_RESULT(1, result1, answer1);

        String letter2 = ".--. -.-- - .... --- -.";
        String answer2 = "python";
        String result2 = new Solution().solution(letter2);
        PRINT_RESULT(2, result2, answer2);
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

    public String solution(String letter) {
        String[] letterArr = letter.split(" ");
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int[] alpha = new int[26];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<letterArr.length; i++){
            String compareLetter = letterArr[i];
            for(int j=0; j<mos.length; j++){
                if(compareLetter.equals(mos[j])){
//                    alpha[j]++;
                    sb.append((char)(j+97));
                    break;
                }
            }
        }
//        for(int i=0; i<alpha.length; i++){
//            if(alpha[i] != 0){
//                sb.append((char)(alpha[i] + 97));
//            }
//        }
        String result = sb.toString();
        return result;
    }
}