class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum=0;
        int xx = x;
        while(xx>0) {
            sum += xx%10;
            xx /= 10;
        }
        if(x % sum != 0) {
            answer = false;
        }
        return answer;
    }
}