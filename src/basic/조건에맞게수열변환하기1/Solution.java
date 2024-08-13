package 조건에맞게수열변환하기1;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 100, 99, 98};
        int[] answer1 = new int[]{2, 2, 6, 50, 99, 49};
        int[] result1 = new Solution().solution(arr1);
        PRINT_RESULT(1, result1, answer1);
    }

    public static void PRINT_RESULT(int index, int[] result, int[] answer) {
        boolean correct = Arrays.equals(result, answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(Arrays.toString(result)).append("\n");
        sb.append("\t- 기댓값: \t").append(Arrays.toString(answer)).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int[] solution(int[] arr) {
        int[] result = new int[arr.length];
        final int BOUNDARY_VALUE = 50;

        for(int i=0; i<arr.length; i++){
            if(arr[i] >= BOUNDARY_VALUE && arr[i] % 2 == 0){
                result[i] = arr[i] / 2;
            }else if(arr[i] < BOUNDARY_VALUE && arr[i] % 2 == 1){
                result[i] = arr[i] * 2;
            }else{
                result[i] = arr[i];
            }
        }
        return result;
    }
}