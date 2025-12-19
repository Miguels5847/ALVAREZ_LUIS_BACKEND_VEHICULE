package com.vega.vehiculo.controller;

import com.vega.vehiculo.controller.api.VehiculoAPI;
import com.vega.vehiculo.domain.Vehiculo;
import com.vega.vehiculo.dto.VehiculoDto;
import com.vega.vehiculo.mapper.VehiculoDtoMapper;
import com.vega.vehiculo.service.VehiculoService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiculoController implements VehiculoAPI {
  private final VehiculoService vehiculoService;

  public VehiculoController(VehiculoService vehiculoService) {
    this.vehiculoService = vehiculoService;
  }

  @Override
  public ResponseEntity<VehiculoDto> save(VehiculoDto vehiculoDto) {
    Vehiculo vehiculo = vehiculoService.save(VehiculoDtoMapper.INSTANCE.toDomain(vehiculoDto));
    return new ResponseEntity<>(VehiculoDtoMapper.INSTANCE.toDto(vehiculo),
        HttpStatus.CREATED);
  }

  @Override
  public ResponseEntity<List<VehiculoDto>> findAll() {
    List<Vehiculo> vehiculos = vehiculoService.findAll();
    List<VehiculoDto> vehiculoDtos = vehiculos.stream()
        .map(VehiculoDtoMapper.INSTANCE::toDto)
        .toList();
    return ResponseEntity.ok(vehiculoDtos);
  }
}
