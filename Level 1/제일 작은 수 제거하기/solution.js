function solution(arr) {
    var answer = [];
    if(arr.length == 1) {
        answer.push(-1);
    }
    else {
        let min = Math.min.apply(null, arr);
        for(let i=0; i<arr.length; i++) {
            if(arr[i] != min) {
                answer.push(arr[i]);
            }
        }
    }
    return answer;
}