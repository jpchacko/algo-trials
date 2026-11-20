package maxdiff.elements;

public class MaxDiffRightMinusLeft {
    public int maximumDifference(int[] nums) {
        int min = nums[0], dist = -1;
        int index = 0;
        for(int i=1;i<nums.length;i++){
            if(min >= nums[i]){
                min = nums[i];
                index = i;
            } else{
                if(dist< nums[i] - min){
                    dist = nums[i] - min;
                }
            }
        }

        return dist;

    }

    public static void main(String[] args) {
        int[] nums = {1,5,2,10};
        System.out.println(new MaxDiffRightMinusLeft().maximumDifference(nums));
    }
}