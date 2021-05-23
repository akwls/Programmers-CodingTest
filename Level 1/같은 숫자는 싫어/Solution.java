import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        int cnt = 1;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1]) continue;
            cnt++;
        }
        answer = new int[cnt];
        cnt=1;
        answer[0] = arr[0];
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1]) continue;
            answer[cnt] = arr[i+1];
            cnt++;
        }
        return answer;
    }
}