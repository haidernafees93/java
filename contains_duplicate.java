import java.util.HashSet;

public class contains_duplicate{
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        int[] arr = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println("Result = " + containsDuplicate(arr));
    }
}