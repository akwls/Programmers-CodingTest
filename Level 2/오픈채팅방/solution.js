function solution(record) {
    var answer = [];
    var map = new Map();
    for(let r of record) {
        let arr = r.split(' ')
        let action = arr[0];
        let id = arr[1];
        let name = arr[2];
        
        if(action == "Enter" || action == "Change") {
            map.set(id, name)
        }
    }
    for(let r of record) {
        let arr = r.split(' ')
        let action = arr[0];
        let id = arr[1];
        let name = arr[2];
        
        if(action == "Enter") {
            answer.push(map.get(id) + "님이 들어왔습니다.")
        }
        else if(action == "Leave") {
            answer.push(map.get(id) + "님이 나갔습니다.")
        }
    }
    return answer;
}