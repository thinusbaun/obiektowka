package katner.po9;

class Linia
{
	private Punkt pkt1;
	private Punkt pkt2;

	Linia()
	{
		pkt1 = new Punkt(0,0);
		pkt2 = new Punkt(0,0);
	}

	Linia(Punkt p1, Punkt p2)
	{
		pkt1 = new Punkt(p1);
		pkt2 = new Punkt(p2);
	}

	Linia(Linia l)
	{
		this(l.getPkt1(), l.getPkt2());
	}

	public Punkt getPkt1()
	{
		return pkt1;
	}

	public Punkt getPkt2()
	{
		return pkt2;
	}

	public String toString()
	{
		return pkt1 + " -> " + pkt2;
	}

	public void przesun(int dx, int dy)
	{
		pkt1.przesun(dx,dy);
		pkt2.przesun(dx,dy);
	}

        public double dlugosc()
        {
          return Math.sqrt(Math.pow(pkt1.getX() - pkt2.getX(), 2) + Math.pow(pkt1.getY() - pkt2.getY(), 2));
        }

}
