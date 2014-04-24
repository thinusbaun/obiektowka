#include <iostream>
#include "listowe.cpp"

using namespace listowe;

int main(void)
{
	Stos *s = new Stos(10);
	for (int i = 0; i<10; i++)
	{
		s->push(i);
	}
	while(!s->empty())
	{
		std::cout << s->top() << std::endl;
		s->pop();
	}
	delete s;
	return 0;
}
