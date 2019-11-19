package zf.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Zfmap {
    Map<Integer, Integer> zm=new HashMap<Integer, Integer>();
    public Zfmap() {
        // TODO Auto-generated constructor stub
        zm.put(1, 101);
        zm.put(2, 102);
        zm.put(3, 103);
        zm.put(4, 104);
        zm.put(5, 105);
        Set<Integer> set=zm.keySet();
        for(int a:set){
            System.out.println(a);
        }
        Collection<Integer> collection=zm.values();
        for(int b:collection){
            System.out.println(b);
        }
        zm.remove(5);
        Iterator<Integer> iterable=zm.keySet().iterator(); 
        while(iterable.hasNext()){
            int a=iterable.next();
            int b=zm.get(a);
            System.out.println("key:"+a+" "+"value:"+b);
        }
        System.out.println(zm.containsKey(2)+" "+zm.containsValue(103)+" "+zm.get(4));
        
    }
}