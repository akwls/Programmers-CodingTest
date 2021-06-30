function solution(s) {
    var answer = '';
    answer= s.split("").sort((a, b) => b.charCodeAt() - a.charCodeAt()).join("");
    return answer;
}