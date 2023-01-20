using ClinicService.Controllers;
using ClinicService.Models;
using ClinicService.Models.Requests;
using ClinicService.Services;
using Microsoft.AspNetCore.Mvc;
using Moq;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClinicServiceTest
{

    /// <summary>
    /// Домашняя работа:
    /// Разработать методы тестирования контроллера PetController:
    /// Обновление данных UpdateTest +
    /// Получение данных (по всем животным) GetAllTest +
    /// Получение данных (по конктретному животному) GetByIdTest + 
    /// </summary>

    public class PetControllerTests
    {

        private PetController _petController;
        private Mock<IPetRepository> _mocPetRepository;

        public PetControllerTests()
        {
            _mocPetRepository = new Mock<IPetRepository>();
            _petController = new PetController(_mocPetRepository.Object);
        }

        #region CreateTests

        [Fact]
        public void PetCreateBadRequestTest()
        {
            CreatePetRequest createPetRequest = new CreatePetRequest();
            createPetRequest.Name = "П";
            createPetRequest.Birthday = DateTime.Now.AddYears(-45);
            createPetRequest.ClientId = 3;

            ActionResult<int> operationResult = _petController.Create(createPetRequest);

            int expectedOperationValue = 0;

            Assert.IsType<BadRequestObjectResult>(operationResult.Result);
            Assert.Equal(expectedOperationValue, (int)((BadRequestObjectResult)operationResult.Result).Value);
        }
        [Fact]
        public void PetCreateTest()
        {
            // Метод тестирования состоит из условных 3х частей

            // 1. Подготовка данных для тестировния.

            CreatePetRequest createPetRequest = new CreatePetRequest();
            createPetRequest.Name = "Персик";
            createPetRequest.Birthday = DateTime.Now.AddYears(-15);
            createPetRequest.ClientId = 1;

            // 2. Исполнение тестирумоего метода.

            ActionResult<int> operationResult = _petController.Create(createPetRequest);

            // 3. Подготовка эталонгого результата (expected), проверка результата.

            int expectedOperationValue = 1;

            Assert.IsType<OkObjectResult>(operationResult.Result);
            Assert.Equal(expectedOperationValue, (int)((OkObjectResult)operationResult.Result).Value);

        }

        #endregion

        #region UpdateTests
        public void UpdatePetBadRequestTest(int petId)
        {
            // 1. Подготовка данных для тестировния.

            UpdatePetRequest updatePetRequest = new UpdatePetRequest();
            updatePetRequest.PetId = -5;
            updatePetRequest.Name = "aф";
            updatePetRequest.Birthday = DateTime.Now.AddYears(-35);
            updatePetRequest.ClientId = 5;

            // 2. Исполнение тестирумоего метода.

            ActionResult<int> operationResult = _petController.Update(updatePetRequest);

            // 3. Подготовка эталонгого результата (expected), проверка результата.

            int expectedOperationValue = 0;

            Assert.IsType<BadRequestObjectResult>(operationResult.Result);
            Assert.Equal(expectedOperationValue, (int)((BadRequestObjectResult)operationResult.Result).Value);
        }
        public void UpdatePetTest(int petId)
        {
            // 1. Подготовка данных для тестировния.

            UpdatePetRequest updatePetRequest = new UpdatePetRequest();
            updatePetRequest.PetId = 1;
            updatePetRequest.Name = "Пфффф";
            updatePetRequest.Birthday = DateTime.Now.AddYears(-15);
            updatePetRequest.ClientId = 1;

            // 2. Исполнение тестирумоего метода.

            ActionResult<int> operationResult = _petController.Update(updatePetRequest);

            // 3. Подготовка эталонгого результата (expected), проверка результата.

            int expectedOperationValue = 1;

            Assert.IsType<OkObjectResult>(operationResult.Result);
            Assert.Equal(expectedOperationValue, (int)((OkObjectResult)operationResult.Result).Value);
        }

        #endregion

        #region DeleteTests

        [Theory]
        [InlineData(-1)]
        [InlineData(-22)]
        [InlineData(0)]

        public void DeletePetBadRequestTest(int petId)
        {
            // 2. Исполнение тестирумоего метода.

            ActionResult<int> operationResult = _petController.Delete(petId);

            // 3. Подготовка эталонгого результата (expected), проверка результата.

            int expectedOperationValue = 0;
            Assert.IsType<BadRequestObjectResult>(operationResult.Result);
            Assert.Equal(expectedOperationValue, (int)((BadRequestObjectResult)operationResult.Result).Value);
        }

        [Theory]
        [InlineData(1)]
        [InlineData(22)]
        [InlineData(34)]

        /* [InlineData(2, "Джесси", 2015)]
        [InlineData(3, "Персик", 2020)]
        [InlineData(3, "Барсик", 2021)]*/
        public void DeletePetTest(int petId/*, string name, int dd*/)
        {
            // 2. Исполнение тестирумоего метода.
            
            ActionResult<int> operationResult = _petController.Delete(petId);

            // 3. Подготовка эталонгого результата (expected), проверка результата.

            int expectedOperationValue = 1;
            Assert.IsType<OkObjectResult>(operationResult.Result);
            Assert.Equal<int>(expectedOperationValue, (int)((OkObjectResult)operationResult.Result).Value);
        }

        #endregion

        #region GetAllTest

        [Fact]
        public void GetAllPetsTests()
        {
            // 1. Подготовка данных для тестировния.
            _mocPetRepository.Setup(repository =>
            repository.GetAll()).Returns(new List<Pet>()
            {
                new Pet(),
                new Pet(),
                new Pet()
            });

            // 2. Исполнение тестирумоего метода.

            ActionResult<List<Pet>> operationResult = _petController.GetAll();

            // 3. Подготовка эталонгого результата (expected), проверка результата.

            Assert.IsType<OkObjectResult>(operationResult.Result);
            Assert.IsAssignableFrom<List<Pet>>(((OkObjectResult)operationResult.Result).Value);


            _mocPetRepository.Verify(repository => repository.GetAll(), Times.Once);
        }

        #endregion

        #region GetByIdTest

        [Theory]
        [InlineData(1)]
        [InlineData(22)]
        [InlineData(34)]
        public void GetByIdPetTest(int petId)
        {
            // 1. Подготовка данных для тестировния.
            _mocPetRepository.Setup(repository =>
            repository.GetById(petId)).Returns(new Pet()
            {
                PetId = petId
            });

            // 2. Исполнение тестирумоего метода.

            ActionResult<Pet> operationResult = _petController.GetById(petId);

            // 3. Подготовка эталонгого результата (expected), проверка результата.

            Assert.IsType<OkObjectResult>(operationResult.Result);
            Assert.IsAssignableFrom<Pet>(((OkObjectResult)operationResult.Result).Value);


            _mocPetRepository.Verify(repository => repository.GetById(petId), Times.Once);
        }

        #endregion

    }
}
