package com.vega.vehiculo.repository;

import com.vega.vehiculo.entity.VehiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoEntityRepository extends JpaRepository<VehiculoEntity, Long> {

}
