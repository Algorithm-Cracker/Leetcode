//ry

class Solution {
    public double myPow(double x, int n) {
        if(x == 1) return 1.0;
        if(n == 0) return 1.0;
        if(n == -2147483648) return (1/myPow(x, -(n + 1))) / x;
        if(n < 0) return 1/myPow(x,-n);
        double ans = myPow(x,n/2);
        if(n % 2 == 0)
        {
            return ans*ans;
        }
        else{
            return ans*ans*x;
        }
    }
}
