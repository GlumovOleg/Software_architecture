using ClinicService.Models.Requests;
using ClinicService.Models;
using ClinicService.Services;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;

namespace ClinicService.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ConsultationController : ControllerBase
    {
        private IConsultationRepository _consultationRepository;

        public ConsultationController(IConsultationRepository consultationRepository)
        {
            _consultationRepository = consultationRepository;
        }


        [HttpPost("create")]
        [SwaggerOperation(OperationId = "ConsultationCreate")]

        public ActionResult<int> Create([FromBody] CreateConsultationRequest createRequest)
        {
            int result = _consultationRepository.Create(new Consultation
            {
                ClientId = createRequest.ClientId,
                PetId = createRequest.PetId,
                ConsultationDate = createRequest.ConsultationDate,
                Description = createRequest.Description
            });
            return Ok(result);
        }


        [HttpPut("update")]
        [SwaggerOperation(OperationId = "ConsultationUpdate")]
        public ActionResult<int> Update([FromBody] UpdateConsultationRequest updateRequest)
        {
            int result = _consultationRepository.Update(new Consultation
            {
                ConsultationId= updateRequest.ConsultationId,
                ClientId = updateRequest.ClientId,
                PetId = updateRequest.PetId,
                ConsultationDate = updateRequest.ConsultationDate,
                Description = updateRequest.Description
            });
            return Ok(result);
        }


        [HttpDelete("delete")]
        [SwaggerOperation(OperationId = "ConsultationDelete")]
        public ActionResult<int> Delete(int consultationId)
        {
            int result = _consultationRepository.Delete(consultationId);
            return Ok(result);
        }


        [HttpGet("getAll")]
        [SwaggerOperation(OperationId = "ConsultationGetAll")]
        public ActionResult<List<Consultation>> GetAll()
        {
            return Ok(_consultationRepository.GetAll());
        }


        [HttpGet("getById")]
        [SwaggerOperation(OperationId = "ConsultationGetById")]
        public ActionResult<Consultation> GetById(int consultationId)
        {
            return Ok(_consultationRepository.GetById(consultationId));
        }

    }
}

