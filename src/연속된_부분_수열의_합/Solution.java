package 연속된_부분_수열의_합;

class Solution {
    public static void main(String[] args){
        Solution my = new Solution();
        // TCs
        int[] sequence = {1, 2, 3, 4, 5};		//TC #1
        int k = 7;		//TC #1
        //int[] sequence = {1, 1, 1, 2, 3, 4, 5};		//TC #2
        //int k = 5;		//TC #2
        //int[] sequence = {2, 2, 2, 2, 2};		//TC #3
        //int k = 6;		//TC #3


        // Solution output
        int[] output = my.solution(sequence, k);
        System.out.print("[");
        for( int i = 0; i < output.length; i++){
            System.out.print(output[i]);
            if ( i == (output.length-1)) break;
            else System.out.print(", ");
        }
        System.out.println("]");
    }
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left = 0;
        int right = sequence.length-1;

        while(true) {
            if (sequence[left] + sequence[right] == k){
                answer[0] = left;
                answer[1] = right;
                break;
            } else if (sequence[left] + sequence[right] > k) {
                right--;
            } else if (sequence[left] + sequence[right] < k) {
                left++;
            }
        }

        return answer;
    }

    private class SubSequence implements Comparable<SubSequence>{
        int left, right, size;

        public SubSequence(int left, int right){
            this.left = left;
            this. right = right;
            this. size= right - left;
        }

        @Override
        public int compareTo(SubSequence o) {
            if(this.size == o.size){
                return this.left - o.left;
            }
            return this.size - o.size;
        }
    }
}
