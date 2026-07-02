class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] answer = new int[k];
        Map <Integer, Integer> res = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!res.containsKey(nums[i])){
                res.put(nums[i], 1);
            }
            else{
                res.put(nums[i], res.get(nums[i]) + 1);
            }
        }

        PriorityQueue<Integer> p = new PriorityQueue<>((a, b) -> res.get(b) - res.get(a));
        for (Integer key : res.keySet()) {
            p.add(key);
        }

        for(int i = 0; i < k; i++){
            answer[i] = p.poll();
        }

        return answer;
    }
}
