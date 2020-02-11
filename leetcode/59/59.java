//ry

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int i = 1;
        for(int z = 0; z < n / 2; z ++) {
            int x = z;
            int y = z;
            for(y = z; y < n - 1 - z; y++) res[x][y] = i++;
            y = n - 1 - z;
            for(x = z; x < n - 1 - z; x++) res[x][y] = i++;
            x = n - 1 - z;
            for(y = n - 1 - z; y > z; y--) res[x][y] = i++;
            y = z;
            for(x = n - 1 - z; x > z; x--) res[x][y] = i++;
        }
        if(n % 2 == 1) {
            res[n / 2][n / 2] = i;
        }
        return res;
    }
}
