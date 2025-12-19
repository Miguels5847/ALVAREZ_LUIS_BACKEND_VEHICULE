package com.vega.vehiculo.controller.api;

import com.vega.vehiculo.dto.VehiculoDto;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1/vehicles")
public interface VehiculoAPI {

  @PostMapping
  ResponseEntity<VehiculoDto> save(@RequestBody VehiculoDto vehiculoDto);

  @GetMapping
  ResponseEntity<List<VehiculoDto>> findAll();

}
