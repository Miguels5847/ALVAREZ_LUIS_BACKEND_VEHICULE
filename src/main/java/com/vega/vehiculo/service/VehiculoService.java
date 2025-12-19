package com.vega.vehiculo.service;

import com.vega.vehiculo.domain.Vehiculo;
import java.util.List;

public interface VehiculoService {

  List<Vehiculo> findAll();

  Vehiculo save(Vehiculo vehiculo);
}
