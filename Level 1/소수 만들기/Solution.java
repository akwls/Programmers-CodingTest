class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length;
        int[] tmp = new int[length * (length -1) * (length -2) / 3 / 2];
        int cnt = 0;
        for(int i=0; i<length-2; i++) {
            for(int j=i+1; j<length-1; j++) {
                for(int k=j+1; k<length; k++) {
                    tmp[cnt] = nums[i] + nums[j] + nums[k];
                    cnt++;
                }
            }
        }
        outer:for(int i=0; i<tmp.length; i++) {
            for(int j=2; j<tmp[i]; j++) {
                if(tmp[i] % j == 0) continue outer;
            }
            answer++;
        }


        return answer;
    }
}