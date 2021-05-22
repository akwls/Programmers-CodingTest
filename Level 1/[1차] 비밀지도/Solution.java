class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] bi_arr1 = new String[n];
        String[] bi_arr2 = new String[n];
        int[] bi1 = new int[n];
        int[] bi2 = new int[n];
        for(int i=0; i<n; i++) {
            answer[i] = "";
            bi_arr1[i] = "";
            bi_arr2[i] = "";
        }
        for(int i=0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                bi1[j] = arr1[i]%2;
                arr1[i]/=2;
                bi2[j] = arr2[i]%2;
                arr2[i]/=2;
            }
            for(int j=n-1; j>=0; j--) {
                if(bi1[j] == 1) bi_arr1[i] += "#";
                else bi_arr1[i] += " ";
                if(bi2[j] == 1) bi_arr2[i] += "#";
                else bi_arr2[i] += " ";
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(bi_arr1[i].charAt(j) == '#' || bi_arr2[i].charAt(j) == '#') {
                    answer[i] += "#";
                }
                else answer[i] += " ";
            }
        }
        return answer;
    }
}