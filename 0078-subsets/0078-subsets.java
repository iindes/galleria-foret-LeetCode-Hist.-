class Solution {
    public List<List<Integer>> subsets(int[] arr) {
    List<List<Integer>> res = new ArrayList<>();
//start with index 0
		back(arr,0,new ArrayList<>(),res);
		return res;
	}
	
	public static void back(int[] arr, int i,
			List<Integer> curr, List<List<Integer>> res) {
//add curr. subset to result list.
//as a result all possible combis will be stored in res
		res.add(new ArrayList<>(curr));
//go thru remaining elems.
		for (int j = i; j < arr.length; j++) {
			curr.add(arr[j]);
//recursive step
			back(arr,j+1,curr,res);
			curr.remove(curr.size()-1);
		}
	}

}
