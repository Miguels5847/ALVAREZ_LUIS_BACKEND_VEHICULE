package com.vega.vehiculo.service.impl;

import com.vega.vehiculo.domain.Vehiculo;
import com.vega.vehiculo.entity.VehiculoEntity;
import com.vega.vehiculo.mapper.VehiculoEntityMapper;
import com.vega.vehiculo.repository.VehiculoEntityRepository;
import com.vega.vehiculo.service.VehiculoService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehiculoServiceImpl implements VehiculoService {

  private final VehiculoEntityRepository vehiculoEntityRepository;

  @Override
  public List<Vehiculo> findAll() {
    return VehiculoEntityMapper.INSTANCE.toDomains(
        vehiculoEntityRepository.findAll()
    );
  }

  @Override
  public Vehiculo save(Vehiculo vehiculo) {
    VehiculoEntity vehiculoEntity = VehiculoEntityMapper.INSTANCE.toEntity(vehiculo);
    return VehiculoEntityMapper.INSTANCE.toDomain(
        vehiculoEntityRepository.save(vehiculoEntity)
    );
  }
}
