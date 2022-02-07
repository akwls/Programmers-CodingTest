function solution(s) {
    var answer = '';
    let tmp = s.split(" ");
    let arr = [];
    tmp.forEach(a => arr.push(a.substr(0,1).toUpperCase() + a.substring(1).toLowerCase()))
    answer = arr.join(" ")
    return answer;
}