class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int min = arr[0];
        if(arr.length == 1) {
            answer = new int[]{-1};
        }
        else {
            for(int i=0; i<arr.length; i++) {
                if(arr[i] < min) min = arr[i];
            }
            answer = new int[arr.length-1];
            int cnt=0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i] != min) {
                    answer[cnt] = arr[i];
                    cnt++;
                }
            }
        }
        return answer;
    }
}