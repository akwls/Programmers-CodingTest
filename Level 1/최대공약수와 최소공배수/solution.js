function solution(n, m) {
    var answer = [];
    let max = 1;
    for(let i=1; ; i++) {
        if(n%i==0 && m%i==0) {
            max = i;
        }
        if(i==n || i==m) break;
    }
    answer[0] = max;
    answer[1] = max * (n/max) * (m/max);
    return answer;
}