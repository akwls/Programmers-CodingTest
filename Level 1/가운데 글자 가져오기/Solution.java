class Solution {
    public String solution(String s) {
        int length = s.length();
        int middle = length/2;
        String answer = "";
        if(length%2==0) {
            answer = s.substring(middle-1, middle+1);
        }
        else answer = s.substring(middle, middle+1);
        return answer;
    }
}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
//Hajin Kim, 2021-05-03