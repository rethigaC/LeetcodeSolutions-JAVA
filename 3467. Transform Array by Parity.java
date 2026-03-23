class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int k=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                arr[i]=1;  }
            else{
            arr[i]=0;}
        }
        Arrays.sort(arr);
        return arr;       
    }
}
