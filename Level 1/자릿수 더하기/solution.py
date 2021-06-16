import math
def solution(n):
    answer = 0
    while n > 0:
        answer += n%10
        n = math.trunc(n / 10)

    return answer