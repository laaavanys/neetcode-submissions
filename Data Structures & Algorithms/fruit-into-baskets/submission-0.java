class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int low=0;
        int res=-1;
        Map<Integer,Integer>freq=new HashMap<>();

        for(int high=0;high<n;high++){
            int f=fruits[high];
            freq.put(f,freq.getOrDefault(f,0)+1);
            
            while(freq.size()>2){
                int left=fruits[low];
                freq.put(left,freq.get(left)-1);
                if(freq.get(left)==0)
                freq.remove(left);
                low++;
            }  if(freq.size()<=2)
            res=Math.max(res, high-low+1);
        } return res;
    }
}