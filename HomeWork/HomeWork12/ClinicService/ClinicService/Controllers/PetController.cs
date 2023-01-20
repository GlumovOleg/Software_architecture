using ClinicService.Models.Requests;
using ClinicService.Models;
using ClinicService.Services;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;

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
        [SwaggerOperation(OperationId = "PetCreate")]
        public ActionResult<int> Create([FromBody] CreatePetRequest createPetRequest)
        {

            if (createPetRequest.Birthday < DateTime.Now.AddYears(-25) || createPetRequest.Name.Length < 3)
            {
                return BadRequest(0);
            }

            int result = _petRepository.Create(new Pet
            {
                ClientId = createPetRequest.ClientId,
                Name = createPetRequest.Name,
                Birthday = createPetRequest.Birthday,
            });
            return Ok(1);

        }


        [HttpPut("update")]
        [SwaggerOperation(OperationId = "PetUpdate")]
        public ActionResult<int> Update([FromBody] UpdatePetRequest updatePetRequest)
        {

            if (updatePetRequest.Birthday < DateTime.Now.AddYears(-25) || updatePetRequest.Name.Length < 3)
            {
                return BadRequest(0);
            }

            int result = _petRepository.Update(new Pet
            {
                PetId = updatePetRequest.PetId,
                ClientId = updatePetRequest.ClientId,
                Name = updatePetRequest.Name,
                Birthday = updatePetRequest.Birthday,
            });
            return Ok(1);
        }


        [HttpDelete("delete")]
        [SwaggerOperation(OperationId = "PetDelete")]
        public ActionResult<int> Delete(int petId)
        {
            if (petId <= 0)
            {
                return BadRequest(0);
            }
            int result = _petRepository.Delete(petId);
            return Ok(1);
        }


        [HttpGet("getAll")]
        [SwaggerOperation(OperationId = "PetGetAll")]
        public ActionResult<List<Pet>> GetAll()
        {
            return Ok(_petRepository.GetAll());
        }


        [HttpGet("getById")]
        [SwaggerOperation(OperationId = "PetGetById")]
        public ActionResult<Pet> GetById(int petId)
        {
            return Ok(_petRepository.GetById(petId));
        }

    }
}

