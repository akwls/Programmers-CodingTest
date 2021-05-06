class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt=0, y_cnt =0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                p_cnt++;
            }
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                y_cnt++;
            }
        }
        if(p_cnt == y_cnt) {
            answer = true;
        }
        else {
            answer = false;
        }
        return answer;
    }
}