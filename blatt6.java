import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class blatt6 {
    public static void main(String[] args) {

        //test method aufgabe18
        TreeSet<Integer> t = aufgabe18(33);
        Iterator<Integer> it = t.iterator();

        while(it.hasNext()){
            System.out.print(" " + it.next());
        }
    }

    public static Set<Integer> aufgabe17() {

        while(set.size() < 7){
            set.add((int) (Math.random() * 49 + 1));
        }

        return set;
    }

    public static TreeSet<Integer> aufgabe18(int n) {
        TreeSet<Integer> t = new TreeSet<Integer>();

        for (int i = 2; i < n; i++) {
            t.add(i);
        }

        TreeSet<Integer> s = new TreeSet<>();

        int p = 2;

        while(p*p < n){
            for (int i = 2; i*p < n; i++) {
                s.add(p*i);
            }

            if(p==2){
                p = 3;
            } else {
                while(s.contains(p+=2)){}
            }
        }

        t.removeAll(s);
        
        return t;
    }

    
}
