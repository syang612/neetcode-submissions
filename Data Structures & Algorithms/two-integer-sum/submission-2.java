class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> ans = new HashMap<>();
        int[] indices = new int[2];

        for(int i  = 0; i < nums.length; i++){
            if(ans.containsKey(target - nums[i])){
                indices[0] = ans.get(target-nums[i]);
                indices[1] = i;
            }
            else if(!ans.containsKey(nums[i])){
                ans.put(nums[i], i);
            }
        }  
        return indices; 
    }
}
