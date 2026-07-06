class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();
        

        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String keyString = Arrays.toString(count);
            map.putIfAbsent(keyString, new ArrayList<>());
            map.get(keyString).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
