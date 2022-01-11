class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int k=0;
        for(int i=1; i<=n; i++) {
            sum = 0;
            k=i;
            while(true) {
                if(sum == n) {
                    answer++;
                }
                if(sum > n) break;
                sum += k++;
            }
        }
        return answer;
    }
}