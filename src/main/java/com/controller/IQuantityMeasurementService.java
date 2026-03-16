package com.controller;

import com.dto.QuantityDTO;

public interface IQuantityMeasurementService {

	boolean compare(QuantityDTO quantity1, QuantityDTO quantity2);

	QuantityDTO convert(QuantityDTO sourceQuantity, String targetUnit);

	QuantityDTO add(QuantityDTO quantity1, QuantityDTO quantity2);

	QuantityDTO subtract(QuantityDTO quantity1, QuantityDTO quantity2);

	double divide(QuantityDTO quantity1, QuantityDTO quantity2);

}
