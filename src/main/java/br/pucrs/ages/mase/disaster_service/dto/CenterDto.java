package br.pucrs.ages.mase.disaster_service.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class CenterDto {
	
	private @NotNull BigDecimal latitude;
	private @NotNull BigDecimal longitude;
	
	public BigDecimal getLatitude() {
		return latitude;
	}
	
	public BigDecimal getLongitude() {
		return longitude;
	}
	
}
