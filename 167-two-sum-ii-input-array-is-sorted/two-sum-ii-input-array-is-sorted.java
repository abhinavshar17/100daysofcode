class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int[2];
        int start=0;
        int end=numbers.length-1; //last index
        while(start< end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                arr[0]=start+1;
                arr[1]=end+1;
                return arr;
            }
            else if(sum>target){
                end--;
            }
            else{
                start++;
            }
            
        }
return arr;
    }
}