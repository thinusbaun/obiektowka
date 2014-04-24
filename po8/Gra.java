import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Random;

abstract class Element {
 public Boolean przesuniety = false;
}


abstract class Postac extends Element {
}

class Mrowka extends Postac {
}

class Potwor extends Postac {
}

class Bohater extends Postac {
}

class Sciana extends Element {
}

class Jablko extends Element {
}

class Plansza {
	private Element[][] elementy;

	public Plansza(int sz, int wys) {
		elementy = new Element[wys][];
		for (int i = 0; i < wys; ++i)
                {
			elementy[i] = new Element[sz];
                }
                wypelnij();
	}
        public void wypelnij()
        {
          Random generator = new Random();
          for (int i=0;i<getWysokosc(); i++)
          {
            for (int j =0; j<getSzerokosc(); j++)
            {
              int tmp = generator.nextInt(86);
              switch(tmp)
              {
                case 10:
                elementy[i][j] = new Sciana();
                break;
                case 2:
                elementy[i][j] = new Mrowka();
                break;
                case 5:
                elementy[i][j] = new Potwor();
                break;
                case 20:
                elementy[i][j] = new Jablko();
                break;
              }
            }
          }
          elementy[generator.nextInt(getWysokosc())][generator.nextInt(getSzerokosc())] = new Bohater();
        }

	public Element getElement(int x, int y) {
		return elementy[y][x];
	}

	public void setElement(int x, int y, Element e) {
		elementy[y][x] = e;
	}

	public int getWysokosc() {
		return elementy.length;
	}

	public int getSzerokosc() {
		return elementy[0].length;
	}
}

public class Gra extends JFrame {

	private Plansza plansza;
	private JButton runda = new JButton("Następna runda");
	private Icon mrowka = new ImageIcon("ant0a.gif"), potwor = new ImageIcon("being0f.gif"),
			jablko = new ImageIcon("bu_APPLE1.GIF"), bohater = new ImageIcon("smurf-1.gif"),
			sciana = new ImageIcon("worksmal.gif");
	private JLabel[][] etykiety;

	public static void main(String[] args) {
		new Gra(new Plansza(25, 20)).setVisible(true);
	}

	private void nastepnaRunda() {
          for (int i = 0; i<plansza.getWysokosc(); i++)
          {
            for (int j = 0; j<plansza.getSzerokosc(); j++)
            {
              if (plansza.getElement(j,i) instanceof Bohater)
              {
                przesunPostac(j,i);
              } else if (plansza.getElement(j,i) instanceof Potwor)
              {
                System.out.print("Potwor");
              } else if (plansza.getElement(j,i) instanceof Mrowka)
              {
                System.out.print("Mrowka");
              }
            }
          }
          for (int i = 0; i<plansza.getWysokosc(); i++)
          {
            for (int j = 0; j<plansza.getSzerokosc(); j++)
            {
              if (plansza.getElement(j,i) instanceof Element)
              plansza.getElement(j,i).przesuniety = false;
            }
          }
		uaktualnijEtykiety();
	}

        private void przesunPostac(int j, int i)
        {
          if (plansza.getElement(j,i).przesuniety == false)
          {
            System.out.println("PRZESUNPOSTAC");
            Boolean mozliwosci[] = new Boolean[4];
            int ilosc = 0;
            mozliwosci[0] = sprawdzGora(j,i);
            mozliwosci[1] = sprawdzPrawo(j,i);
            mozliwosci[2] = sprawdzDol(j,i);
            mozliwosci[3] = sprawdzLewo(j,i);
            Random generator = new Random();
            Element elem =plansza.getElement(j,i);
            elem.przesuniety = true;
            plansza.setElement(j,i, null);
            while(true)
            {
              int tmp = generator.nextInt(4);
              if (mozliwosci[tmp] == true)
              {
                switch(tmp)
                {
                  case 0:
                    plansza.setElement(j,i-1, elem);
                    System.out.println("gora");
                    break;
                  case 1:
                    plansza.setElement(j+1,i, elem);
                    System.out.println("prawo");
                    break;
                  case 2:
                    plansza.setElement(j,i+1, elem);
                    System.out.println("dol");
                    break;
                  case 3: 
                    plansza.setElement(j-1,i, elem);
                    System.out.println("lewo");
                    break;
                }
                break;
              }
            }

            System.out.println(ilosc);
          }
        } 

        private Boolean sprawdzLewo(int j, int i)
        {
          if (j == 0)
          {
            System.out.println("LEWO");
            return false;
          } else if (plansza.getElement(j-1,i) instanceof Postac || plansza.getElement(j-1,i) instanceof Sciana)
          {
            System.out.println("LEWO");
            return false;
          } 
            return true;
        }
        private Boolean sprawdzPrawo(int j, int i)
        {
          if (j == plansza.getSzerokosc()-1)
          {
            System.out.println("PRAWO");
            return false;
          } else if (plansza.getElement(j+1,i) instanceof Postac || plansza.getElement(j+1,i) instanceof Sciana)
          {
            System.out.println("PRAWO");
            return false;
          } 
            return true;
        }

        private Boolean sprawdzDol(int j, int i)
        {
          if (i == plansza.getWysokosc()-1)
          {
            System.out.println("DOL");
            return false;
          } else if (plansza.getElement(j,i+1) instanceof Postac || plansza.getElement(j,i+1) instanceof Sciana)
          {
            System.out.println("DOL");
            return false;
          } 
            return true;
        }
        private Boolean sprawdzGora(int j, int i)
        {
          if (i == 0)
          {
            System.out.println("GORA");
            return false;
          } else if (plansza.getElement(j,i-1) instanceof Postac || plansza.getElement(j,i-1) instanceof Sciana)
          {
            System.out.println("GORA");
            return false;
          } 
            return true;
        }
	private int lastRow = 0;

	private void uaktualnijEtykiety() {
          for (int i =0; i<plansza.getWysokosc();i++)
          {
            for (int j = 0; j<plansza.getSzerokosc(); j++)
            {
              if (plansza.getElement(j,i) instanceof Sciana)
              {
                etykiety[i][j].setIcon(sciana);
              } else if (plansza.getElement(j,i) instanceof Potwor)
              {
                etykiety[i][j].setIcon(potwor);
              } else if (plansza.getElement(j,i) instanceof Bohater)
              {
                etykiety[i][j].setIcon(bohater);
              } else if (plansza.getElement(j,i) instanceof Mrowka)
              {
                etykiety[i][j].setIcon(mrowka);
              } else if (plansza.getElement(j,i) instanceof Jablko)
              {
                etykiety[i][j].setIcon(jablko);
              } else
              {
                etykiety[i][j].setIcon(null);
              }
            }
          }
          }

	public Gra(Plansza p) {
		plansza = p;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(BorderLayout.SOUTH, runda);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(plansza.getWysokosc(), plansza.getSzerokosc()));
		add(BorderLayout.CENTER, panel);

		etykiety = new JLabel[plansza.getWysokosc()][];

		for (int i = 0; i < plansza.getWysokosc(); ++i) {
			etykiety[i] = new JLabel[plansza.getSzerokosc()];
			for (int j = 0; j < plansza.getSzerokosc(); ++j) {
				etykiety[i][j] = new JLabel("s");
				etykiety[i][j].setPreferredSize(new Dimension(32, 32));
			}

		}
                uaktualnijEtykiety();

		for (JLabel[] ls : etykiety)
			for (JLabel l : ls)
				panel.add(l);
		runda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nastepnaRunda();
			}
		});

		pack();

	}
}
