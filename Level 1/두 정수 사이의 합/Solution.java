class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = a, min = b;
        if(a < b) {
            max = b;
            min = a;
        }
        for(int i=min; i<=max; i++) {
            answer += i;
        }
        return answer;
    }
}