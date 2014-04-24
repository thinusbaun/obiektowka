using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using struktury.listowe;
namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            Stos a = new Stos(10);
            for (int i = 0; i < 10; i++)
            {
                a.push(i * 2);
            }
            while (!a.empty())
            {
                Console.WriteLine(a.pop());
            }
            Console.ReadKey();

        }
    }
}
