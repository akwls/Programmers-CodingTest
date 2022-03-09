function solution(new_id) {
    var answer = "";
    // 1단계 
    answer = new_id.toLowerCase();
    console.log("1: " + answer)
    // 2단계
    answer = answer.split("").filter(a => {
        let check = false;
        let code = a.charCodeAt(0)
        if(code >= 97 && code <= 122) {
            check = true;
        } 
        else if(code >= 48 && code <= 57) {
            check = true;
        }
        else if(a == '_' || a == '-' || a == '.') {
            check = true;
        }
        return check;
    }).join("")
    console.log("2: " + answer)
    // 3단계
    let tmp = "";
    for(let i=0; i<answer.length; i++) {
        if(answer[i] == '.' && answer[i+1] == '.') {
            continue;
        }
        else tmp += answer[i];
    }
    answer = tmp;
    console.log("3: " + answer)
    // 4단계
    while(true) {
        if(answer.startsWith('.')) {
            answer = answer.substring(1)
        }
        else break;
    }
    while(true) {
        if(answer.endsWith('.')) {
            answer = answer.substring(0, answer.length-1)
        }
        else break;
    }
    console.log("4: " + answer)
    // 5단계
    if(answer == "") answer += 'a';
    console.log("5: " + answer)
    // 6단계
    if(answer.length >= 16) {
        answer = answer.substring(0, 15);
    }
    while(true) {
        if(answer.endsWith('.')) {
            answer = answer.substring(0, answer.length-1)
        }
        else break;
    }
    console.log("6: " + answer)
    // 7단계
    if(answer.length <= 2) {
        let a = answer[answer.length-1]
        while(answer.length < 3) {
            answer += a;
        }
    }
    console.log("7: " + answer)
    return answer;
}