package katner.po6;

class Figura
{
  Boolean waliduj(Linia... linie)
  {
    Boolean tmp = true;
    for (int i = 0;i<linie.length-1;i++)
    {
      if (linie[i].getPkt2() != linie[i+1].getPkt1())
      {
        tmp = false;
      }
    }
    if (linie[0].getPkt1() != linie[linie.length-1].getPkt2())
    {
      tmp = false;
    }
    return tmp;
  }
}

