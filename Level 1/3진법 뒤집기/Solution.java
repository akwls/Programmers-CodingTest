class Solution {
    public int solution(int n) {
        int answer = 0;
        int max;
        int cnt=0;
        for(max=1; max<=n; max*=3) {
            cnt++;
        }
        int[] arr = new int[cnt];
        for(int i=0; i<cnt; i++) {
            arr[i] = n%3;
            n/=3;
        }
        for(int i=0; i<cnt; i++) {
            answer += (Math.pow(3, cnt-1-i) * arr[i]);
        }
        return answer;
    }
}