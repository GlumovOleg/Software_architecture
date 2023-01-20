using ClinicServiceNamespace;
using System;
using System.Collections.Generic;
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

            ICollection<Client> clients = clinicServiceClient.ClientGetAllAsync().Result;

            listViewConsultation.Hide();
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

            ICollection<Pet> pets = clinicServiceClient.PetGetAllAsync().Result;

            listViewConsultation.Hide();
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
            ClinicServiceClient clinicServiceClient =
                new ClinicServiceClient("http://localhost:5292/", new System.Net.Http.HttpClient());

            ICollection<Consultation> consultations = clinicServiceClient.ConsultationGetAllAsync().Result;

            flowLayoutPanelMenu.Hide();
            listViewClients.Hide();
            listViewPets.Hide();
            //listMenu.Hide();
            listViewConsultation.Show();
            listViewConsultation.Items.Clear();

            foreach (Consultation consultation in consultations)
            {
                ListViewItem item = new ListViewItem();
                item.Text = consultation.ConsultationId.ToString();

                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = consultation.ClientId.ToString()
                });

                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = consultation.PetId.ToString()
                });

                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = consultation.ConsultationDate.DateTime.ToString()
                });
                
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = consultation.Description
                });

                listViewPets.Items.Add(item);
            }
        }

        private void buttonMenu_Click(object sender, EventArgs e)
        {
            flowLayoutPanelMenu.Show();
        }

        private void buttonAdd_Click(object sender, EventArgs e)
        {
            ClinicServiceClient clinicServiceClient =
                new ClinicServiceClient("http://localhost:5292/", new System.Net.Http.HttpClient());

        //    ICollection<Client> clients = clinicServiceClient.ClientCreateAsync().Result;
        //    ICollection<Pet> pets = clinicServiceClient.PetCreateAsync().Result;
        //    ICollection<Consultation> consultations = clinicServiceClient.ConsultationCreateAsync().Result;
        }

        private void buttonDelete_Click(object sender, EventArgs e)
        {
            ClinicServiceClient clinicServiceClient =
                new ClinicServiceClient("http://localhost:5292/", new System.Net.Http.HttpClient());

         //   ICollection<Client> clients = clinicServiceClient.ClientDeleteAsync().Result;
         //   ICollection<Pet> pets = clinicServiceClient.PetDeleteAsync().Result;
         //   ICollection<Consultation> consultations = clinicServiceClient.ConsultationDeleteAsync().Result;
        }
    }
}