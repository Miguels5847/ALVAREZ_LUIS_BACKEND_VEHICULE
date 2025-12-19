package com.vega.vehiculo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_vehiculos")
@Getter
@Setter
public class VehiculoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "marca", nullable = false)
  private String marca;

  @Column(name = "modelo", nullable = false)
  private String modelo;

  @Column(name = "placa", nullable = false)
  private String placa;

  @Column(name = "nombre_del_dueno", nullable = false)
  private String nombreDelDueno;

  @Column(name = "ano", nullable = false)
  private String ano;

  @Column(name = "tipo_de_gasolina", nullable = false)
  private String tipoDeGasolina;
}
