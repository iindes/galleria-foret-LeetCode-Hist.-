class Solution {
    public boolean isPalindrome(String s) {
        String s2 = s.toLowerCase();
        String s3 = s2.replaceAll("[^a-z0-9]","");
        int len = s3.length();
        for (int i = 0; i < (len/2); i++) {
            if (s3.charAt(i) != s3.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }
}