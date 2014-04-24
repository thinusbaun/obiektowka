using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace struktury
{
    namespace listowe
    {
        class Element
        {
            private Element nast;
            private int wartosc;
            public Element(int wartosc)
            {
                this.wartosc = wartosc;
                nast = null;
            }
            public void setWartosc(int wartosc)
            {
                this.wartosc = wartosc;
            }
            public int getWartosc()
            {
                return this.wartosc;
            }
            public void setNast(Element nast)
            {
                this.nast = nast;
            }
            public Element getNast()
            {
                return nast;
            }

        }
        class Stos
        {
            private Element pierwszy;
            private int pojemnosc;
            private int iloscElementow;

            public Stos(int ilosc)
            {
                Console.WriteLine("Konstruktor stosu listowego.");
                pojemnosc = ilosc;
                iloscElementow = 0;
                pierwszy = null;
            }

            public Boolean empty()
            {
                return (iloscElementow == 0);
            }
            public Boolean full()
            {
                return (iloscElementow == pojemnosc);
            }

            public void push(int wartosc)
            {
                Element nowy = new Element(wartosc);
                Element tmp = pierwszy;
                if (tmp == null)
                {
                    pierwszy = nowy;
                }
                else
                {
                    while (tmp.getNast() != null)
                    {
                        tmp = tmp.getNast();
                    }
                    tmp.setNast(nowy);
                }
                iloscElementow++;
            }

            public int pop()
            {
                Element tmp = pierwszy;
                Element tmp2 = pierwszy;
                while (tmp.getNast() != null)
                {
                    tmp2 = tmp;
                    tmp = tmp.getNast();
                }
                tmp2.setNast(null);
                iloscElementow--;
                return tmp.getWartosc();
            }

            public int top()
            {
                Element tmp = pierwszy;
                while (tmp.getNast() != null)
                {
                    tmp = tmp.getNast();
                }
                return tmp.getWartosc();
            }       
        }
    }
}