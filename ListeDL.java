public class ListeDL<T> {

  private static class ElementDL<E> {
    private E            element;  // Inhalt des Listenelements
    private ElementDL<E> next;     // Verweis auf den Nachfolger
    private ElementDL<E> prev;     // Verweis auf den Vorg�nger
    public ElementDL (E o) {
      element = o;
      next = null;
      prev = null;
    }
  }
  
  private ElementDL<T> head;       // Referenz auf den Anfang der Liste
  private ElementDL<T> tail;       // Referenz auf das Ende der Liste
  
  public ListeDL () {
    head = null;
    tail = null;
  }

  public ListeDL (T o) {
    head = new ElementDL<T>(o);
    tail = head;
  }


// NOCH NICHT FERTIG!!!

  // Methode, um o am Ende einzuf�gen
  public ElementDL<T> insert (T o) {   

    ...

    return tail;
  }

  // Methode, um o an der Postion pos einf�gen
  public ElementDL<T> insert (T o, ElementDL<T> pos) {  
    ElementDL<T> newEl = new ElementDL<T>(o);

    ...

    return newEl;
  }
  
  // Element e l�schen
  public void remove (ElementDL<T> e) {  
  
    ...

  }
  
  public String toString() {
    String s = "(";
 
    ...
 
    return s + ")";
  }

  // Test
  
  public static void main (String[] args) {
    ListeDL<Integer> l = new ListeDL<Integer>();
    l.insert(new Integer(0));
    ElementDL<Integer> eins = l.insert(new Integer(1));
    l.insert(new Integer(3));
    System.out.println(l);
    l.insert(new Integer(2), eins);  // vor eins einf�gen
    System.out.println(l);
    l.remove(eins);  // Nachfolger von eins l�schen
    System.out.println(l);
  }
  
}
