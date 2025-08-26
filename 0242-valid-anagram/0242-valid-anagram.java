class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        //cut the matching characters from S
        for(char c : t.toCharArray()){
            if(!map.containsKey(c)) return false;
            map.put(c, map.get(c) -1); //decrement feequency by one
            if(map.get(c)==0) map.remove(c); //remove elements if frequency zero
        }
        return map.isEmpty();
    }
}