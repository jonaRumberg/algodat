import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;


public class ADT {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.push(4);
        ll.push(3);
        ll.push(7);
        ll.push(3);
        ll.push(6);
        ll.push(6);
        ll.push(1);

        TreeSet<Integer> tsll = duplicateFree(ll);
        Iterator<Integer> tsllit = tsll.iterator();

        while(tsllit.hasNext()){
            System.out.println(tsllit.next());
        }
    }

    public static <T> TreeSet<T> duplicateFree (Collection<T> c){
        TreeSet<T> ts = new TreeSet<T>();

        Iterator<T> it = c.iterator();
        
        while(it.hasNext()){
            T temp = it.next();
            if(!ts.add(temp)){
                System.out.println("duplicate detected");
            }
        }

        return ts;
    }
}
