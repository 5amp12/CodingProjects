import java.lang.reflect.Array;
import java.util.Arrays;
class TwoSum {
    //******This code finds the postion of the two numbers in the array that when added together form the target number******
    int[] nums;
    private static final String Array = null;  
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        boolean Awnser = false;
        int[] numbers = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int x = 0; x < nums.length; x++){
                if (i==x){
                    x+= 1;
                }
                if (nums[i]+nums[x] == target){
                    Awnser = true;
                    numbers[0] = i;
                    numbers[1] = x;
                    break;
                }


            }
            if (Awnser == true){
                break;
            }
        }
        return numbers;
    }

}