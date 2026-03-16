package com.controller;

import com.dto.QuantityDTO;
import com.service.*;


public class QuantityMeasurementController {

    private final IQuantityMeasurementService quantityMeasurementService;

    public QuantityMeasurementController(IQuantityMeasurementService quantityMeasurementService) {
        if (quantityMeasurementService == null) {
            throw new IllegalArgumentException("Service cannot be null");
        }
        this.quantityMeasurementService = quantityMeasurementService;
    }

  

    public QuantityDTO performConversion(QuantityDTO sourceQuantity, String targetUnit) {
        return quantityMeasurementService.convert(sourceQuantity, targetUnit);
    }

    public QuantityDTO performAddition(QuantityDTO quantity1, QuantityDTO quantity2) {
        return quantityMeasurementService.add(quantity1, quantity2);
    }

    public QuantityDTO performSubtraction(QuantityDTO quantity1, QuantityDTO quantity2) {
        return quantityMeasurementService.subtract(quantity1, quantity2);
    }

    public double performDivision(QuantityDTO quantity1, QuantityDTO quantity2) {
        return quantityMeasurementService.divide(quantity1, quantity2);
    }
}