import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor == 0) {
                cnt++;
            }
        }
        int[] answer;
        if(cnt == 0) {
            answer = new int[]{-1};
        }
        else {
            answer = new int[cnt];
            for(int i=0; i<arr.length; i++) {
                if(arr[i]%divisor == 0) {
                    answer[cnt-1] = arr[i];
                    cnt--;
                }
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}