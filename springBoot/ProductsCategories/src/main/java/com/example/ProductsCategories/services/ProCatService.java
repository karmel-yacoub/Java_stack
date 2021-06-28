package com.example.ProductsCategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ProductsCategories.models.Category;
import com.example.ProductsCategories.models.Product;
import com.example.ProductsCategories.repositories.CategoriesRepository;
import com.example.ProductsCategories.repositories.ProductRepository;

@Service
public class ProCatService {
 private final CategoriesRepository categoriesRepository;
 private final ProductRepository productRepository;
public ProCatService(CategoriesRepository categoriesRepository, ProductRepository productRepository) {
	this.categoriesRepository = categoriesRepository;
	this.productRepository = productRepository;
}
public Product createproduct(Product product) {
	return productRepository.save(product);
}
public Category createcategory(Category category) {
	return categoriesRepository.save(category);
}
public List<Product>findAllProducts(){
	return productRepository.findAll();
}
public List<Category>findAllcategory(){
	return categoriesRepository.findAll();
}
public Product findOneProduct(Long id) {
	Optional<Product>optionalProduct=productRepository.findById(id);
	if(optionalProduct.isPresent()){
		return optionalProduct.get();
	}else {
		return null;
	}
}
public Category findOneCategory(Long id) {
	Optional<Category>optionalcategory=categoriesRepository.findById(id);
	if(optionalcategory.isPresent()){
		return optionalcategory.get();
	}else {
		return null;
	}
}
public List <Category> allcategoriesExept(Product product){
	return categoriesRepository.findByproductsNotContains(product);
}
public Product add(Long pro_id, Long cat_id) {
	Product product=productRepository.findById(pro_id).orElse(null);
	Category category=categoriesRepository.findById(cat_id).orElse(null);
	List<Category> cat=product.getCategories();
	cat.add(category);
	product.setCategories(cat);
	
	return productRepository.save(product);
}

}

