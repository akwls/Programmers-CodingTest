class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        for(int i=0; cnt < s.length(); i++, cnt++) {
            if(s.charAt(cnt) == ' ') {
                answer += " ";
                i = -1;
                continue;
            }
            if(i%2 == 1) {
                answer += Character.toLowerCase(s.charAt(cnt));
            }
            else answer += Character.toUpperCase(s.charAt(cnt));
        }
        return answer;
    }
}