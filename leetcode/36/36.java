//ry

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        //row
        for(int x = 0; x < 9; x++) {
            set.clear();
            for(int y = 0; y < 9; y++) {
                char c = board[x][y];
                if(c == '.') continue;
                if(set.contains(c)) return false;
                set.add(c);
            }
        }
        for(int x = 0; x < 9; x++) {
            set.clear();
            for(int y = 0; y < 9; y++) {
                char c = board[y][x];
                if(c == '.') continue;
                if(set.contains(c)) return false;
                set.add(c);
            }
        }
        for(int i = 0; i < 9; i++) {
            set.clear();
            for(int x = (i % 3) * 3; x < (i % 3) * 3 + 3; x++){
                for(int y = (i / 3) * 3; y < (i / 3) * 3 + 3; y++) {
                    char c = board[y][x];
                    if(c == '.') continue;
                    if(set.contains(c)) return false;
                    set.add(c);
                }
            }
        }
        return true;
    }
}
