package br.pucrs.ages.mase.disaster_service.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.pucrs.ages.mase.disaster_service.dto.RiskAreaDto;
import br.pucrs.ages.mase.disaster_service.entity.RiskArea;
import br.pucrs.ages.mase.disaster_service.repository.RiskAreaRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
public class RiskAreaService {
	
	private final RiskAreaRepository riskAreaRepository;
	private final ObjectMapper objectMapper;
	
	public RiskAreaService(RiskAreaRepository riskAreaRepository, ObjectMapper objectMapper) {
		this.riskAreaRepository = riskAreaRepository;
		this.objectMapper = objectMapper;
	}
	
	public Mono<RiskAreaDto> insert(RiskAreaDto riskAreaDto) {
		return riskAreaRepository.save(objectMapper.convertValue(riskAreaDto, RiskArea.class))
				.subscribeOn(Schedulers.elastic())
				.map(riskArea -> objectMapper.convertValue(riskArea, RiskAreaDto.class));
	}
	
	public Flux<RiskAreaDto> getAll() {
		return riskAreaRepository.findAll()
				.subscribeOn(Schedulers.elastic())
				.map(riskArea -> objectMapper.convertValue(riskArea, RiskAreaDto.class));
	}
	
}
