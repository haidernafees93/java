import java.util.HashMap;

public class hashmap {
    
    public void learnigHashMap(){    
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        hash.put("Hamza", 1);
        hash.put("Hamza", hash.get("Hamza")+1);
        hash.put("Java", 1);
        //hash.remove(3);
        /*
        if(!hash.containsValue("Farhan"))
        {
            System.out.println("Haider is not available");
        }
        for(int i: hash.keySet())
        {
            System.out.println(hash.get(i));
        }
        */
         System.out.println(hash.get("Hamza"));
    }
}
