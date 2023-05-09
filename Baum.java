import Prog1Tools.IOTools;

public class Baum {
    private int wert; // Inhalt
    private Baum links; // Verweis auf linken Teilbaum
    private Baum rechts; // Verweis auf rechten Teilbaum

    public Baum(int x) {
        wert = x;
    }

    public void insert(int x) {
        if (x < wert) { // im linken Ast einf�gen

            if (links == null) {
                links = new Baum(x);
            } else {
                links.insert(x);
            }
        } else { // im rechten Ast einf�gen

            if (rechts == null) {
                rechts = new Baum(x);
            } else {
                rechts.insert(x);
            }
        }
    }

    public int maxIt() { // iterativ
    }
    
    public int max() { // rekursiv
    }
        
    public int min() {
        if (links==null) {
            return wert;
        }
        else
            return links.min();
    }
    
    public String toString() { // Inorder-Traversierung
        String s = "";
        if (links != null) {
            s = s + links.toString();
            s = s + ", ";
        }
        s = s + wert;
        if (rechts != null) {
            s = s + ", ";
            s = s + rechts.toString();
        }
        return s;
    }

    public String toPostorder() { // Traversierung
    }

    public static void main(String[] args) {
        System.out.println("Beliebig viele int-Werte " +
                           "eingeben (Wert 0 fuer Abbruch):");

        int n = IOTools.readInteger();
        Baum b = new Baum(n);

        while (n != 0) {
            n = IOTools.readInteger();
            b.insert(n);
        }

        System.out.println("Sortierte Liste: " + b);
		System.out.println("Max: " + b.maxIt());
        System.out.println("Max: " + b.max());
        System.out.println("Min: " + b.min());
        System.out.println("Postorder Liste: " + b.toPostorder());
    }
}
