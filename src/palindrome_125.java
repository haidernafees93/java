import java.util.ArrayList;

public class palidrom_125 {
    public static void main(String[] args)
    {
        String s = "race a car";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        int count = 0;
        ArrayList<Character> original = new ArrayList<Character>();
        ArrayList<Character> palindrome = new ArrayList<Character>();

        for(int i = s.length()-1; i >= 0; i--)
        {
            palindrome.add(s.charAt(i));
            original.add(s.charAt(count));
            count++;
        }

        boolean result;
        result = palindrome.equals(original);
        System.out.println(result);
    }
}
