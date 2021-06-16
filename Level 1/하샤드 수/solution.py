import math
def solution(x):
    answer = True
    tmp = 0
    y = x
    while(y>0):
        tmp += y%10
        y = math.trunc(y/10)
    if x%tmp != 0:
        answer = False 
    return answer