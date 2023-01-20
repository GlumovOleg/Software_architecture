using ClinicService.Models;
using ClinicService.Models.Requests;
using ClinicService.Services;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;

namespace ClinicService.Controllers
{
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
        [SwaggerOperation(OperationId = "ClientCreate")]
        public ActionResult<int> Create([FromBody] CreateClientRequest createClientRequest)
        {
            int result = _clientRepository.Create(new Client
            {
                Document = createClientRequest.Document,
                SurName = createClientRequest.SurName,
                FirstName = createClientRequest.FirstName,
                Patronymic = createClientRequest.Patronymic,
                Birthday = createClientRequest.Birthday,
            });
            return Ok(result);
        }


        [HttpPut("update")]
        [SwaggerOperation(OperationId = "ClientUpdate")]
        public ActionResult<int> Update([FromBody] UpdateClientRequest updateClientRequest)
        {
            int result = _clientRepository.Update(new Client
            {
                ClientId = updateClientRequest.ClientId,
                Document = updateClientRequest.Document,
                SurName = updateClientRequest.SurName,
                FirstName = updateClientRequest.FirstName,
                Patronymic = updateClientRequest.Patronymic,
                Birthday = updateClientRequest.Birthday,
            });
            return Ok(result);
        }


        [HttpDelete("delete")]
        [SwaggerOperation(OperationId = "ClientDelete")]
        public ActionResult<int> Delete(int clientId)
        {
            int result = _clientRepository.Delete(clientId);
            return Ok(result);
        }


        [HttpGet("getAll")]
        [SwaggerOperation(OperationId = "ClientGetAll")]
        public ActionResult<List<Client>> GetAll()
        {
            return Ok(_clientRepository.GetAll());
        }


        [HttpGet("getById")]
        [SwaggerOperation(OperationId = "ClientGetById")]
        public ActionResult<Client> GetById(int clientId)
        {
            return Ok(_clientRepository.GetById(clientId));
        }

    }

}
