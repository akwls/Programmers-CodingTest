class Solution {
    public long solution(long n) {
        long answer = -1;
        double num = Math.sqrt(n);
        if(num - (int)num == 0.0) answer = ((long)num +1) * ((long)num +1);
        return answer;
    }
}