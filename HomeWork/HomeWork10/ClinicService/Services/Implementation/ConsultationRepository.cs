using ClinicService.Models;

namespace ClinicService.Services.Implementation
{
    /// <summary>
    /// Домашняя работа: Доработать имплементацию для текущего репозитория
    /// </summary>
    public class ConsultationRepository : IConsultationRepository
    {
        private const string connectionString = "Data Source = clinic.db; Version = 3; Pooling = true; Max Pool Size = 100;";
        public int Create(Consultation item)
        {
            throw new NotImplementedException();
        }

        public int Delete(int id)
        {
            throw new NotImplementedException();
        }

        public IList<Consultation> GetAll()
        {
            throw new NotImplementedException();
        }

        public Consultation GetById(int id)
        {
            throw new NotImplementedException();
        }

        public int Update(Consultation item)
        {
            throw new NotImplementedException();
        }
    }
}
