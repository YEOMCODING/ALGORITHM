class Solution {
    public double solution(int[] numbers) {
        double plus = 0.0;
        double answer = 0;
        for(int i = 0; i<numbers.length;i++){
            plus += numbers[i];
        }
        answer = plus / numbers.length;
        return answer;
    }
}