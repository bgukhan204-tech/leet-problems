class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, Integer> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for (String s : strs) {

            char[] ch = s.toCharArray();
            Arrays.sort(ch);

            String sorted = new String(ch);

            int idx;

            if (map.containsKey(sorted)) {

                idx = map.get(sorted);

            } else {

                ans.add(new ArrayList<>());

                idx = ans.size() - 1;

                map.put(sorted, idx);
            }

            ans.get(idx).add(s);
        }

        return ans;
    }
}