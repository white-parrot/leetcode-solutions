class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        int x = (int)Math.pow(3, 19);
        if(x % n == 0) return true;
        return false;
    }
}
