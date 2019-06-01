package br.pucrs.ages.mase.disaster_service.entity;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "riskareas")
public class RiskArea {
	
	private @Id String id;
	private Center center;
	private BigDecimal radius;
	private String disasterType;
	
	public String getId() {
		return id;
	}
	
	public Center getCenter() {
		return center;
	}
	
	public BigDecimal getRadius() {
		return radius;
	}
	
	public String getDisasterType() {
		return disasterType;
	}
	
}
