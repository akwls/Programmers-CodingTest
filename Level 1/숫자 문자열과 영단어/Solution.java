class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = "";
        String tmp = "";
        String alpha[] = {"zero", "one", "two", "three", "four", "five"
                          , "six", "seven", "eight", "nine"};
        for(int i=0; i<s.length(); i++) {
            if(Character.valueOf(s.charAt(i)) < 48 || Character.valueOf(s.charAt(i)) > 58) {
                tmp += Character.toString(s.charAt(i));
                for(int j=0; j<10; j++) {
                    if(tmp.equals(alpha[j])) {
                        str += Integer.toString(j);
                        tmp="";
                        break;
                    }
                }
            }
            else {
                str += Character.toString(s.charAt(i));
                tmp="";
            }
            
        }
        answer = Integer.parseInt(str);
        return answer;
    }
    
}