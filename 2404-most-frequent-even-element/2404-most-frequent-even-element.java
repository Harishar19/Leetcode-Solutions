class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(num % 2 == 0){
                map.put(num, map.getOrDefault(num,0)+1);
            }
        }
        if(map.isEmpty()){
            return -1;
        }
        int bestNum = Integer.MAX_VALUE;
        int maxFreq = 0;
        for(Map.Entry <Integer, Integer> entry : map.entrySet()){
            int number = entry.getKey();
            int freq = entry.getValue();

            if((freq > maxFreq) || (freq == maxFreq && number < bestNum)) {
                maxFreq = freq;
                bestNum = number;

            }
        }
        return bestNum;
        
    }
}