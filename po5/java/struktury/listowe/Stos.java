package struktury.listowe;

public class Stos
{
	private int pojemnosc;
	private int iloscLiczb = 0;
	private Elem glowa = null;
	public Stos(int ilosc)
	{
		pojemnosc = ilosc;
		System.out.println("Początek życia stosu listowego");
	}

	public void finalize()
	{
		System.out.println("Koniec życia stosu listowego");
	}

	public void push(int value)
	{
		Elem tmp = new Elem(value);
		Elem i = glowa;
		if (i != null)
		{
			while(i.getNext() != null)
			{
				i = i.getNext();
			}
			i.setNext(tmp);
			iloscLiczb++;
		} else
		{
			glowa = tmp;
			iloscLiczb++;
		}

	}
	public Boolean empty()
	{
		return (iloscLiczb == 0);
	}

	public Boolean full()
	{
		int i = 0;
		Elem tmp = glowa;
		while(glowa != null)
		{
			glowa = glowa.getNext();
			i++;
		}
		return (i == iloscLiczb);
	}
		
	public int top()
	{
		Elem tmp = glowa;
		while(glowa.getNext() != null)
		{
			tmp = tmp.getNext();
		}
		return tmp.getValue();
	}

	public int pop()
	{
		Elem tmp = glowa;
		Elem tmp2 = null;
		int value = 0;
		while(tmp.getNext() != null)
		{
			tmp2 = tmp;
			tmp = tmp.getNext();
		}
        value = tmp.getValue();
		if (tmp2 == null)
		{
			tmp = null;
		} else
		{
			tmp2.setNext(null);
		}
		iloscLiczb--;
		return value;
	}
}

class Elem
{
	private Integer l;
	private Elem next = null;

	public Elem(int liczba)
	{
		l = liczba;
	}

	public int getValue()
	{
		return l;
	}

	public Elem getNext()
	{
		return next;
	}

	public void setNext(Elem n)
	{
		next = n;
	}

	public void setValue(int value)
	{
		l = value;
	}

	public void finalize()
	{
		System.out.println("Koniec życia elementu");
	}
}
