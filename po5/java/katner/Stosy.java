package katner;

import java.util.*;
import struktury.listowe.*;

public class Stosy
{
	public static void main(String[] args)
	{
		Stos s = new Stos(10);
		s.push(1);
		s.push(12);
		s.push(13);
		s.push(14);
		s.push(15);
		s.push(16);
		while(!s.empty())
		{
			System.out.println(s.pop());
		}
		s = null;
		System.gc();
	}
}
