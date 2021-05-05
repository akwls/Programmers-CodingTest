class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String mine="R", other="L";
        int r_lo=10, l_lo=12;
        int r_dis, l_dis;
        if(hand.equals("left")) {
            mine="L";
            other="R";
        }
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == 0) numbers[i]=11;
            switch(numbers[i]%3) {
                case 1 : answer += "L"; l_lo = numbers[i]; break;
                case 0: answer += "R"; r_lo = numbers[i]; break;
                case 2 : 
                    r_dis = Math.abs(r_lo - numbers[i])/3 + Math.abs(r_lo - numbers[i])%3;
                    l_dis = Math.abs(l_lo - numbers[i])/3 + Math.abs(l_lo - numbers[i])%3;
                    if(hand.equals("right")) {
                        if(r_dis > l_dis ) {
                            answer += "L";
                            l_lo = numbers[i];
                        }
                        else {
                            answer += "R";
                            r_lo = numbers[i];
                        }
                    }
                    else {
                        if(r_dis < l_dis) {
                            answer += "R";
                            r_lo = numbers[i];
                        }
                        else {
                            answer += "L";
                            l_lo = numbers[i];
                        }
                    }
                    break;
            }
        }
                
        return answer;
    }
}