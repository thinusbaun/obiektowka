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
import javax.swing.JOptionPane;

import java.util.Random;

abstract class Element {
 public Boolean przesuniety = false;
}


abstract class Postac extends Element {
  private int zycia = 3;

  public Boolean martwy()
  {
    return (zycia == 0);
  }

  public void zwiekszZycie()
  {
    zycia++;
  } 

  public void zmniejszZycie(int ilosc)
  {
    zycia -= ilosc;
  }

  public void zmniejszZycie()
  {
    zycia--;
  }
  
  public int getZycie()
  {
    return zycia;
  }
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
              int tmp = generator.nextInt(77);
              switch(tmp)
              {
                case 10 || 17:
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
        private JLabel iloscZyc = new JLabel("Ilość żyć: 3");
	private Icon mrowka = new ImageIcon("ant0a.gif"), potwor = new ImageIcon("being0f.gif"),
			jablko = new ImageIcon("bu_APPLE1.GIF"), bohater = new ImageIcon("smurf-1.gif"),
			sciana = new ImageIcon("worksmal.gif");
	private JLabel[][] etykiety;
        private int[] offsetsJ = {0,1,0,-1};
        private int[] offsetsI = {-1,0,1,0};

	public static void main(String[] args) {
		new Gra(new Plansza(25, 20)).setVisible(true);
	}

	private void nastepnaRunda() {
          for (int i = 0; i<plansza.getWysokosc(); i++)
          {
            for (int j = 0; j<plansza.getSzerokosc(); j++)
            {
              if (plansza.getElement(j,i) instanceof Bohater ||
                  plansza.getElement(j, i) instanceof Potwor ||
                  plansza.getElement(j, i) instanceof Mrowka)
              {
                przesunPostac(j,i);
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

        private void sprawdzZycie(int x, int y, Element elem)
        {
          if (elem instanceof Bohater)
          {
            Bohater bohater = (Bohater)elem;
            if (plansza.getElement(x,y) instanceof Jablko)
            {
              bohater.zwiekszZycie();
            } else if (plansza.getElement(x,y) instanceof Mrowka)
            {
              bohater.zmniejszZycie();
            } else if (plansza.getElement(x,y) instanceof Potwor)
            {
              bohater.zmniejszZycie(bohater.getZycie());
            }
            iloscZyc.setText("Ilość żyć: " + bohater.getZycie());
            if (bohater.getZycie() == 0)
            {
              JOptionPane.showMessageDialog(this, "Brak żyć. Koniec gry.");
              runda.setEnabled(false);
            }
          }
        }

        private void przesunPostac(int j, int i)
        {
          if (plansza.getElement(j,i).przesuniety == false)
          {
            Boolean mozliwosci[] = new Boolean[4];
            int ilosc = 0;
            for (int count = 0; count<mozliwosci.length; count++)
            {
              mozliwosci[count] = sprawdzMiejece(j, i, offsetsJ[count], offsetsI[count]);
            }
            Random generator = new Random();
            Element elem =plansza.getElement(j,i);
            elem.przesuniety = true;
            plansza.setElement(j,i, null);
            while(true)
            {
              int tmp = generator.nextInt(4);
              if (mozliwosci[tmp] == true)
              {
                if (sprawdzMrowki(j, i))
                {
                  Postac asd = (Postac) elem;
                  asd.zmniejszZycie();
                }
                switch(tmp)
                {
                  case 0:
                    sprawdzZycie(j, i-1, elem);
                    plansza.setElement(j, i-1, elem);
                    break;
                  case 1:
                    sprawdzZycie(j+1, i, elem);
                    plansza.setElement(j+1, i, elem);
                    break;
                  case 2:
                    sprawdzZycie(j, i+1, elem);
                    plansza.setElement(j, i+1, elem);
                    break;
                  case 3: 
                    sprawdzZycie(j-1, i, elem);
                    plansza.setElement(j-1, i, elem);
                    break;
                }
                break;
              }
            }
          }
        } 

        private Boolean sprawdzMrowki(int j, int i)
        {
          Boolean warunek = false;
          for (int tmp = 0; tmp<offsetsI.length; tmp++)
          {
            try
            {
              if (plansza.getElement(j + offsetsJ[tmp], i + offsetsI[tmp]) instanceof Mrowka)
              {
                if (!warunek)
                {
                  warunek = true;
                }
              }
            } catch (Exception e)
            {
            }
          }
          return warunek;
        }

        private Boolean sprawdzMiejece(int j, int i, int offsetj, int offseti)
        {
          if (((j == 0) && (offsetj == -1)) || 
              ((j == plansza.getSzerokosc()-1) && (offsetj == 1)) ||
              ((i == 0) && (offseti == -1)) ||
              ((i == plansza.getWysokosc()-1) && (offseti == 1)))
          {
            return false;
          }
          Boolean warunek = plansza.getElement(j + offsetj, i + offseti) instanceof Sciana;
          warunek = warunek || plansza.getElement(j + offsetj, i + offseti) instanceof Mrowka;
          if (!(plansza.getElement(j, i) instanceof Bohater))
          {
            warunek = warunek || plansza.getElement(j + offsetj, i + offseti) instanceof Element;
          }
          if (warunek)
          {
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
		add(BorderLayout.NORTH, iloscZyc);
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
