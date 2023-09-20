import java.util.Map;
import java.util.HashMap;

public class Two_Sum_Hash{
    //##### THE TWO SUM SOLUTIUON BUT USING A HASH INSTEAD ########
    public static void main(String[] args)
    {
        Two_Sum_Hash t = new Two_Sum_Hash();
        int[] nums = {2,7,11,15};
        int target = 11;
        t.twoSum(nums, target);
    }

    public void twoSum(int[] nums, int target)
    {
        int[] numbers = new int[2];
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
           int spareNum = target - nums[i];

            if (hash.containsKey(spareNum) && hash.get(spareNum) != i){
                // numbers[0] = i;
                // numbers[1] = hash.get(spareNum);

                System.out.println(i);
                System.out.println(hash.get(spareNum));
                break;
                
                
            }
        }
       

          

        //System.out.println(numbers.toString());
    }

}