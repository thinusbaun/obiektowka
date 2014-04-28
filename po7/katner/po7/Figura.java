package katner.po7;

class Figura
{
  protected String kolor;
  Figura()
  {
    kolor = "Czarny";
  }

  Figura(String kol)
  {
    kolor = kol;
  }

  void setKolor(String kol)
  {
    kolor = kol;
  }

  String getKolor()
  {
    return kolor;
  }

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

