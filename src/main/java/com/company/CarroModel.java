package com.company;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

/**
 * CarroModel
 */
@Entity(name = "tb_carro")
public class CarroModel extends PanacheEntity{

    public String nome;
    public String modelo;
    public String cor;


}