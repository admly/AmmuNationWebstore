package com.studbaza.shop.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {
    <S extends Product> S save(S entity);
    Product findOne(String primaryKey);
    Iterable<Product> findAll();
    long count();
    void delete(Product entity);
    boolean exists(String primaryKey);
}
