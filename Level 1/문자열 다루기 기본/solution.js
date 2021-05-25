function solution(s) {
    var answer = true;
    if(s.length != 4 && s.length != 6) answer = false;
    else {
        for(let i=0; i<s.length; i++) {
            if(!isFinite(s.substr(i, 1))) answer = false;
        }
    }
    return answer;
}