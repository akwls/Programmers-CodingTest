function solution(answers) {
    var answer = [];
    let p1 = [1,2,3,4,5]
    let p2 = [2,1,2,3,2,4,2,5]
    let p3 = [3,3,1,1,2,2,4,4,5,5]
    
    let p = [0,0,0]
    
    for(let i=0; i<answers.length; i++) {
        let answer = answers[i]
        if(answer == p1[i%(p1.length)]) p[0]++
        if(answer == p2[i%(p2.length)]) p[1]++
        if(answer == p3[i%(p3.length)]) p[2]++
    }
    
    let max = Math.max(...p)
    p.forEach((value, index) => {
        if(value == max) answer.push(index+1)
    })
    return answer.sort();
}