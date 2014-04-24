using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace struktury
{
    namespace tablicowe
    {
        class Stos
        {
            private int[] tab;
            private int ileLiczb;
            public Stos(int ilosc)
            {
                Console.WriteLine("Konstruktor stosu tablicowego.");
                tab = new int[ilosc];
                ileLiczb = 0;
            }

            public Boolean empty()
            {
                return (ileLiczb == 0);
            }

            public Boolean full()
            {
                return (ileLiczb == tab.Length);
            }

            public void push(int liczba)
            {
                tab[ileLiczb++] = liczba;
            }

            public int top()
            {
                return tab[ileLiczb - 1];
            }

            public int pop()
            {
                return tab[--ileLiczb];
            }
        }
    }

}