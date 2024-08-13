package 배열비교하기;

class Solution {
    public static void main(String[] args) {
        int[] arr11 = new int[]{49, 13};
        int[] arr21 = new int[]{70, 11, 2};
        int answer1 = -1;
        int result1 = new Solution().solution(arr11, arr21);
        PRINT_RESULT(1, result1, answer1);

        int[] arr12 = new int[]{100, 17, 84, 1};
        int[] arr22 = new int[]{55, 12, 65, 36};
        int answer2 = 1;
        int result2 = new Solution().solution(arr12, arr22);
        PRINT_RESULT(2, result2, answer2);

        int[] arr13 = new int[]{1, 2, 3, 4, 5};
        int[] arr23 = new int[]{3, 3, 3, 3, 3};
        int answer3 = 0;
        int result3 = new Solution().solution(arr13, arr23);
        PRINT_RESULT(3, result3, answer3);
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

    public int solution(int[] arr1, int[] arr2) {

        if(arr1.length > arr2.length) return 1;
        else if(arr1.length < arr2.length) return -1;
        else {
            int arr1_sum = 0;
            int arr2_sum = 0;

            for(int i=0; i<arr1.length; i++){
                arr1_sum += arr1[i];
            }
            for(int i=0; i<arr2.length; i++){
                arr2_sum += arr2[i];
            }
            if(arr1_sum > arr2_sum) return 1;
            else if(arr1_sum < arr2_sum) return -1;
            else return 0;
        }
    }

}