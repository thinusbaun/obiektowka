#include <string>

class Figura
{
  protected:
    std::string kolor;

  public:
    Figura(std::string kol): kolor(kol) {};
    void setKolor(std::string kol);
    std::string getKolor();
};
