package katner.po9;

class Trojkat extends Figura
{
	private Punkt pkt1;
	private Punkt pkt2;
	private Punkt pkt3;

	Trojkat()
	{
		pkt1 = new Punkt(0,0);
		pkt2 = new Punkt(0,0);
		pkt3 = new Punkt(0,0);
	}

	Trojkat(Punkt p1, Punkt p2, Punkt p3)
	{
		pkt1 = new Punkt(p1);
		pkt2 = new Punkt(p2);
		pkt3 = new Punkt(p3);
	}

	Trojkat(Trojkat t)
	{
		this(t.getPkt1(), t.getPkt2(), t.getPkt3());
	}

	public Punkt getPkt1()
	{
		return pkt1;
	}

	public Punkt getPkt2()
	{
		return pkt2;
	}

	public Punkt getPkt3()
	{
		return pkt3;
	}

        public void setPkt1(Punkt pkt)
        {
                pkt1 = pkt;
        }

        public void setPkt2(Punkt pkt)
        {
                pkt2 = pkt;
        }
        public void setPkt3(Punkt pkt)
        {
                pkt3 = pkt;
        }
	public String toString()
	{
		return pkt1 + " -> " + pkt2 + " -> " + pkt3;
	}

	public void przesun(int dx, int dy)
	{
		pkt1.przesun(dx,dy);
		pkt2.przesun(dx,dy);
		pkt3.przesun(dx,dy);
	}
  void skaluj(int skala)
  {
    Punkt glowny = getPkt1();
    Punkt pkt = getPkt2();
    pkt.setY(glowny.getY()-(glowny.getY()-pkt.getY())*skala);
    pkt.setX(glowny.getY()-(glowny.getY()-pkt.getY())*skala);
    setPkt2(pkt);
    pkt = getPkt3();
    pkt.setY(glowny.getY()-(glowny.getY()-pkt.getY())*skala);
    pkt.setX(glowny.getY()-(glowny.getY()-pkt.getY())*skala);
    setPkt3(pkt);
  }

  double pole()
  {
    Linia l1 = new Linia(pkt1, pkt2);
    Linia l2 = new Linia(pkt2, pkt3);
    Linia l3 = new Linia(pkt3, pkt1);
    double a = l1.dlugosc();
    double b = l2.dlugosc();
    double c = l3.dlugosc();
    double p = (a+b+c)/2;
    return Math.sqrt(p*(p-a)*(p-b)*(p-c));
  }

  double obwod()
  {
    Linia l1 = new Linia(pkt1, pkt2);
    Linia l2 = new Linia(pkt2, pkt3);
    Linia l3 = new Linia(pkt3, pkt1);
    return l1.dlugosc() + l2.dlugosc() + l3.dlugosc();
  }

}
