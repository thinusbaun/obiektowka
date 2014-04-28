package katner.po7;

import java.util.*;

class main
{
	public static void main(String[] args)
	{
          Prostokat asd = new Prostokat(new Punkt(1,1), new Punkt(10,10), "czarny");
          System.out.println(asd.getPkt1());
          System.out.println(asd.getKolor());
          Kwadrat fff = new Kwadrat(new Punkt(0,0), 10, "Czerwony");
          System.out.println(fff);
	}
}
