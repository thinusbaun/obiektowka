package struktury.tablicowe;

public class Stos
{
	private int[] tab;
	private int iloscLiczb = 0;
	public Stos(int ilosc)
	{
		tab = new int[ilosc];
		System.out.println("Początek życia stosu tablicowego");
	}

	public void finalize()
	{
		System.out.println("Koniec życia stosu tablicowego");
	}

	public Boolean empty()
	{
		return (iloscLiczb == 0);
	}

	public Boolean full()
	{
		return (iloscLiczb == tab.length);
	}

	public int top()
	{
		return tab[iloscLiczb -1];
	}

	public int pop()
	{
		return tab[--iloscLiczb];
	}

	public void push(int l)
	{
		tab[iloscLiczb++] = l;
	}


}
