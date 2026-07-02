class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> check = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(check.containsKey(nums[i])){
                return true;
            }
            else{
                check.put(nums[i], true);
            }
        }
        return false;
    }
}