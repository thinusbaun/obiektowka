package katner.po;

import java.util.*;
import java.util.Scanner;

public class Stosy
{
  public static void main(String[] args)
  {
    Stos s = new Stos(10, 10);
    Integer wybor = 0;
    Scanner scanIn = new Scanner(System.in);
    while (true)
    {
      System.out.print("1 - dodaj\n2 - usuń\n3 - koniec\nTwój wybór: ");
      wybor = scanIn.nextInt();
      switch (wybor)
      {
        case 1:
          s.tryPush();
          break;
        case 2:
          s.tryPop();
          break;
        case 3:
          System.exit(0);
          break;
      }
    }
  }
}
