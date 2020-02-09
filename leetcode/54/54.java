//ry

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int leny = matrix.length;
        if(leny == 0) return res;
        int lenx = matrix[0].length;
        for(int z = 0; z < (lenx < leny ? lenx : leny) / 2; z++) {
            int x = z;
            int y = z;
            for(y = z; y < lenx - 1 - z; y++) res.add(matrix[x][y]);
            y = lenx - 1 - z;
            for(x = z; x < leny - 1 - z; x++) res.add(matrix[x][y]);
            x = leny - 1 - z;
            for(y = lenx - 1 - z; y > z; y--) res.add(matrix[x][y]);
            y = z;
            for(x = leny - 1 - z; x > z; x--) res.add(matrix[x][y]);
        }
        if (leny < lenx && leny % 2 == 1) {
            int x = leny / 2;
            for(int y = x; y < lenx - x; y++) res.add(matrix[x][y]);
        }
        if (leny > lenx && lenx % 2 == 1) {
            int y = lenx / 2;
            for(int x = y; x < leny - y; x++) res.add(matrix[x][y]);
        }
        if (leny == lenx && lenx % 2 == 1) {
            int y = lenx / 2;
            int x = y;
            res.add(matrix[x][y]);
        }
        return res;
    }
}
