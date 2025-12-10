class Solution {
    public List<List<Integer>> combinationSum(int[] candi, int target) {List<List<Integer>> res = new ArrayList<>();
//start backtracking from 0.
        back(candi, target, 0, new ArrayList<>(), res);
	return res;
    }

    private static void back(int[] candi, int target, int start,
    		List<Integer> curr, List<List<Integer>> res) {
//if we fail to find proper combi
    	if (target < 0) {
            return;
        }
//if we find a proper combi
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
//now trying candidates.
        for (int i = start; i < candi.length; i++) {
//add candi. to current combi.
            curr.add(candi[i]);
//options for remaining value after subtracting candi.
            back(candi, target - candi[i], i, curr, res);
//remove last elem.--candi--to try next one.
            curr.remove(curr.size() - 1);
        }
    }
}