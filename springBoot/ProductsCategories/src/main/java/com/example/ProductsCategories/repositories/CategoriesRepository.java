package com.example.ProductsCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ProductsCategories.models.Category;
import com.example.ProductsCategories.models.Product;

@Repository
public interface CategoriesRepository extends CrudRepository<Category,Long>{
	List<Category>findAll();
	List<Category>findByproductsNotContains(Product product);
}
