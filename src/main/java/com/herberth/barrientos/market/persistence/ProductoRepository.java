package com.herberth.barrientos.market.persistence;

import com.herberth.barrientos.market.persistence.crud.ProductoCrudRepository;
import com.herberth.barrientos.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria){
        return  productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);

    }
    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);

    }
    public Optional<Producto> getProducto(int id){
        return productoCrudRepository.findById(id);
    }

    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }
    public void delet(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
