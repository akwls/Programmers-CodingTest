class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] cal;
        int cnt;
        for(int i=0; i<commands.length; i++) {
            cnt=0;
            cal = new int[commands[i][1]-commands[i][0]+1];
            for(int j=commands[i][0]-1; cnt<commands[i][1]-commands[i][0]+1; j++) {
                cal[cnt] = array[j];
                cnt++;
            }
            for(int j=0; j<cal.length-1; j++) {
                for(int k=0; k<cal.length-j-1; k++) {
                    if(cal[k] > cal[k+1]) {
                        int temp = cal[k];
                        cal[k] = cal[k+1];
                        cal[k+1] = temp;
                    }
                }
            }
            answer[i] = cal[commands[i][2]-1];
        }
        return answer;
    }
}