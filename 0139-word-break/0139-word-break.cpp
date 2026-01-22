class Solution {
public:
    bool wordBreak(string s, vector<string>& wordDict) {
        const int n = s.length();
        const int ml = getml(wordDict);
        const unordered_set<string> wordSet{begin(wordDict), end(wordDict)};
        vector<int> chk(n+1);
        chk[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = i-1; j >=0; --j) {
                if (i-j>ml) {
                    break;
                }
                if (chk[j] && wordSet.count(s.substr(j,i-j))) {
                    chk[i] = true;
                    break;
                }
            }
        }
        return chk[n];
    }


private:
int getml(const vector<string>& wordDict) {
    return max_element(begin(wordDict), end(wordDict), [](const auto& a, const auto& b) {
        return a.length() < b.length();
    })
    ->length();
}
};