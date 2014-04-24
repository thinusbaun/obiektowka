package katner.po6;

import java.util.*;

class Obraz
{
	private Vector<Object> elementy;
	Obraz()
	{
		elementy = new Vector<Object>();
	}

	public void dodajTrojkat(Trojkat t)
	{
		elementy.add(t);
	}

	public void dodajCzworokat(Czworokat cz)
	{
		elementy.add(cz);
	}

	public void przesun(int dx, int dy)
	{
		for (int i=0; i< elementy.size(); i++)
		{
			if (Trojkat.class.isInstance(elementy.get(i)))
				{
					Trojkat tmp = (Trojkat) elementy.get(i);
					tmp.przesun(dx,dy);
				} else if (Czworokat.class.isInstance(elementy.get(i)))
				{
					Czworokat tmp = (Czworokat) elementy.get(i);
					tmp.przesun(dx,dy);
				}
		}
	}

	public String rysuj()
	{
		String temp = new String();
		for (int i=0; i< elementy.size(); i++)
		{
			if (Trojkat.class.isInstance(elementy.get(i)))
				{
					Trojkat tmp = (Trojkat) elementy.get(i);
					temp = temp + tmp + "\n";
				} else if (Czworokat.class.isInstance(elementy.get(i)))
				{
					Czworokat tmp = (Czworokat) elementy.get(i);
					temp = temp + tmp + "\n";
				}
		}
		return temp;
	}
}
