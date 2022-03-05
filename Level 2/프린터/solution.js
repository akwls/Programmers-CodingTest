function solution(priorities, location) {
    var answer = 0;
    let list = [];
    let arr = [];
    let isPrint;
    let length = priorities.length;
    let idxList = [];
    
    for(let i=0; i<length; i++) {
        arr.push(i);
    }
    while(list.length < length) {
        isPrint = true;
        let item = priorities.shift()
        let index = arr.shift()
        for(let j=0; j<priorities.length; j++) {
            if(priorities[j] > item) {
                priorities.push(item)
                arr.push(index)
                isPrint = false;
                break;
            }
        }
        if(isPrint == true) {
            list.push(item);
            idxList.push(index);
        }
    }
    return idxList.findIndex(value => value == location)+1
}