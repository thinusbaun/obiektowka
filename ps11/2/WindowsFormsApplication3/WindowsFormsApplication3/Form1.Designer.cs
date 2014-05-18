namespace WindowsFormsApplication3
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.stosBox = new System.Windows.Forms.ListBox();
            this.popButton = new System.Windows.Forms.Button();
            this.pushButton = new System.Windows.Forms.Button();
            this.fullBox = new System.Windows.Forms.CheckBox();
            this.emptyBox = new System.Windows.Forms.CheckBox();
            this.numberBox = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.iloscLabel = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // stosBox
            // 
            this.stosBox.FormattingEnabled = true;
            this.stosBox.Location = new System.Drawing.Point(12, 12);
            this.stosBox.Name = "stosBox";
            this.stosBox.Size = new System.Drawing.Size(187, 199);
            this.stosBox.TabIndex = 0;
            // 
            // popButton
            // 
            this.popButton.Location = new System.Drawing.Point(205, 12);
            this.popButton.Name = "popButton";
            this.popButton.Size = new System.Drawing.Size(75, 23);
            this.popButton.TabIndex = 1;
            this.popButton.Text = "Pop";
            this.popButton.UseVisualStyleBackColor = true;
            this.popButton.Click += new System.EventHandler(this.popButton_Click);
            // 
            // pushButton
            // 
            this.pushButton.Location = new System.Drawing.Point(205, 41);
            this.pushButton.Name = "pushButton";
            this.pushButton.Size = new System.Drawing.Size(75, 23);
            this.pushButton.TabIndex = 2;
            this.pushButton.Text = "Push";
            this.pushButton.UseVisualStyleBackColor = true;
            this.pushButton.Click += new System.EventHandler(this.pushButton_Click);
            // 
            // fullBox
            // 
            this.fullBox.AutoSize = true;
            this.fullBox.Enabled = false;
            this.fullBox.Location = new System.Drawing.Point(12, 238);
            this.fullBox.Name = "fullBox";
            this.fullBox.Size = new System.Drawing.Size(42, 17);
            this.fullBox.TabIndex = 3;
            this.fullBox.Text = "Full";
            this.fullBox.UseVisualStyleBackColor = true;
            // 
            // emptyBox
            // 
            this.emptyBox.AutoSize = true;
            this.emptyBox.Enabled = false;
            this.emptyBox.Location = new System.Drawing.Point(12, 215);
            this.emptyBox.Name = "emptyBox";
            this.emptyBox.Size = new System.Drawing.Size(55, 17);
            this.emptyBox.TabIndex = 4;
            this.emptyBox.Text = "Empty";
            this.emptyBox.UseVisualStyleBackColor = true;
            // 
            // numberBox
            // 
            this.numberBox.Location = new System.Drawing.Point(205, 70);
            this.numberBox.Name = "numberBox";
            this.numberBox.Size = new System.Drawing.Size(75, 20);
            this.numberBox.TabIndex = 5;
            this.numberBox.KeyDown += new System.Windows.Forms.KeyEventHandler(this.numberBox_KeyDown);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(73, 216);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(86, 13);
            this.label1.TabIndex = 6;
            this.label1.Text = "Ilość elementów:";
            // 
            // iloscLabel
            // 
            this.iloscLabel.AutoSize = true;
            this.iloscLabel.Location = new System.Drawing.Point(164, 216);
            this.iloscLabel.Name = "iloscLabel";
            this.iloscLabel.Size = new System.Drawing.Size(13, 13);
            this.iloscLabel.TabIndex = 7;
            this.iloscLabel.Text = "0";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(292, 266);
            this.Controls.Add(this.iloscLabel);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.numberBox);
            this.Controls.Add(this.emptyBox);
            this.Controls.Add(this.fullBox);
            this.Controls.Add(this.pushButton);
            this.Controls.Add(this.popButton);
            this.Controls.Add(this.stosBox);
            this.Name = "Form1";
            this.Text = "Stos graficznie.";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox stosBox;
        private System.Windows.Forms.Button popButton;
        private System.Windows.Forms.Button pushButton;
        private System.Windows.Forms.CheckBox fullBox;
        private System.Windows.Forms.CheckBox emptyBox;
        private System.Windows.Forms.TextBox numberBox;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label iloscLabel;
    }
}

