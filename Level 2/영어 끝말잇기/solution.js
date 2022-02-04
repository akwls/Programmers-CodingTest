function solution(n, words) {
    var answer = [0, 0];
    var tmp = new Map();
    var turn = 0;

    for(let i = 0; i<words.length; i++) {
        console.log(words[i])
        
        if(tmp.has(words[i])) {
            return makeArray(i, n)
        }
        if(words[i].length <= 1) {
            return makeArray(i, n)
        }
        if(i != 0 && (words[i-1].substr(-1) != words[i].substring(0, 1))) {
            return makeArray(i, n)
        }
        tmp.set(words[i], words[i]);
    }
    return answer;
}

function makeArray(i, n) {
    return [Math.floor(i % n + 1), Math.floor(i / n + 1)];
}