//ry

class Solution {
    int res = 0;
    int flag = 1;
    boolean f = false;
    public int numDecodings(String s) {
        // if(s.compareTo("0") == 0) return 0;
        helper(0, s.toCharArray(), true);
        if(f) return 0;
        return res;
    }
    private void helper(int now, char[] nums, boolean zeroflag) {
        if(now == nums.length) {
            res++;
            return;
        }
        if(zeroflag && (int)(nums[now] - '0') == 0) {
            f = true;
            return;
        }
        if((int)(nums[now] - '0') == 0) return;
        if((int)(nums[now] - '0') > 2 || now == nums.length - 1) {
            helper(now + 1, nums, false);
            return;
        }
        if((int)(nums[now] - '0') == 1) {
            if((int)(nums[now + 1] - '0') == 0) {
                helper(now + 2, nums, true);
                flag = 1;
            }
            else{
                helper(now + 1, nums, false);
                helper(now + 2, nums, false);
            }
            
            return;
        }
        if((int)(nums[now] - '0') == 2) {
            if((int)(nums[now + 1] - '0') == 0) {
                helper(now + 2, nums, true);
                flag = 1;
            }
            else if((int)(nums[now + 1] - '1') > 5) {
                helper(now + 1, nums, false);
            }
            else {
                helper(now + 1, nums, false);
                helper(now + 2, nums, false);
            }
            return;
        }
    }
}
