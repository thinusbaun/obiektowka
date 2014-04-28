package katner.po7;

class Prostokat extends Czworokat
{
  Prostokat(Punkt lgorny, Punkt pdolny, String kolor)
  {
    super(lgorny, new Punkt(lgorny.getX(), pdolny.getY()),pdolny, new Punkt(pdolny.getX(), lgorny.getY()), kolor);
  }
}
