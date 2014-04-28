class Punkt
{
  private:
    int x,y;
  public:
    Punkt(): x(0), y(0) {};
    Punkt(int xx, int yy): x(xx), y(yy) {};
    int getX() { return x;};
    int getY() { return y;};
    void setX(int xx) { x = xx;};
    void setY(int yy) { y = yy;};
};
