package katner.po9;

class Punkt
{
	private int x;
	private int y;
	public Punkt()
	{
		x = 0;
		y = 0;
	}

	public Punkt(int xx, int yy)
	{
		x = xx;
		y = yy;
	}

	public Punkt(Punkt pkt)
	{
		this.setX(pkt.getX());
		this.setY(pkt.getY());
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public void setX(int xx)
	{
		x = xx;
	}

	public void setY(int yy)
	{
		y = yy;
	}

	public String toString()
	{
		return "(" + x +" , " + y + ")";
	}

	public void przesun(int dx, int dy)
	{
		x += dx;
		y += dy;
	}
}
