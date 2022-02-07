function solution(priorities, location) {
    var answer = 0;
    let tmp = [];
    let max = 0;
    let index = 0;
    while(index != location) {
        max = 0;
        index = 0;
        for(let i in priorities) {
            if(priorities[i] > max) {
                max = priorities[i];
                index = i;
            }
        }
        tmp.push(priorities[index]);
        priorities[index] = -1;
    }
    console.log(tmp);
    return answer;
}