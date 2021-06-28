package com.example.ProductsCategories.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ProductsCategories.models.Category;
import com.example.ProductsCategories.models.Product;
import com.example.ProductsCategories.services.ProCatService;

@Controller
public class StoreController {
private final ProCatService proCatService;

public StoreController(ProCatService proCatService) {
	this.proCatService = proCatService;
}
@RequestMapping("/products/new")
public String newproduct(@ModelAttribute("product") Product product) {
	return "product.jsp";
}
@RequestMapping(value="/product",method=RequestMethod.POST)
public String addproduct(@Valid @ModelAttribute("product")Product product,BindingResult result) {
	if(result.hasErrors()) {
		return "product.jsp";
	}
	 proCatService.createproduct(product);
	 return"redirect:/products/new";
}
@RequestMapping("/category/new")
public String newpCat(@ModelAttribute("category") Category category) {
	return "category.jsp";
}
@PostMapping("/category")
public String newCategory(@Valid @ModelAttribute("category") Category category,BindingResult result) {
	if(result.hasErrors()) {
		return"category.jsp";
	}
	 proCatService.createcategory(category);
	 return"redirect:/category/new";
}
//@RequestMapping("/products/{id}")
//public String showProduct(Model model,@PathVariable("id")Long id) {
//	Product product1=proCatService.findOneProduct(id);
//	model.addAttribute("productFromController",product1);
//	List<Category>unlisted=proCatService.allcategoriesExept(product1);
//	model.addAttribute("unlisted",unlisted);
//	return"showProduct.jsp";
//}
//@RequestMapping("/addcategory/{id}")
//public String addcategories(@PathVariable("id")Long pro_id,@RequestParam("category")Long cat_id) {
//	proCatService.add(pro_id,cat_id);
//	return"redirect:/products"+pro_id;
//}
}
