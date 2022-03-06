function solution(progresses, speeds) {
    var answer = [];
    let max = 0;
    for(let i = 0; i<progresses.length; i++) {
        let w = Math.ceil((100-progresses[i]) / speeds[i])
        if(w > max) {
            max = w
            answer.push(1)
        }
        else {
           answer[answer.length-1]++
        }
    }
    
    return answer;
}