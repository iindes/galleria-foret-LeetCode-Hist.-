class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums=set(nums)
        dic={}
        maxval=0
        for i in nums:
            l=dic.get(i-1,0)
            r=dic.get(i+1,0)
            cnt=l+r+1
            dic[i-l]=cnt
            dic[i+r]=cnt
            maxval=max(maxval,cnt)
        return maxval