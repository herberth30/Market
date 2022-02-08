package com.herberth.barrientos.market.persistence;

import com.herberth.barrientos.market.persistence.crud.CompraCrudRepository;
import com.herberth.barrientos.market.persistence.entity.Compra;

import java.util.List;

public class CompraRepository {
    private CompraCrudRepository compraCrudRepository;

    List<Compra>getByMedioPago(String medioPago){
        return compraCrudRepository.findByMedioPago(medioPago);
    }

}
