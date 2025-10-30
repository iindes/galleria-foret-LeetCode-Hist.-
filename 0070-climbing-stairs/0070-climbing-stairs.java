class Solution {
    public int climbStairs(int n) {
        int cnt = 0;
        if (n < 4) {
            return n;
        }
        int cur = 0;
        int pre = 3;
        int prepre = 2;
        for (int i = 3; i < n; i++) {
            cur = pre + prepre;
            prepre = pre;
            pre = cur;
        }
        return cur;
    }
}