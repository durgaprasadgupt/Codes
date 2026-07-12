class Solution {
    public int longestConsecutive(int[] nums) 
    {
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int item: nums)
        {
            map.put(item,0);
        }

        int count = 0;
        int ans = 0;
        int prev = 0;
        boolean start = true;
        for(int item: map.keySet())
        {
            if(start)
            {
                prev = item;
                count++;
                start = false;
            }
            else
            {
                if(item == prev+1)
                {
                    prev = item;
                    count++;
                }
                else
                {
                    ans = Math.max(count,ans);
                    count = 1;
                    prev = item;
                }
            }
            


        } 
        return Math.max(count,ans);

        
    }
}
