using ClinicService.Models;

namespace ClinicService.Services.Implementation
{
    /// <summary>
    /// Домашняя работа: Доработать имплементацию для текущего репозитория
    /// </summary>
    public class PetRepository : IPetRepository
    {
        private const string connectionString = "Data Source = clinic.db; Version = 3; Pooling = true; Max Pool Size = 100;";
        public int Create(Pet item)
        {
            throw new NotImplementedException();
        }

        public int Delete(int id)
        {
            throw new NotImplementedException();
        }

        public IList<Pet> GetAll()
        {
            throw new NotImplementedException();
        }

        public Pet GetById(int id)
        {
            throw new NotImplementedException();
        }

        public int Update(Pet item)
        {
            throw new NotImplementedException();
        }
    }
}
