package com.group9fsd.SpringBootRestEasy.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

	private final String orderTrackingNumber = "";

	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}
}
