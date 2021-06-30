function solution(lottos, win_nums) {
    var answer = [];
    let count = 0;
    let count_zero = 0;
    for(let i of lottos) {
        if(i == 0) {
            count_zero++;
            continue;
        }
        if(win_nums.indexOf(i) != -1) count++;
    }
    let max = count + count_zero;
    answer[0] = (max >= 2) ? 7 - max : 6;
    answer[1] = (count >= 2) ? 7 - count : 6;
    return answer;
}