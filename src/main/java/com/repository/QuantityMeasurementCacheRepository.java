package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.entity.QuantityMeasurementEntity;
import com.service.*;

public class QuantityMeasurementCacheRepository implements IQuantityMeasurementRepository {

    private static QuantityMeasurementCacheRepository instance;
    private final List<QuantityMeasurementEntity> measurementCache;

    private QuantityMeasurementCacheRepository() {
        measurementCache = new ArrayList<>();
    }

    public static QuantityMeasurementCacheRepository getInstance() {
        if (instance == null) {
            instance = new QuantityMeasurementCacheRepository();
        }
        return instance;
    }

    public void save1(QuantityMeasurementEntity entity) {
        measurementCache.add(entity);
    }

    @Override
    public List<QuantityMeasurementEntity> findAll() {
        return new ArrayList<>(measurementCache);
    }

	@Override
	public void save(QuantityMeasurementEntity entity) {
		// TODO Auto-generated method stub
		
	}
}