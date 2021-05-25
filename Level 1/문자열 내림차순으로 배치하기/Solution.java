class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = new char[s.length()];
        for(int i=0; i<s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] < arr[j+1]) {
                    char tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}