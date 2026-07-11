class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] res = new int[nums.length];
        Map <Integer, Integer> indexProds = new HashMap <>();
        
        for(int i = 0; i < nums.length; i++){
            indexProds.put(i, 1);
        }

        for(int i = 0; i < nums.length; i++){
            for (Integer index : indexProds.keySet()){
                if(!index.equals(i)){
                    indexProds.replace(index, indexProds.get(index)*nums[i]);
                }
            }
        }

        for(Integer index : indexProds.keySet()){
            res[index] = indexProds.get(index);
        }

        return res;
    }
}  
