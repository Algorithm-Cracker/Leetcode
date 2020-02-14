//ry

class Solution {
    public void setZeroes(int[][] matrix) {
        int lenx = matrix.length;
        if(lenx == 0) return;
        int leny = matrix[0].length;
        int[] statex = new int[lenx];
        int[] statey = new int[leny];
        for(int x = 0; x < lenx; x++) {
            for(int y = 0; y < leny; y++) {
                if(matrix[x][y] == 0) {
                    statex[x] = 1;
                    statey[y] = 1;
                }
            }
        }
        for(int x = 0; x < lenx; x++) {
            if(statex[x] == 1) {
                for(int y = 0; y < leny; y++) matrix[x][y] = 0;
            }
        }
        for(int y = 0; y < leny; y++) {
            if(statey[y] == 1) {
                for(int x = 0; x < lenx; x++) matrix[x][y] = 0;
            }
        }
    }
}
