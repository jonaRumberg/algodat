public class ListeF<T extends Comparable<T>> {

  private T[] element;
  private int lastIndex;
  
  @SuppressWarnings("unchecked")
  public ListeF (int len) {
    element = (T[]) new Object[len];
    lastIndex = -1;  // leere Liste
  }

  public void sortedInsert(T o) {
  	if (lastIndex < 0) { // leere Liste
  		lastIndex++;
  		element[lastIndex] = o;
  	}
  	else if (lastIndex < element.length-1){ // mittendrin
  		int pos = 0;
  		for (int i = 0; i < lastIndex + 1; i++) {
			if (o.compareTo(element[i]) == 1) { // > 0
				pos++;	
			}
		}
			
		for (int j = lastIndex + 1; j > pos; j--) {
			element[j] = element[j - 1];
			
		}
		element[pos] = o;
		lastIndex++;
		
		// verschieben und einfügen gemeinsam
		for (int i = lastIndex; i > 0; i--) {
			if (element[i].compareTo(o) > 0) { //x.compareTo(y) x=y ->0 x < y -> <0 x > y -> >0
				element[i+1] = element[i];
			}
			else {
				elment[i+1] = o;
			}
		}
  	}
  	
  }



  
  public void insert (T o) {   // am Ende einfügen
    if (lastIndex == element.length-1)
      throw new RuntimeException("Liste ist bereits voll!");
    lastIndex++;
    element[lastIndex] = o;
  }

  public void insert (T o, int k) {  // bei k einfügen
    if (lastIndex == element.length-1)
      throw new RuntimeException("Liste ist bereits voll!");
    if (k < 0 || k >= element.length)
      throw new RuntimeException("Unzulaessige Position: " + k);
    if (k > lastIndex)
      insert(o); // am Ende einfügen
    else { 
      lastIndex++;

      // Platz schaffen für das neue Element
      for (int i=lastIndex; i>k; i--)
        element[i] = element[i-1];
        
      // einfügen
      element[k] = o;
    }
  }
  
  public void remove (int k) {
    if (k < 0 || k >= element.length)
      throw new RuntimeException("Unzulaessige Position: " + k);
    if (k <= lastIndex) {
      // Aufrücken der nachfolgenden Elemente
      for (int i=k; i<lastIndex; i++)
        element[i] = element[i+1];
      element[lastIndex] = null;
      lastIndex--;
    }
  }
  
  @SuppressWarnings("unchecked")
  public T elementAt(int k) {
    if (k < 0 || k > lastIndex)
      throw new RuntimeException("Unzulaessige Position: " + k);
    return element[k];
  }
  
  public String toString() {
    String s = "(";
    for (int i=0; i<lastIndex; i++)
      s = s + element[i] + ", ";
    if (lastIndex != -1)
      s = s + element[lastIndex];
    return s + ")";
  }


}
