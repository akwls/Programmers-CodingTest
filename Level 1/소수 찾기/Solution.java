class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] check = new int[n+1];
        for(int i=2; i<=n; i++) {
            check[i] = i;
        }
        for(int i =2; i<=n; i++) {
            if(check[i] == 0) continue;
            for(int j=2*i; j<=n; j+=i) {
                if(check[j] == 0) continue;
                else check[j] = 0;
            }
        }
        for(int i=2; i<=n; i++) {
            if(check[i] != 0) answer++;
        }
        return answer;
    }
}