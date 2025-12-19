package com.vega.vehiculo.mapper;

import com.vega.vehiculo.domain.Vehiculo;
import com.vega.vehiculo.entity.VehiculoEntity;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface VehiculoEntityMapper {
  VehiculoEntityMapper INSTANCE = Mappers.getMapper(VehiculoEntityMapper.class);

  VehiculoEntity toEntity(Vehiculo vehiculo);
  List<VehiculoEntity> toEntities(List<Vehiculo> vehiculos);

  Vehiculo toDomain(VehiculoEntity vehiculoEntity);
  List<Vehiculo> toDomains(List<VehiculoEntity> vehiculoEntities);

}
