class Solution {

    public String encode(List<String> strs) {
        String answer = "";
        for(String str : strs){
            answer += str.length() + "#" + str;
        }
        return answer;
    }

    public List<String> decode(String str) {
        List<String> answer = new ArrayList<>();

        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + length;
            answer.add(str.substring(i, j));
            i = j;
        }
        return answer;
    }
}
