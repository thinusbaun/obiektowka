import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;

abstract class Element { 
}

abstract class Postac extends Element{
}

class Mrowka extends Postac {
}

class Potwor extends Postac {
}

class Bohater extends Postac {
}

class Sciana extends Element {
}

class Plansza {
	private Element[][] elementy;
	public Plansza(int sz, int wys) {
		elementy=new Element[wys][];
		for (int i=0;i<wys;++i) elementy[i]=new Element[sz];
	}
	public Element getElement(int x, int y) {
		return elementy[y][x];
	}
	public void setElement(int x, int y, Element e) {
		elementy[y][x]=e;
	}
	public int getWysokosc() { return elementy.length; }
	public int getSzerokosc() { return elementy[0].length; }
}

public class Gra extends JFrame{ 
	
	private Plansza plansza;
	private JButton runda=new JButton("Nastêpna runda");
	private Icon mrowka=new ImageIcon("ant0a.gif"),
			potwor=new ImageIcon("being0f.gif"),
			jablko=new ImageIcon("bu_APPLE1.GIF"),
			bohater=new ImageIcon("smurf-1.gif"),
			sciana=new ImageIcon("worksmal.gif");
	private JLabel[][] etykiety;
	public static void main(String[] args) {
		new Gra(new Plansza(30,20)).setVisible(true);
	}
	private void nastepnaRunda() { 
		uaktualnijEtykiety();
	}
	private int lastRow=0;
	private void uaktualnijEtykiety() { 
		etykiety[lastRow][0].setIcon(null);
		etykiety[lastRow][1].setIcon(null);
		etykiety[lastRow][2].setIcon(null);
		etykiety[lastRow][3].setIcon(null);
		etykiety[lastRow][4].setIcon(null);	
		lastRow=(lastRow+1)%plansza.getWysokosc();
		etykiety[lastRow][0].setIcon(mrowka);
		etykiety[lastRow][1].setIcon(potwor);
		etykiety[lastRow][2].setIcon(jablko);
		etykiety[lastRow][3].setIcon(bohater);
		etykiety[lastRow][4].setIcon(sciana);	
	}
	
	public Gra(Plansza p) {
		plansza=p;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(BorderLayout.SOUTH, runda);
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(plansza.getWysokosc(), plansza.getSzerokosc()));
		add(BorderLayout.CENTER, panel);

		etykiety=new JLabel[plansza.getWysokosc()][];
		for (int i=0;i<plansza.getWysokosc();++i) {
			etykiety[i]=new JLabel[plansza.getSzerokosc()];
			for (int j=0;j<plansza.getSzerokosc();++j)
				etykiety[i][j]=new JLabel("   ");
		}
		for (JLabel[] ls: etykiety) 
			for (JLabel l: ls)
				panel.add(l);
		runda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nastepnaRunda();
			}
		});
	}
}
 
