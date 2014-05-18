package katner.po11;

import java.util.*;

class main
{
  public static void main(String[] args)
  {
    Lista l = new Lista();
l.add(5); l.add(2); l.add(7); l.add(4); l.add(3); l.add(5);
Iterator it=l.iterator();

while (it.hasNext()) System.out.println(it.next());
  }
}
