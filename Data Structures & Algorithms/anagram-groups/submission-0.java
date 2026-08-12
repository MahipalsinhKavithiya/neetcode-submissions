class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> list = new HashMap<>();
        for(int i = 0; i < strs.length;i++){
            String s = strs[i];

            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortS = new String(arr);
            
            if(list.containsKey(sortS)){
                list.get(sortS).add(s);
            }
            else{
                List<String> group = new ArrayList<>();
                group.add(s);
                list.put(sortS,group);
            }
            
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> group : list.values()){
            result.add(group);
        }
        return result;
    }
}
