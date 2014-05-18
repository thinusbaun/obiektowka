package katner.po10;

import java.util.*;

class main
{
  public static void main(String[] args)
  {
    Lista lista = new Lista();
    Random rnd = new Random();
    for (int i = 0; i<15; i++)
    {
      lista.add(rnd.nextInt(100));
    }
    for(int i = 0; i<lista.size(); i++)
    {
      System.out.println(lista.get(i));
    }
  }
}
