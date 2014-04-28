package katner.po9;

import java.util.*;

class main
{
	public static void main(String[] args)
	{
          Prostokat asd = new Prostokat(new Punkt(1,1), new Punkt(10,10));
          System.out.println(asd.pole());
          asd.skaluj(2);
          System.out.println(asd.pole());
          Kwadrat fff = new Kwadrat(new Punkt(0,0), 10);
          System.out.println(fff);
	}
}
