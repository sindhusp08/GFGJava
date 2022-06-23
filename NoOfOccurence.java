import java.util.*;
public class NoOfOccurence {

    public void charCount(String str)
    {
       
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        char c[]=str.toCharArray();
        for(char ch:c)
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch, 1);
            }

        }
        for(Map.Entry<Character,Integer> entry:map.entrySet() )
        {
            System.out.println(entry.getKey() +" : " +entry.getValue());
        }
    }
       public static void main(String[] args) {

        NoOfOccurence n=new NoOfOccurence();
            n.charCount("Sahashya");
        
       }

    
}
