class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int cnt = 0;
        int[] tmp = new int[moves.length];
        for(int i=0; i<moves.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[j][moves[i]-1] != 0) {
                    tmp[cnt] = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    if(cnt != 0 && tmp[cnt] == tmp[cnt-1]) {
                        cnt-=2;
                        answer+=2;
                    }
                    cnt++;
                    break;
                }
            }
        }
        return answer;
    }
}