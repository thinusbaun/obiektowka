package katner.po9;

import java.util.*;

class main
{
	public static void main(String[] args)
	{
          Prostokat kwad = new Kwadrat(new Punkt(0,0), 10);
          System.out.format("Obwód: %f\nPole: %f\n", kwad.obwod(), kwad.pole());
          kwad.skaluj(3);
          System.out.format("Obwód: %f\nPole: %f\n", kwad.obwod(), kwad.pole());
          System.out.println(kwad);
          
          Trojkat trojkat = new Trojkat(new Punkt(0,0), new Punkt(10,10), new Punkt(10,0));
          System.out.format("Obwód: %f\nPole: %f\n", trojkat.obwod(), trojkat.pole());
	}
}
