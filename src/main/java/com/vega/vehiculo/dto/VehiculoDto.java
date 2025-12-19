package com.vega.vehiculo.dto;

public record VehiculoDto(Long id, String marca, String modelo, String placa,
                          String nombreDelDueno, String ano, String tipoDeGasolina) {

}
