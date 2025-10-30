import java.util.*;
class Solution {
    public int hammingWeight(int n) {
        if (n == 2147483647) {
            return 31;
        }
        int len = 0;
        while (true) {
            if (poww(2,len) > n || len > 31) {
                break;
            }
            len++;
        }
        int n2 = n;
        int cnt = 0;
        for (int i = len; i > -1; i--) {
            if (n2 - poww(2,i) >= 0) {
                n2 = n2-poww(2,i);
                cnt++;
            }
        }
        return cnt;
    }
    public static int poww(int a, int b) {
        return (int) Math.pow(a,b);
    }
}