function solution(s)
{
    var answer = -1;
    let stack = [];
    let top = 0;
    
    stack.push(s[0]);
    for(let i=1; i<s.length; i++) {
        if(s[i] == stack[top]) {
            stack.pop();
            top--;
        }
        else {
            stack.push(s[i]);
            top++;
        }
    }
    answer = stack.length == 0 ? 1 : 0;
    

    return answer;
}