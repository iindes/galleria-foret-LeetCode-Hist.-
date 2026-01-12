class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        rec(res,0,0,"",n);
        return res;
    }
    public void rec(List<String> res, int l, int r, String s, int n) {
        if (s.length() == n*2) {
            res.add(s);
            return;
        }
        if (l<n) {
            rec(res,l+1,r,s+"(",n);
        }
        if  (r<l) {
            rec(res,l,r+1,s+")",n);
        }
    }
}