class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> map= new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
        }

        for(int value : map.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }

    /*
    Pattern:
    Frequency Count / HashMap

    Core Idea:
    Anagram means same character frequency.

    Approach:
    +1 for characters in s
    -1 for characters in t
    all counts must become 0 if string is anagram

    Alternatives:
    1. Sort + compare → O(N log N)
    2. Two HashMaps + compare → O(N)

    Algorithm Mistake:
    (no algorithm mistake)
    */
}
