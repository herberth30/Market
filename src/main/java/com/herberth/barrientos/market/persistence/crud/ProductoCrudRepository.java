package com.herberth.barrientos.market.persistence.crud;

import com.herberth.barrientos.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>>findByCantidadStockLessThanAndEstado(int cantidad, boolean estado);



}


