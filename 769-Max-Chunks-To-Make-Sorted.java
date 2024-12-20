class Solution {
    public int maxChunksToSorted(int[] arr) {
        int i;
        int max=0;
        int count=0;
        for(i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
            if(i==max){
                count++;
            }
        }
        return count;
    }
}