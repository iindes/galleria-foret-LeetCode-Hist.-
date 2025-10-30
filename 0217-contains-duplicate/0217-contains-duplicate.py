class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        chkarr = set()
        for i in range (0, len(nums)):
            if nums[i] in chkarr:
                return True
            chkarr.add(nums[i])
        return False
