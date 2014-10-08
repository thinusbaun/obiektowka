package katner.ps11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.DefaultListModel;
public class okno extends JFrame implements ActionListener
{
  private int pojemnosc = 15;
  private DefaultListModel<Integer> listModel = new DefaultListModel<Integer>();
  private JLabel label = new JLabel("witam");
  private JList stos = new JList<Integer>(listModel);
  private JButton pushButton = new JButton("Push");
  private JButton popButton = new JButton("Pop");
  private JTextField numberField = new JTextField(9);
  private JCheckBox emptyBox = new JCheckBox("Empty");
  private JCheckBox fullBox = new JCheckBox("Full");
  private JPanel firstPanel = new JPanel();
  private JPanel secondPanel = new JPanel();
  private  JScrollPane scrollPane = new JScrollPane(stos);

  public okno()
  {
    super("Witam");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout());
    firstPanel.setLayout(new GridLayout(2,2));
    firstPanel.add(pushButton, BorderLayout.WEST);
    firstPanel.add(popButton, BorderLayout.EAST);
    firstPanel.add(numberField, BorderLayout.EAST);
    add(firstPanel);
    secondPanel.setLayout(new GridLayout(2,2));
    secondPanel.add(emptyBox);
    secondPanel.add(fullBox);
    secondPanel.add(label);
    secondPanel.add(scrollPane);
    add(secondPanel);
    uaktualnij();
    numberField.addActionListener(this);
    popButton.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            if (listModel.size() > 0)
          {
            listModel.remove(0);
          }
    uaktualnij();
          }
        }
        );

    pushButton.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            if (listModel.size() < pojemnosc)
    {
            try
    {
            Integer liczba = Integer.parseInt(numberField.getText());
            listModel.add(0,liczba);
            System.out.println(liczba);
            numberField.setText("");
            uaktualnij();
    } catch (Exception exce)
    {
    }
          }
          }
        }
        );
    pack();
    setVisible(true);
  }
  public void actionPerformed(ActionEvent evt) {
    String text = numberField.getText();
    numberField.selectAll();
    pushButton.doClick();
  }

  public void uaktualnij()
  {
    emptyBox.setSelected(listModel.size() == 0);
    fullBox.setSelected(listModel.size() == pojemnosc);
    label.setText("Ilosc elementów:" + listModel.size());
  }
  }

