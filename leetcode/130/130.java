//ry

class Solution {
    int lenx = 0;
    int leny = 0;
    public void solve(char[][] board) {
        lenx = board.length;
        if(lenx == 0) return;
        leny = board[0].length;
        int[][] state = new int[lenx][leny];
        for(int x = 0; x < lenx; x++) {
            if(board[x][0] == 'O' && state[x][0] == 0) dfs(x, 0, board, state);
        }
        for(int y = 1; y < leny; y++) {
            if(board[0][y] == 'O' && state[0][y] == 0) dfs(0, y, board, state);
        }
        for(int x = 1; x < lenx; x++) {
            if(board[x][leny - 1] == 'O' && state[x][leny - 1] == 0) dfs(x, leny - 1, board, state);
        }
        for(int y = 1; y < leny - 1; y++) {
            if(board[lenx - 1][y] == 'O' && state[lenx - 1][y] == 0) dfs(lenx - 1, y, board, state);
        }
        for(int x = 0; x < lenx; x++) {
            for(int y = 0; y < leny; y++) {
                if(board[x][y] == 'O' && state[x][y] == 0) board[x][y] = 'X';
            }
        }
    }
    private void dfs(int x, int y, char[][] board, int[][] state) {
        if(board[x][y] != 'O') return;
        state[x][y] = 1;
        if(x - 1 >= 0 && state[x - 1][y] == 0) dfs(x - 1, y, board, state);
        if(x + 1 < lenx && state[x + 1][y] == 0) dfs(x + 1, y, board, state);
        if(y - 1 >= 0 && state[x][y - 1] == 0) dfs(x, y - 1, board, state);
        if(y + 1 < leny && state[x][y + 1] == 0) dfs(x, y + 1, board, state);
    }
}
