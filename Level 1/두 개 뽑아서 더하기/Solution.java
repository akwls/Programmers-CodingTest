import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        int len = numbers.length;
        int[] tmp = new int[(len * (len-1))/2];
        int cnt=0;
        for(int i=0; i<len-1; i++) {
            mid:for(int j=i+1; j<len; j++) {
                for(int k=0; k<cnt; k++) {
                    if(tmp[k] == numbers[i]+numbers[j]) {
                        continue mid;
                    }
                }
                tmp[cnt] = numbers[i]+numbers[j];
                cnt++;
            }
        }
        answer = new int[cnt];
        for(int i=0; i<cnt; i++) {
            answer[i] = tmp[i];
        }
        Arrays.sort(answer);
        return answer;
    }
}