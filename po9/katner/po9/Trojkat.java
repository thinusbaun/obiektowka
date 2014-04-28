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
    Punkt lgorny = getPkt1();
    Punkt pkt = getPkt2();
    pkt.setY(lgorny.getY()-(lgorny.getY()-pkt.getY())*skala);
    setPkt2(pkt);
    pkt = getPkt3();
    pkt.setX(lgorny.getX()-(lgorny.getX()-pkt.getX())*skala);
    setPkt3(pkt);
    pkt = getPkt4();
    pkt.setX(lgorny.getX()-(lgorny.getX()-pkt.getX())*skala);
    pkt.setY(lgorny.getY()-(lgorny.getY()-pkt.getY())*skala);
    setPkt4(pkt);
  }

  float pole()
  {
    float a = Math.sqrt(Math.pow(getPkt2().getX()-getPkt1.getX(),2)+Math.pow(getPkt2().getY()-getPkt1().getX(),2));
    float b = Math.sqrt(Math.pow(getPkt3().getX()-getPkt2.getX(),2)+Math.pow(getPkt3().getY()-getPkt2().getX(),2));
    float c = Math.sqrt(Math.pow(getPkt1().getX()-getPkt3.getX(),2)+Math.pow(getPkt1().getY()-getPkt3().getX(),2));
    float p = (a+b+c)/2;
    return Math.sqrt(p*(p-a)*(p-b)*(p-c));
  }


}
