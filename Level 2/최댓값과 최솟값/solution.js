function solution(s) {
    var answer = '';
    s += " ";
    let d = '';
    let temp = [];
    for(let i=0; i<s.length; i++) {
        if(s[i] == ' ') {
            temp.push(+d);
            d = '';
        }
        else {
            d += s[i];
        }
    }
    console.log(temp);
    let max = temp[0];
    let min = temp[0];
    for(let i=0; i<temp.length; i++) {
        if(temp[i] > max) max = temp[i];
        else if(temp[i] < min) min = temp[i];
    }
    answer = min + " " + max;
    return answer;
}