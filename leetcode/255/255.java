//ry

class Solution {
    public boolean verifyPreorder(int[] preorder) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int min = Integer.MIN_VALUE;
        for(int n : preorder){
            if(n < min) return false;
            while(!stack.isEmpty() && n > stack.peekFirst()){
                min = stack.pollFirst();
            }
            stack.offerFirst(n);
        }
        return true;
    }
}
