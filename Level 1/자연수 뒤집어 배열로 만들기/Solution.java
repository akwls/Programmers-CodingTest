class Solution {
    public int[] solution(long n) {
        int[] answer;
        long nn=n;
        int cnt=0;
        while(nn>0) {
            nn /= 10;
            cnt++;
        }
        answer = new int[cnt];
        for(int i=0; i<cnt; i++) {
            answer[i] = (int)(n%10);
            n/=10;
        }
        return answer;
    }
}