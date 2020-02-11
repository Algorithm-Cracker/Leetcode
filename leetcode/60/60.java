//ry

class Solution {
    public String getPermutation(int n, int k) {
        k--;
        HashSet<Integer> set = new HashSet<>();
        int num = 1;
        for(int i = 1; i < n; i++) num *= i;
        int[] res = new int[n];
        int x = 0;
        for(; x < n;) {
            int quo = k / num + 1;
            int ord = 0;
            int real = 0;
            while(ord < quo) {
                real++;
                if(set.contains(real)) continue;             
                ord ++;
            }
            res[x++] = real;
            set.add(real);
            k = k % num;
            num /= (n - x) == 0 ? 1 : (n - x);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(res[i]);
        }
        return sb.toString();
    }
}
