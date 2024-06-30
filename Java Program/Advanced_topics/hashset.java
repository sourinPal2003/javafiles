package Advanced_topics;

import java.util.HashSet;
import java.util.Iterator;
public class hashset{

    public static void main(String args[]){
  
        HashSet<Object> hs = new HashSet<>();
        hs.add(10);
        hs.add(10.4);
        hs.add("sjs");
        hs.add('a');

        System.out.println(hs);
        System.out.println(hs.contains("sjds"));

        Iterator<Object> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());  
        }

        
        
    }
}
