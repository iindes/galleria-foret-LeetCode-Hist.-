class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        perm(nums,0,ans);
        return ans;
    }
    private void perm(int[] nums, int i, List<List<Integer>> ans) {
        if (i == nums.length) {
            List<Integer> permt = new ArrayList<>();
            for (int n : nums) {
                permt.add(n);
            }
            ans.add(permt);
            return;
        }
        for (int j = i; j < nums.length; j++) {
            swap(nums, i,j);
            perm(nums, i+1, ans);
            swap(nums, i, j);
        }

    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}