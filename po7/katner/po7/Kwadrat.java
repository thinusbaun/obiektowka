package katner.po7;

class Kwadrat extends Prostokat 
{
  Kwadrat(Punkt lgorny, int dlBoku, String kolor)
  {
    super(lgorny, new Punkt(lgorny.getX() + dlBoku, lgorny.getY() + dlBoku), kolor);
  }
}
