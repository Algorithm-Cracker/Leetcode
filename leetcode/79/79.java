//ry

class Solution {
    public boolean exist(char[][] board, String word) {
        if(word.length() == 0)
            return true;
            
        boolean[][] map = new boolean[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[0].length; j++)
                if(exist(board, word, 0, i, j, map))
                    return true;
                    
        return false;
    }
    public boolean exist(char[][] board, String word, int location, int x, int y, boolean[][] map){
        char tmpChar = word.charAt(location);
        boolean result = false;
        if(tmpChar != board[x][y])
            return false;
        else{
            map[x][y] = true;
            if(location == word.length() - 1)
                return true;
            if(x > 0 && !map[x - 1][y])
                result = result || exist(board, word, location + 1, x - 1, y, map);
            if(x < board.length - 1 && !map[x + 1][y])
                result = result || exist(board, word, location + 1, x + 1, y, map);
            if(y > 0 && !map[x][y - 1])
                result = result || exist(board, word, location + 1, x, y - 1, map);
            if(y < board[0].length - 1 && !map[x][y + 1])
                result = result || exist(board, word, location + 1, x, y + 1, map);
            if(!result)
                map[x][y] = false;
        }
        return result;
    }
}
