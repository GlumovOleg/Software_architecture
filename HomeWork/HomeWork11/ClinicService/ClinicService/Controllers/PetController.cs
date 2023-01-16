using ClinicService.Models.Requests;
using ClinicService.Models;
using ClinicService.Services;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace ClinicService.Controllers
{
    /// <summary>
    /// Домашняя работа: Доработать имплементацию для текущего репозитория
    /// </summary>
    [Route("api/[controller]")]
    [ApiController]
    public class PetController : ControllerBase
    {
        private IPetRepository _petRepository;

        public PetController(IPetRepository petRepository)
        {
            _petRepository = petRepository;
        }


        [HttpPost("create")]
        public ActionResult<int> Create([FromBody] CreatePetRequest createRequest)
        {
            int result = _petRepository.Create(new Pet
            {
                ClientId = createRequest.ClientId,
                Name = createRequest.Name,
                Birthday = createRequest.Birthday,
            });
            return Ok(result);
        }


        [HttpPut("update")]
        public ActionResult<int> Update([FromBody] UpdatePetRequest updateRequest)
        {
            int result = _petRepository.Update(new Pet
            {
                PetId = updateRequest.PetId,
                ClientId = updateRequest.ClientId,
                Name = updateRequest.Name,
                Birthday = updateRequest.Birthday,
            });
            return Ok(result);
        }


        [HttpDelete("delete")]
        public ActionResult<int> Delete(int petId)
        {
            int result = _petRepository.Delete(petId);
            return Ok(result);
        }


        [HttpGet("getAll")]
        public ActionResult<List<Pet>> GetAll()
        {
            return Ok(_petRepository.GetAll());
        }


        [HttpGet("getById")]
        public ActionResult<Pet> GetById(int petId)
        {
            return Ok(_petRepository.GetById(petId));
        }

    }
}

