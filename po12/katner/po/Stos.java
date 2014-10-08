package katner.po;
import java.lang.Exception;
import java.util.Scanner;

public class Stos
{
	private int[] tab;
	private int iloscLiczb = 0;
        private int max;
	public Stos(int ilosc, int max)
	{
		tab = new int[ilosc];
                this.max = max;
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

	public int pop() throws EmptyException
	{
          if (empty())
          {
            throw new EmptyException();
          } else
          {
            return tab[--iloscLiczb];
          }
	}

        public void tryPush()
        {
            Integer liczba = 0;
            Scanner scanIn = new Scanner(System.in);
            Boolean status = false;
            while (!status)
            {
              try
              {
                System.out.print("Podaj liczbę: ");
                liczba = scanIn.nextInt();
                this.push(liczba);
                status = true;
              } catch (BadNumberException e)
              {
                System.out.println("Zła liczba!");
              } catch (FullException e)
              {
                System.out.println("Stos jest pełny!");
                e.printStackTrace();
                status = true;
              }
        }
        }
	public void push(int l) throws FullException, BadNumberException
	{
          if (l > max)
          {
            throw new BadNumberException();
          } else
          {
            if ( full())
            {
              throw new FullException();
            } else
            {
              tab[iloscLiczb++] = l;
            }
          }
	}

        public void tryPop()
        {
          try
          {
            int tmp = this.pop();
            System.out.print("Usunięta liczba:  ");
            System.out.println(tmp);
          } catch(EmptyException e)
          {
            e.printStackTrace();
            System.exit(1);
          }
        }

}


