function solution(s) {
    var answer = [];
    let map = new Map();
    let arr = s.substring(2, s.length-2).split("},{").sort(function(a, b) {
        return a.length - b.length;
    });
    arr.forEach(value => {
        let tmp = value.split(",")
        if(tmp.length == 1) {
            map.set(tmp[0], tmp[0])
        }
        else {
            tmp.forEach(value => {
                if(!map.has(value)) {
                    map.set(value, value)
                }
            })
        }
    })
    for(let item of map.values()) answer.push(+item)
    return answer;
}