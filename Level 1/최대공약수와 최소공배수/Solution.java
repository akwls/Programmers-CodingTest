class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = 1;;
        for(int i=1; ; i++) {
            if(n%i==0 && m%i==0) {
                max = i;
            }
            if(i==n || i==m) break;
        }
        answer[0] = max;
        answer[1] = max * (n/max) * (m/max);
        return answer;
    }
}