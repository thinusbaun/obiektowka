package katner.po9;

abstract class Czworokat extends Figura
{
	private Punkt pkt1;
	private Punkt pkt2;
	private Punkt pkt3;
	private Punkt pkt4;

	Czworokat()
	{
		pkt1 = new Punkt(0,0);
		pkt2 = new Punkt(0,0);
		pkt3 = new Punkt(0,0);
		pkt4 = new Punkt(0,0);
	}

	Czworokat(Punkt p1, Punkt p2, Punkt p3, Punkt p4)
	{
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
	public void setPkt4(Punkt pkt)
	{
		 pkt4 = pkt;
	}
	public String toString()
	{
		return pkt1 + " -> " + pkt2 + " -> " + pkt3 + " -> " + pkt4;
	}
}
