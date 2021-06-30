function solution(s) {
    var answer = '';
    let start = Math.floor(s.length/2);
    if(s.length%2 == 0) {
        answer = s.slice(start-1, start+1);
    }
    else {
        answer = s.slice(start, start+1);
    }
    return answer;
}