import java.util.HashMap;

public class romanToIntegar{
    public static int romanToInt(String s) {
        HashMap<Character, Integer> mapset = new HashMap<>();
        mapset.put('I', 1);
        mapset.put('V', 5);
        mapset.put('X', 10);
        mapset.put('L', 50);
        mapset.put('C', 100);
        mapset.put('D', 500);
        mapset.put('M', 1000);
        int result = 0;
        
        for(int i = s.length()-1; i >= 0 ; i--){
            if(i == s.length()-1){
                result = mapset.get(s.charAt(i));
            }
            else{
                if(mapset.get(s.charAt(i)) < mapset.get(s.charAt(i+1))){
                    result = result - mapset.get(s.charAt(i));
                }
                else{
                    result = result + mapset.get(s.charAt(i));
                }
            }
        }
        return result;
    }
    public static void main(String [] args){
        System.out.println("Result = " + romanToInt("MCMXCIV"));
    }
}