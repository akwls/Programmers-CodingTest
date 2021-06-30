function solution(numbers) {
    var answer = [];
    let set = new Set();
    for(let i=0; i<numbers.length-1; i++) {
        for(let j=i+1; j<numbers.length; j++) {
            set.add(numbers[i] + numbers[j]);
        }
    }
    answer = Array.from(set);
    answer.sort((a, b) => a - b);
    return answer;
}