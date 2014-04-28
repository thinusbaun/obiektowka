package katner.po7;

class Czworokat extends Figura
{
	private Punkt pkt1;
	private Punkt pkt2;
	private Punkt pkt3;
	private Punkt pkt4;

	Czworokat()
	{
                super();
		pkt1 = new Punkt(0,0);
		pkt2 = new Punkt(0,0);
		pkt3 = new Punkt(0,0);
		pkt4 = new Punkt(0,0);
	}

	Czworokat(Punkt p1, Punkt p2, Punkt p3, Punkt p4, String kolor)
	{
                super(kolor);
		pkt1 = new Punkt(p1);
		pkt2 = new Punkt(p2);
		pkt3 = new Punkt(p3);
		pkt4 = new Punkt(p4);
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

	public Punkt getPkt4()
	{
		return pkt4;
	}

	public String toString()
	{
		return getKolor() + "   " + pkt1 + " -> " + pkt2 + " -> " + pkt3 + " -> " + pkt4;
	}

	public void przesun(int dx, int dy)
	{
		pkt1.przesun(dx,dy);
		pkt2.przesun(dx,dy);
		pkt3.przesun(dx,dy);
		pkt4.przesun(dx,dy);
	}

}
