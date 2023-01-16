namespace ClinicDesktop
{
    partial class MainForm1
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
            this.panel1 = new System.Windows.Forms.Panel();
            this.buttonUpdate = new System.Windows.Forms.Button();
            this.buttonDelete = new System.Windows.Forms.Button();
            this.buttonLoadDate = new System.Windows.Forms.Button();
            this.buttonConsultation = new System.Windows.Forms.Button();
            this.buttonPet = new System.Windows.Forms.Button();
            this.buttonClient = new System.Windows.Forms.Button();
            this.panel2 = new System.Windows.Forms.Panel();
            this.buttonMenu = new System.Windows.Forms.Button();
            this.listViewClients = new System.Windows.Forms.ListView();
            this.columnHeader1 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader2 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader3 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader4 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader5 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader6 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.listViewPets = new System.Windows.Forms.ListView();
            this.columnHeader7 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader8 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader9 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.columnHeader10 = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.flowLayoutPanelMenu = new System.Windows.Forms.FlowLayoutPanel();
            this.panel1.SuspendLayout();
            this.panel2.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.SystemColors.ControlDarkDark;
            this.panel1.Controls.Add(this.buttonUpdate);
            this.panel1.Controls.Add(this.buttonDelete);
            this.panel1.Controls.Add(this.buttonLoadDate);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel1.Location = new System.Drawing.Point(0, 311);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(560, 61);
            this.panel1.TabIndex = 0;
            // 
            // buttonUpdate
            // 
            this.buttonUpdate.Location = new System.Drawing.Point(280, 10);
            this.buttonUpdate.Name = "buttonUpdate";
            this.buttonUpdate.Size = new System.Drawing.Size(126, 39);
            this.buttonUpdate.TabIndex = 2;
            this.buttonUpdate.Text = "Добавить запись";
            this.buttonUpdate.UseVisualStyleBackColor = true;
            this.buttonUpdate.Click += new System.EventHandler(this.buttonUpdate_Click);
            // 
            // buttonDelete
            // 
            this.buttonDelete.Location = new System.Drawing.Point(439, 10);
            this.buttonDelete.Name = "buttonDelete";
            this.buttonDelete.Size = new System.Drawing.Size(126, 39);
            this.buttonDelete.TabIndex = 1;
            this.buttonDelete.Text = "Удалить запись";
            this.buttonDelete.UseVisualStyleBackColor = true;
            this.buttonDelete.Click += new System.EventHandler(this.buttonDelete_Click);
            // 
            // buttonLoadDate
            // 
            this.buttonLoadDate.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.buttonLoadDate.Location = new System.Drawing.Point(422, 11);
            this.buttonLoadDate.Name = "buttonLoadDate";
            this.buttonLoadDate.Size = new System.Drawing.Size(126, 39);
            this.buttonLoadDate.TabIndex = 0;
            this.buttonLoadDate.Text = "Загрузить из базы";
            this.buttonLoadDate.UseVisualStyleBackColor = true;
            this.buttonLoadDate.Click += new System.EventHandler(this.buttonLoadDate_Click);
            // 
            // buttonConsultation
            // 
            this.buttonConsultation.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Left | System.Windows.Forms.AnchorStyles.Right)));
            this.buttonConsultation.Location = new System.Drawing.Point(3, 168);
            this.buttonConsultation.Name = "buttonConsultation";
            this.buttonConsultation.Size = new System.Drawing.Size(104, 41);
            this.buttonConsultation.TabIndex = 2;
            this.buttonConsultation.Text = "Консультации";
            this.buttonConsultation.UseVisualStyleBackColor = true;
            this.buttonConsultation.Click += new System.EventHandler(this.buttonConsultation_Click);
            // 
            // buttonPet
            // 
            this.buttonPet.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Left | System.Windows.Forms.AnchorStyles.Right)));
            this.buttonPet.Location = new System.Drawing.Point(3, 107);
            this.buttonPet.Name = "buttonPet";
            this.buttonPet.Size = new System.Drawing.Size(104, 41);
            this.buttonPet.TabIndex = 1;
            this.buttonPet.Text = "Питомцы";
            this.buttonPet.UseVisualStyleBackColor = true;
            this.buttonPet.Click += new System.EventHandler(this.buttonPet_Click);
            // 
            // buttonClient
            // 
            this.buttonClient.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Left | System.Windows.Forms.AnchorStyles.Right)));
            this.buttonClient.Location = new System.Drawing.Point(3, 45);
            this.buttonClient.Name = "buttonClient";
            this.buttonClient.Size = new System.Drawing.Size(104, 44);
            this.buttonClient.TabIndex = 0;
            this.buttonClient.Text = "Клиенты";
            this.buttonClient.UseVisualStyleBackColor = true;
            this.buttonClient.Click += new System.EventHandler(this.buttonClient_Click);
            // 
            // panel2
            // 
            this.panel2.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.panel2.Controls.Add(this.buttonMenu);
            this.panel2.Controls.Add(this.buttonConsultation);
            this.panel2.Controls.Add(this.buttonClient);
            this.panel2.Controls.Add(this.buttonPet);
            this.panel2.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel2.Location = new System.Drawing.Point(0, 0);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(110, 311);
            this.panel2.TabIndex = 1;
            // 
            // buttonMenu
            // 
            this.buttonMenu.Location = new System.Drawing.Point(3, 231);
            this.buttonMenu.Name = "buttonMenu";
            this.buttonMenu.Size = new System.Drawing.Size(104, 41);
            this.buttonMenu.TabIndex = 3;
            this.buttonMenu.Text = "Меню";
            this.buttonMenu.UseVisualStyleBackColor = true;
            this.buttonMenu.Click += new System.EventHandler(this.button4_Click);
            // 
            // listViewClients
            // 
            this.listViewClients.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.listViewClients.BackColor = System.Drawing.SystemColors.ScrollBar;
            this.listViewClients.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.columnHeader1,
            this.columnHeader2,
            this.columnHeader3,
            this.columnHeader4,
            this.columnHeader5,
            this.columnHeader6});
            this.listViewClients.FullRowSelect = true;
            this.listViewClients.GridLines = true;
            this.listViewClients.HideSelection = false;
            this.listViewClients.Location = new System.Drawing.Point(113, 0);
            this.listViewClients.MultiSelect = false;
            this.listViewClients.Name = "listViewClients";
            this.listViewClients.Size = new System.Drawing.Size(447, 311);
            this.listViewClients.TabIndex = 2;
            this.listViewClients.UseCompatibleStateImageBehavior = false;
            this.listViewClients.View = System.Windows.Forms.View.Details;
            // 
            // columnHeader1
            // 
            this.columnHeader1.Text = "№";
            this.columnHeader1.Width = 48;
            // 
            // columnHeader2
            // 
            this.columnHeader2.Text = "Фамилия";
            this.columnHeader2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.columnHeader2.Width = 100;
            // 
            // columnHeader3
            // 
            this.columnHeader3.Text = "Имя";
            this.columnHeader3.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.columnHeader3.Width = 100;
            // 
            // columnHeader4
            // 
            this.columnHeader4.Text = "Отчество";
            this.columnHeader4.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.columnHeader4.Width = 100;
            // 
            // columnHeader5
            // 
            this.columnHeader5.Text = "Документ";
            this.columnHeader5.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.columnHeader5.Width = 132;
            // 
            // columnHeader6
            // 
            this.columnHeader6.Text = "Дата рождения";
            this.columnHeader6.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.columnHeader6.Width = 95;
            // 
            // listViewPets
            // 
            this.listViewPets.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.listViewPets.BackColor = System.Drawing.SystemColors.ScrollBar;
            this.listViewPets.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.columnHeader7,
            this.columnHeader8,
            this.columnHeader9,
            this.columnHeader10});
            this.listViewPets.FullRowSelect = true;
            this.listViewPets.GridLines = true;
            this.listViewPets.HideSelection = false;
            this.listViewPets.Location = new System.Drawing.Point(110, 0);
            this.listViewPets.MultiSelect = false;
            this.listViewPets.Name = "listViewPets";
            this.listViewPets.Size = new System.Drawing.Size(447, 311);
            this.listViewPets.TabIndex = 3;
            this.listViewPets.UseCompatibleStateImageBehavior = false;
            this.listViewPets.View = System.Windows.Forms.View.Details;
            // 
            // columnHeader7
            // 
            this.columnHeader7.Text = "№";
            this.columnHeader7.Width = 35;
            // 
            // columnHeader8
            // 
            this.columnHeader8.Text = "№ Клиента в базе";
            this.columnHeader8.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.columnHeader8.Width = 128;
            // 
            // columnHeader9
            // 
            this.columnHeader9.Text = "Кличка животного";
            this.columnHeader9.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.columnHeader9.Width = 129;
            // 
            // columnHeader10
            // 
            this.columnHeader10.Text = "Дата рождения";
            this.columnHeader10.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.columnHeader10.Width = 115;
            // 
            // flowLayoutPanelMenu
            // 
            this.flowLayoutPanelMenu.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.flowLayoutPanelMenu.Location = new System.Drawing.Point(110, 0);
            this.flowLayoutPanelMenu.Name = "flowLayoutPanelMenu";
            this.flowLayoutPanelMenu.Size = new System.Drawing.Size(450, 311);
            this.flowLayoutPanelMenu.TabIndex = 4;
            // 
            // MainForm1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(560, 372);
            this.Controls.Add(this.flowLayoutPanelMenu);
            this.Controls.Add(this.listViewPets);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.listViewClients);
            this.Controls.Add(this.panel1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.ImeMode = System.Windows.Forms.ImeMode.Off;
            this.Name = "MainForm1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Моя клиника";
            this.TransparencyKey = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(0)))));
            this.Load += new System.EventHandler(this.MainForm1_Load);
            this.panel1.ResumeLayout(false);
            this.panel2.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.ListView listViewClients;
        private System.Windows.Forms.Button buttonConsultation;
        private System.Windows.Forms.Button buttonPet;
        private System.Windows.Forms.Button buttonClient;
        private System.Windows.Forms.Button buttonLoadDate;
        private System.Windows.Forms.ColumnHeader columnHeader1;
        private System.Windows.Forms.ColumnHeader columnHeader2;
        private System.Windows.Forms.ColumnHeader columnHeader3;
        private System.Windows.Forms.ColumnHeader columnHeader4;
        private System.Windows.Forms.ColumnHeader columnHeader5;
        private System.Windows.Forms.ColumnHeader columnHeader6;
        private System.Windows.Forms.ListView listViewPets;
        private System.Windows.Forms.ColumnHeader columnHeader8;
        private System.Windows.Forms.ColumnHeader columnHeader9;
        private System.Windows.Forms.ColumnHeader columnHeader10;
        private System.Windows.Forms.Button buttonUpdate;
        private System.Windows.Forms.Button buttonDelete;
        private System.Windows.Forms.ColumnHeader columnHeader7;
        private System.Windows.Forms.Button buttonMenu;
        private System.Windows.Forms.FlowLayoutPanel flowLayoutPanelMenu;
    }
}

