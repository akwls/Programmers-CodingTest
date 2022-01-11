class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean check = true;
        int i;
        for(i=1; ; i++) {
            check = true;
            for(int j=1; j<arr.length; j++) {
                if(arr[0] * i % arr[j] != 0) {
                    check = false;
                }
            }
            if(check == true) break;
        }
        if(check = true) answer = arr[0] * i;
        return answer;
    }
}