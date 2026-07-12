class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
        {
            return 0;
        }
            
        // int ans = 1;
        Map<Character,Integer> map = new HashMap<>();
        int index = 0;
        int ans = 0;
        int count = 0;
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            // This if condition is the main logic for figuring out whether to consider this character as if it is inside the sliding window or not.
            if(map.containsKey(ch) && map.get(ch)>=index)
            {
                // System.out.println(count +" "+ ans +" "+i+" "+map.get(ch)+" "+index);
                ans = Math.max(count, ans);  // This ensures ans always contains max count
                count = i - map.get(ch);  // This gives the current count of characters in the sliding window
                index = map.get(ch)+1;  // This gives starting index of sliding window
                map.put(ch,i);  // This updates the index of character in the map...
                // System.out.println("After : "+ count + " "+ " "+ans +" "+" "+index);
            }
            else
            {
                map.put(ch,i);
                count++;
            }
        }
        return Math.max(count,ans);

    }
}
