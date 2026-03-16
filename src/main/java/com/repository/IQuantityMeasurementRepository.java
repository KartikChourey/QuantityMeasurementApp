package com.repository;

import java.util.List;

import com.entity.QuantityMeasurementEntity;
import com.service.*;

public interface IQuantityMeasurementRepository {

    void save(QuantityMeasurementEntity entity);

    List<QuantityMeasurementEntity> findAll();
}