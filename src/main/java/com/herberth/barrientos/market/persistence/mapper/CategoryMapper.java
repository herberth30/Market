package com.herberth.barrientos.market.persistence.mapper;

import com.herberth.barrientos.market.domain.Category;
import com.herberth.barrientos.market.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria",target = "categoryId"),
            @Mapping(source = "descripcion",target = "category"),
            @Mapping(source = "estado",target = "active")
    })
    Category toCategory (Categoria categoria);

//Para el mapeo inverso no es necesario volver
// hacer un Mapping:

//    @Mappings({
//            @Mapping(source = "categoryId",target = "idCategoria"),
//            @Mapping(source = "category",target = "descripcion"),
//            @Mapping(source = "active",target = "estado")
//
//    })
// Solo se usa la siguiente anotacion para hacer
// el mapeo inverso:

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);

}
