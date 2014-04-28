#include "punkt.cpp"

class Linia
{
  private:
    Punkt pkt1, pkt2;
  public:
    Linia(Punkt p1, Punkt p2): pkt1(p1), pkt2(p2) {};
    Punkt getPkt1() { return pkt1;};
    Punkt getPkt2() { return pkt2;};
