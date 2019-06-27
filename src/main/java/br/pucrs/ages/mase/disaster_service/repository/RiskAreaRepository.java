package br.pucrs.ages.mase.disaster_service.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import br.pucrs.ages.mase.disaster_service.entity.RiskArea;

@Repository
public interface RiskAreaRepository extends ReactiveMongoRepository<RiskArea, String> {
	
}
