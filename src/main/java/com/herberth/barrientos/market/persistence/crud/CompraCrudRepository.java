package com.herberth.barrientos.market.persistence.crud;

import com.herberth.barrientos.market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {

    //    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    List<Compra>findByMedioPago(String medioPago);

}
