package com.vega.vehiculo.mapper;

import com.vega.vehiculo.domain.Vehiculo;
import com.vega.vehiculo.dto.VehiculoDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VehiculoDtoMapper {

  VehiculoDtoMapper INSTANCE = Mappers.getMapper(VehiculoDtoMapper.class);

  Vehiculo toDomain(VehiculoDto vehiculoDto);

  VehiculoDto toDto(Vehiculo vehiculo);
}
