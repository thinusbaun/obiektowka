package katner.po9;

class Prostokat extends Czworokat
{
  Prostokat(Punkt lgorny, Punkt pdolny)
  {
    super(lgorny, new Punkt(lgorny.getX(), pdolny.getY()),pdolny, new Punkt(pdolny.getX(), lgorny.getY()));
  }

  void skaluj(int skala)
  {
    Punkt lgorny = getPkt1();
    Punkt pkt = getPkt2();
    pkt.setY(lgorny.getY()-(lgorny.getY()-pkt.getY())*skala);
    setPkt2(pkt);
    pkt = getPkt3();
    pkt.setY(lgorny.getY()-(lgorny.getY()-pkt.getY())*skala);
    pkt.setX(lgorny.getX()-(lgorny.getX()-pkt.getX())*skala);
    setPkt3(pkt);
    pkt = getPkt4();
    pkt.setY(lgorny.getY()-(lgorny.getY()-pkt.getY())*skala);
    pkt.setX(lgorny.getX()-(lgorny.getX()-pkt.getX())*skala);
    setPkt4(pkt);
  }

  double pole()
  {
    int a = getPkt2().getY() - getPkt1().getY();
    int b = getPkt3().getX() - getPkt2().getX();
    return a*b;
  }

  void przesun(int dx, int dy)
  {
    Punkt pkt = getPkt1();
    pkt.przesun(dx, dy);
    setPkt1(pkt);
    pkt = getPkt2();
    pkt.przesun(dx, dy);
    setPkt2(pkt);
    pkt = getPkt3();
    pkt.przesun(dx, dy);
    setPkt3(pkt);
    pkt = getPkt4();
    pkt.przesun(dx, dy);
    setPkt4(pkt);
  }

}
