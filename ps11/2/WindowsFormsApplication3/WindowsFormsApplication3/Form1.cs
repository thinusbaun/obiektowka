using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication3
{
    public partial class Form1 : Form
    {
        private int pojemnosc = 15;
        private Boolean full = false;
        private int iloscElem = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void uaktualnij()
        {
            emptyBox.Checked = (iloscElem == 0);
            fullBox.Checked = (iloscElem == pojemnosc);
            iloscLabel.Text = String.Format("{0}", iloscElem);
            popButton.Enabled = !(iloscElem == 0);
            pushButton.Enabled = !(iloscElem == pojemnosc);
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            numberBox.Focus();
            uaktualnij();   
        }

        private void pushButton_Click(object sender, EventArgs e)
        {
            try
            {
                stosBox.Items.Insert(0, Int32.Parse(numberBox.Text));
                iloscElem++;
                uaktualnij();
            }
            catch (Exception)
            {
                MessageBox.Show("Proszę wpisać tylko cyfry!");
            }
            numberBox.Clear();
        }

        private void numberBox_TextChanged(object sender, EventArgs e)
        {
            
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void popButton_Click(object sender, EventArgs e)
        {
            if (stosBox.Items.Count != 0)
            {
                stosBox.Items.RemoveAt(0);
                iloscElem--;
                uaktualnij();
            }
        }

        private void numberBox_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                pushButton.PerformClick();
            }
        }
    }
}
