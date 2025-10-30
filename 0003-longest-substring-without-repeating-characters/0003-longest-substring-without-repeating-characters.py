class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxlen=0
        start=0
        dupdic={}
        for i in range (len(s)):
            a=s[i]
            if a in dupdic and dupdic[a]>=start:
                start=dupdic[a]+1
            dupdic[a]=i
            curlen=i-start+1
            maxlen=max(maxlen,curlen)
        return maxlen