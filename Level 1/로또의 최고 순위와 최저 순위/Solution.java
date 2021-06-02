class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zero_cnt = 0;
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i] == 0) zero_cnt++;
            for(int j=0; j<win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) cnt++;
            }
        }
        if(cnt + zero_cnt >= 2) answer[0] = 7-(cnt + zero_cnt);
        else answer[0] = 6;
        if(cnt >=2) answer[1] = 7-cnt;
        else answer[1] = 6;
        return answer;
    }
}