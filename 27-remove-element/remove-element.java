class Solution {
    public int removeElement(int[] nums, int val) {

        int count = 0;
        int left = 0;
        int right = nums.length-1;
        while(left <= right)
        {
        while(left <= right && nums[left] != val)
        {
            left++;
        }
         while(left <= right && nums[right] == val)
        {
            right--;
            count++;
        }
        if(left <= right)
        {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        count++;
        }
        left++;
        right--;
        }
    return nums.length-count;    

}
}