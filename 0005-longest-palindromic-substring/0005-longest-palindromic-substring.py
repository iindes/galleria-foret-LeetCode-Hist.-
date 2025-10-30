class Solution:
    def longestPalindrome(self, s: str) -> str:
        cnt=0
        a=''
        for i in range (len(s)):
            f=r=i
            while f>=0 and r<len(s) and s[f]==s[r]:
                if (r-f+1)>cnt:
                    cnt=r-f+1
                    a=s[f:r+1]
                f-=1
                r+=1
            f=i
            r=i+1
            while f>=0 and r<len(s) and s[f]==s[r]:
                if (r-f+1)>cnt:
                    cnt=r-f+1
                    a=s[f:r+1]
                f-=1
                r+=1
        return a
            
