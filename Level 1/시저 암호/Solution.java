class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                if(ch + n > 'z') {
                    answer += Character.toString((char)('a'+(ch+n-'z')-1));
                }
                else answer += Character.toString((char)(ch+n));
            }
            else if(ch >= 'A' && ch <='Z') {
                if((ch + n) > 'Z') {
                    answer += Character.toString((char)('A'+(ch+n-'Z')-1));
                }
                else answer += Character.toString((char)(ch+n));
            }
            else {
                answer += Character.toString((char)ch);
            }
        }
        return answer;
    }
}