package br.pucrs.ages.mase.disaster_service.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.ages.mase.disaster_service.dto.RiskAreaDto;
import br.pucrs.ages.mase.disaster_service.service.RiskAreaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/risk-area")
public class RiskAreaController {
	
	private final RiskAreaService riskAreaService;
	
	public RiskAreaController(RiskAreaService riskAreaService) {
		this.riskAreaService = riskAreaService;
	}
	
	@ApiOperation(value = "API para registrar uma área de risco",
			notes = "Faz a inclusão de uma área de risco no sistema.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Inclusão de área de risco realizada com sucesso", response = RiskAreaDto.class),
	})
	@PostMapping
	public Mono<RiskAreaDto> insert(@Valid @RequestBody RiskAreaDto riskAreaDto) {
		return riskAreaService.insert(riskAreaDto);
	}
	
	@ApiOperation(value = "API para retornar todas as áreas de risco",
			notes = "Retorna todas as áreas de risco registradas no sistema.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Áreas de risco retornadas com sucesso", response = RiskAreaDto[].class),
	})
	@GetMapping
	public Flux<RiskAreaDto> getAll() {
		return riskAreaService.getAll();
	}
	
}
