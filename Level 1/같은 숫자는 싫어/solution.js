function solution(arr)
{
    var answer = [];
    answer.push(arr[0]);
    for(let i=0; i<arr.length-1; i++) {
        if(arr[i] == arr[i+1]) continue;
        answer.push(arr[i+1]);
    }
    
    return answer;
}