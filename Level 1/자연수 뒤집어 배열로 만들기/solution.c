#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(long long n) {
    // 리턴할 값은 메모리를 동적 할당해주세요.
    long long nn = n;
    int cnt=0;
    while(nn>0) {
        nn/=10;
        cnt++;
    }
    int* answer = (int*)malloc(sizeof(int) * cnt);
    for(int i=0; i<cnt; i++) {
        *(i+answer) = (int)(n%10);
        n/=10;
    }
    return answer;
}