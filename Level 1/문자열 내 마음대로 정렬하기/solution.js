function solution(strings, n) {
    var answer = [];
    for(let i=0; i<strings.length; i++) {
        for(let j = 0; j<strings.length -i -1; j++) {
            if(strings[j] > strings[j+1]) {
                let tmp = strings[j];
                strings[j] = strings[j+1];
                strings[j+1] = tmp;
            }
        }
    }
    for(let i=0; i<strings.length; i++) {
        for(let j = 0; j<strings.length -i -1; j++) {
            if(strings[j].charAt(n) > strings[j+1].charAt(n)) {
                let tmp = strings[j];
                strings[j] = strings[j+1];
                strings[j+1] = tmp;
            }
        }
    }
    answer = strings.slice();
    return answer;
}