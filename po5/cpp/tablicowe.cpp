#include <iostream>
#include <cstring>

namespace tablicowe
{
	class Stos
	{
	private:
		int *s;
		int maxSize;
		int numOfElements;

	public:
		Stos(int size) //init
		{
			this->maxSize = size;
			this->numOfElements = 0;
			s = new int[size];
		}

		~Stos() //destroy
		{
			delete[] s;
		};

		void push(int value)
		{
			if(full())
			{
				int *tmp;
				tmp = new int[maxSize*2];
				std::memcpy(tmp,s,maxSize*sizeof(int));
				delete[] s;
				s = tmp;
				maxSize *=2;
			}
			s[numOfElements] = value;
			numOfElements++;
		}

		int pop()
		{
			return s[--numOfElements];
		}

		int top()
		{
			return s[numOfElements-1];
		}

		bool empty()
		{
			return (numOfElements == 0);
		}

		bool full()
		{
			return (numOfElements == maxSize);
		}
	};
};
