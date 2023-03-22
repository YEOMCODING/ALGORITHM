class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int nPrice = n*12000;
        int kPrice = k*2000;
        
        int free = n/10*2000;
        
        if(free > 0){
            kPrice = kPrice - free;
        }
        answer = nPrice + kPrice;
        
        
        return answer;
    }
}