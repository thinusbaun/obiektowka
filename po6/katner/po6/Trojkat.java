package katner.po6;

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

        Trojkat(Linia l1, Linia l2, Linia l3)
        {
          super();
          if (waliduj(l1, l2, l3))
          {
            pkt1 = new Punkt(l1.getPkt1());
            pkt2 = new Punkt(l2.getPkt1());
            pkt3 = new Punkt(l3.getPkt1());
          } 
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

}
