package br.pucrs.ages.mase.disaster_service.dto;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class RiskAreaDto {
	
	private @Valid @NotNull CenterDto center;
	private @NotNull BigDecimal radius;
	private @NotEmpty String disasterType;
	
	public CenterDto getCenter() {
		return center;
	}
	
	public BigDecimal getRadius() {
		return radius;
	}
	
	public String getDisasterType() {
		return disasterType;
	}
	
}
