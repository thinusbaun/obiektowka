#include <iostream>

namespace listowe
{
	class Elem {
		public:
			int l;
			Elem *nast;
	};

	class Stos {
		private:
			Elem *ostatni;
			int maxilosc;
		public:
			Stos()
			{
				std::cout << "Stos konstruktor. Adres: " << this << std::endl;
				ostatni = NULL;
			}
			Stos(int ile)
			{
				maxilosc = ile;
				std::cout << "Stos konstruktor. Adres: " << this << std::endl;
				ostatni = NULL;
			}
			Stos(Stos &a)
			{
				std::cout << "Stos konstruktor kopiujący. Adres: " << this << std::endl;
				ostatni = NULL;
				Elem *tmp = a.ostatni;
				while(tmp != NULL)
				{
					push(tmp->l);
					tmp = tmp->nast;
				}

			}

			~Stos()
			{
				while(!this->empty())
				{
					this->pop();
				}
				std::cout << "Stos destruktor. Adres: " << this << std::endl;
			}
			void pop() {
				Elem* tmp=ostatni;
				ostatni=ostatni->nast;
				if (!tmp)
				delete tmp;
			}
			void push (int l) {
				Elem* nowy=new Elem;
				nowy->nast=ostatni;
				nowy->l=l;
				ostatni=nowy;
			}
			int top() { return ostatni->l; }
			int full() {return 0; }
			int empty() {return ostatni==NULL; }
	};
};

