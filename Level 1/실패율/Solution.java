class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double result[] = new double[N];
        int notSolved = 0, solved=0;
        
        for(int i=0; i<result.length; i++) {
            notSolved = 0;
            solved = 0;
            for(int j=0; j<stages.length; j++) {
                if(stages[j] == i+1) notSolved++;
                if(stages[j] >= i+1) solved++;
            }
            result[i] = (double)notSolved / solved;
        }
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = i+1;
        }
        
        for(int i=0; i<answer.length; i++) {
            for(int j=0; j<answer.length-i-1; j++) {
                if(result[j] < result[j+1]) {
                    double tmp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = tmp;
                    int temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                }
            }
        }
        return answer;
    }
}