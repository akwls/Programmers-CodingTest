function solution(id_list, report, k) {
    var answer = [];
    let map = new Map()
    let reportedCount = new Map()
    let list = new Set()
    for(let id of id_list) {
        map.set(id, {set: new Set(), count: 0})
    }
    for(let r of report) {
        let arr = r.split(" ")
        let a = arr[0]
        let b = arr[1]
        map.get(b).set.add(a)
    }
    for(let m of map.entries()) {
        if(m[1].set.size >= k) {
            list.add(m[0])
        } 
    }
    for(let m of map.entries()) {
        for(let s of m[1].set) {
            if(list.has(m[0])) {
                map.get(s).count++
            }
        }
    }
    
    for(let m of map.values()) {
        answer.push(m.count)
    }
    return answer;
}