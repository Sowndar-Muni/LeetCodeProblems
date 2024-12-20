class Solution {
    public boolean containsDuplicate(int[] nums) {
    
    Set<Integer> nm=new HashSet<>();
    for(int n : nums){
        if(nm.contains(n)){
            return true;
        }
        nm.add(n);
    }
    return false;
    }
}