package jihelei;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.jws.soap.SOAPBinding;

public class Zfcollection {
    private Collection<Integer> co=new ArrayList<Integer> ();
    public Collection<Integer> getCo() {
        return co;
    }
    public void setCo(Collection<Integer> co) {
        this.co = co;
    }
    private int temp;
    private Iterator<Integer> it;
    public Zfcollection() {
        // TODO Auto-generated constructor stub
        co.add(11);
        co.add(12);
        co.add(13);
        co.add(14);
        co.add(15);    
    }
    public void print(){

        it=co.iterator();
        while(it.hasNext()){
            temp=it.next();
            System.out.print(temp+" ");
            System.out.println();
        }
    }
    public void delete(){
        co.remove(11);
        co.remove(12);
        it=co.iterator();
        while(it.hasNext()){
            temp=it.next();
            System.out.print(temp+" ");
        }
        System.out.println();
    }
    public void size(){
        System.out.println(co.size());
        co.remove(13);
        co.remove(14);
        co.remove(15);
        System.out.println(co.isEmpty());
    }
}