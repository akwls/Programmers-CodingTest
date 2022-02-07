function solution(n) {
    var answer = '';
    let num = ['4', '1', '2','4'];
    while(n > 3) {
        answer += num[n % 3];
        if(n%3 == 0) n -= 3;
        n = (n - n % 3) / 3;
    }
    answer += num[n]
    answer = answer.split('').reverse().join('')
    return answer;
}