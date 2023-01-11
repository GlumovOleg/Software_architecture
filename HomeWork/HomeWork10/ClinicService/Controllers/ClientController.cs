using ClinicService.Models;
using ClinicService.Models.Requests;
using ClinicService.Services;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace ClinicService.Controllers
{
    /// <summary>
    /// Домашняя работа: Добавить контроллеры PetController и ConsultationController по образу текущего.
    /// </summary>
    [Route("api/[controller]")]
    [ApiController]
    public class ClientController : ControllerBase
    {
        private IClientRepository _clientRepository;

        public ClientController(IClientRepository clientRepository)
        {
            _clientRepository = clientRepository;
        }


        [HttpPost("create")]
        public ActionResult<int> Create([FromBody] CreateClientRequest createRequest)
        {
            int result = _clientRepository.Create(new Client
            {
                Document = createRequest.Document,
                SurName = createRequest.SurName,
                FirstName = createRequest.FirstName,
                Patronymic = createRequest.Patronymic,
                Birthday = createRequest.Birthday,
            });
            return Ok(result);
        }


        [HttpPut("update")]
        public ActionResult<int> Update([FromBody] UpdateClientRequest updateRequest)
        {
            int result = _clientRepository.Update(new Client
            {
                ClientId = updateRequest.ClientId,
                Document = updateRequest.Document,
                SurName = updateRequest.SurName,
                FirstName = updateRequest.FirstName,
                Patronymic = updateRequest.Patronymic,
                Birthday = updateRequest.Birthday,
            });
            return Ok(result);
        }


        [HttpDelete("delete")]
        public ActionResult<int> Delete(int clientId)
        {
            int result = _clientRepository.Delete(clientId);
            return Ok(result);
        }


        [HttpGet("getAll")]
        public ActionResult<List<Client>> GetAll()
        {
            return Ok(_clientRepository.GetAll());
        }


        [HttpGet("getById")]
        public ActionResult<Client> GetById(int clientId)
        {
            return Ok(_clientRepository.GetById(clientId));
        }

    }

}
