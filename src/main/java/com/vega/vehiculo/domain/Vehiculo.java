package com.vega.vehiculo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehiculo {

  private Long id;

  private String marca;

  private String modelo;

  private String placa;

  private String nombreDelDueno;

  private String ano;

  private String tipoDeGasolina;
}
