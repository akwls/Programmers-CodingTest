function solution(nums) {
    var answer = 0;
    answer = Math.min(nums.length/2, Array.from(new Set(nums)).length)
    return answer;
}