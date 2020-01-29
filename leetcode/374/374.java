//ry

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low != high) {
            int mid = low + (high - low) / 2;
            int judge = guess(mid);
            if(judge == 0) return mid;
            else if(judge == -1) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}
