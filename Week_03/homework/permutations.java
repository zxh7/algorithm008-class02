class Solution {
    List<List<Integer>> res = new LinkedList<>();
    List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track);
        return res;
    }
    void backtrack(int[] nums, LinkedList<Integer> track) {
        if(track.size()==nums.length){
            res.add(new ArrayList<>(track));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(track.contains(nums[i])){continue;}
            track.add(nums[i]);
            backtrack(nums,track);
            track.removeLast();
        }
    }
}