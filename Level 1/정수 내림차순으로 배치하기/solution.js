function solution(n) {
    var answer = 0;
    answer = parseInt(Array.from(n.toString()).sort().reverse().join(''));
    return answer;
}