package katner.po6;

import java.util.*;

class main
{
	public static void main(String[] args)
	{
		Obraz o  = new Obraz();
                Trojkat tr = new Trojkat(new Punkt(0,0), new Punkt(5,5), new Punkt(4,3));
                Czworokat cz = new Czworokat(new Punkt(10,10), new Punkt(10,15), new Punkt(15,15), new Punkt(15,10));
                o.dodajTrojkat(tr);
                o.dodajCzworokat(cz);
		o.przesun(10,10);
		System.out.println(o.rysuj());
	}
}
