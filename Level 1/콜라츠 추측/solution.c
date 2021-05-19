#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(long num) {
    int answer = 0;
    while(num>1) {
        if(num%2) {
            num = num*3 +1;
        }
        else num/=2;
        answer++;
        if(answer >= 500) {
            answer = -1;
            break;
        }
    }
    return answer;
}