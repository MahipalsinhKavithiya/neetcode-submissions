class Solution {
    public static int[] topKFrequent(int[] arr,int k){

        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer>[] bucket = new List[arr.length+1];
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] result = new int[k];
        int counter = 0;
        for (int pos = bucket.length -1 ; pos > 0 && counter < k; pos--) {
            if(bucket[pos] != null){
                for(int num : bucket[pos]){
                    result[counter++] = num;
                    if(counter == k){
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
