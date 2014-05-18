package katner.po11;

import java.util.LinkedList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;

class Lista extends LinkedList<Integer>
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
    final Iterator p = super.iterator();
    return new Iterator()
    {
      @Override
      public Object next()
      {
        Object tmp = p.next();
        p.next();
        return tmp;
      }
      @Override
      public boolean hasNext()
      {
        return p.hasNext();
      }
      public void remove()
      {
        p.remove();
      }
    };
  }
}
