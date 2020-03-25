import java.util.HashMap;
import java.util.HashSet;

public class unique_number_of_occurences1 {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> list1 = new HashMap<>();
        HashSet<Integer> list2 = new HashSet<>();

        int length = arr.length;

        for(int i=0; i < length ;i++){
            if(!list1.containsKey(arr[i])){
                list1.put(arr[i],1);
            }
            else{
                list1.put(arr[i], list1.get(arr[i])+1);
            }
        }

        for (Integer key : list1.values()) {
            if(!list2.contains(key)){
                list2.add(key);
            }
            else{
                return false;
            }    
        }
        return true;
    }

    public static void main(String [] args){
        int[] arr = new int[]{-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println("Result = "+ uniqueOccurrences(arr));

    }
}