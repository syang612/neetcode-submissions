class Solution {
    public boolean isAnagram(String s, String t) {

        Map <Character, Integer> check = new HashMap<>();

        if(s.length() != t.length())
            return false;

        for(int i = 0; i < s.length(); i++){
            check.putIfAbsent(s.charAt(i), 0);
            check.replace(s.charAt(i), check.get(s.charAt(i))+1);
        }

        for(int i = 0; i < t.length(); i++){
            if(!check.containsKey(t.charAt(i)))
                return false;
            check.replace(t.charAt(i), check.get(t.charAt(i))-1);
        }
        
        for(Integer i : check.values()){
            if(i != 0){
                return false;
            }
        }
    return true;
    }
}
