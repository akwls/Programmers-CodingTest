class Solution {
    public int solution(int[][] sizes) {
        int answer = 1;
        int width = 0, height = 0;
        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][1] > sizes[i][0]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if(sizes[i][0] > width) width = sizes[i][0];
            if(sizes[i][1] > height) height = sizes[i][1];
        }
        answer = width * height;
        return answer;
    }
}