class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map <String, List<String>> res = new HashMap <>(); // mapping charCount to list of Anagrams

        for(String s : strs){

            int[] key = new int[26];
            char[] chars = s.toCharArray();

            for(char c : chars){
                key[c - 'a']++;
            }

            String keyString = Arrays.toString(key);
            res.putIfAbsent(keyString, new ArrayList<String>());
            res.get(keyString).add(s);
            
        }
    
        return new ArrayList<>(res.values());

    }
}
