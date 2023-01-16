using ClinicServiceNamespace;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ClinicDesktop
{
    public partial class MainForm1 : Form
    {
        public MainForm1()
        {
            InitializeComponent();
        }

        private void MainForm1_Load(object sender, EventArgs e)
        {

        }


        private void buttonLoadDate_Click(object sender, EventArgs e)
        {

            

            
        }
        private void buttonClient_Click(object sender, EventArgs e)
        {

            ClinicServiceClient clinicServiceClient =
                new ClinicServiceClient("http://localhost:5292/", new System.Net.Http.HttpClient());

            ICollection<Client> clients = clinicServiceClient.GetAllAllAsync().Result;

            flowLayoutPanelMenu.Hide();
            listViewPets.Hide();
            listViewClients.Show();
            listViewClients.Items.Clear();
            

            foreach (Client client in clients)
            {
                ListViewItem item = new ListViewItem();
                item.Text = client.ClientId.ToString();

                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = client.SurName
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = client.FirstName
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = client.Patronymic
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = client.Document
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = client.Birthday.DateTime.ToString()
                });

                listViewClients.Items.Add(item);
            }

            //listViewClients = new System.Windows.Forms.ListView();

        }

        private void buttonPet_Click(object sender, EventArgs e)
        {
            

            ClinicServiceClient clinicServiceClient =
                new ClinicServiceClient("http://localhost:5292/", new System.Net.Http.HttpClient());

            ICollection<Pet> pets = clinicServiceClient.GetAll2Async().Result;

            flowLayoutPanelMenu.Hide();
            //listMenu.Hide();
            listViewPets.Show();
            listViewPets.Items.Clear();

            foreach (Pet pet in pets)
            {
                ListViewItem item = new ListViewItem();
                item.Text = pet.PetId.ToString();

                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = pet.ClientId.ToString()
                });

                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = pet.Name
                });

                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = pet.Birthday.DateTime.ToString()
                });

                listViewPets.Items.Add(item);
            }

            //listViewPets = new System.Windows.Forms.ListView();

        }


        private void buttonConsultation_Click(object sender, EventArgs e)
        {

        }

        private void button4_Click(object sender, EventArgs e)
        {
            flowLayoutPanelMenu.Show();
        }

        private void buttonUpdate_Click(object sender, EventArgs e)
        {
            
        }

        private void buttonDelete_Click(object sender, EventArgs e)
        {

        }
    }
}
