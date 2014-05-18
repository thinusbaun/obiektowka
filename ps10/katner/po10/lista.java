package katner.po10;

import java.util.LinkedList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;

class Lista extends LinkedList<Integer>// implements Iterator
{
  @Override
  public boolean add(Integer obj)
  {
    super.add(obj);
    Collections.sort(this);
    return true;
  }

  @Override
  public void add(int index, Integer obj)
  {
    this.add(obj);
  }

  @Override
  public void addFirst(Integer obj)
  {

  }

  @Override
  public void addLast(Integer obj)
  {

  }
  public Iterator iterator()   
  {
    return new Iterat(super.iterator());
  }

  class Iterat  implements Iterator
  {
    private Iterator parent;
    Iterat(Iterator parent)
    {
      this.parent = parent;
    }
    public Object next()
    {
      Object tmp = parent.next();
      parent.next();
      return tmp;
    }

    public boolean hasNext()
    {
      return parent.hasNext();
    }

    public void remove()
    {
      parent.remove();
    }
  }
}
