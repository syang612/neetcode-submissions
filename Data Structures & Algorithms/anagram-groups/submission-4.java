class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> ans = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            int[] alp = new int[26];
            char[] word = strs[i].toCharArray();
            for(char c : word){
                alp[c - 'a']++;
            }
            String key = Arrays.toString(alp);
            if(!ans.containsKey(key)){
                List<String> newWord = new ArrayList<>();
                newWord.add(strs[i]);
                ans.put(key, newWord);
            }
            else{
                ans.get(key).add(strs[i]);
            }
        }

        List<List<String>> fin = new ArrayList<>();
        
        for(String a : ans.keySet()){
            fin.add(ans.get(a));
        }
       return fin;
    }
}
