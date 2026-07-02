class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map <Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null){
                int curr = target - nums[i];
                map.put(curr, i);
            }
            else{
                answer[0] = map.get(nums[i]);
                answer[1] = i;
            }
        }

        return answer;
    }
}
