class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        //x ke saare indices store karne ke liye
        List<Integer> list =  new ArrayList<>();

        //ab nums array traverse kar ke x ke saare indicies store karte hai
        for(int i =0; i<nums.length;i++){
            if(nums[i]==x){
                list.add(i);
            }
        }
    //ab ek ans list bana lete hai
    int[] ans =  new int[queries.length];

    //ab har query ko process karna hai
    for(int i = 0;i<queries.length;i++){
        int k  = queries[i];
        //agar kth occurence exist karta hai to
        if(k<=list.size()){
            ans[i] = list.get(k-1);

        }else {
            ans[i] = -1;
    }
    }
    return ans;
}
}
