package br.pucrs.ages.mase.disaster_service.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.ages.mase.disaster_service.dto.RiskAreaDto;
import br.pucrs.ages.mase.disaster_service.service.RiskAreaService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/disaster")
public class RiskAreaController {
	
	private final RiskAreaService riskAreaService;
	
	public RiskAreaController(RiskAreaService riskAreaService) {
		this.riskAreaService = riskAreaService;
	}
	
	@PostMapping
	public Mono<RiskAreaDto> insert(@Valid @RequestBody RiskAreaDto riskAreaDto) {
		return riskAreaService.insert(riskAreaDto);
	}
	
	@GetMapping
	public Flux<RiskAreaDto> getAll() {
		return riskAreaService.getAll();
	}
	
}
