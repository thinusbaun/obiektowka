package katner.po9;

class Kwadrat extends Prostokat 
{
  Kwadrat(Punkt lgorny, int dlBoku)
  {
    super(lgorny, new Punkt(lgorny.getX() + dlBoku, lgorny.getY() + dlBoku));
  }
}
