package com.myapp.spring.repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.myapp.spring.model.Product;

//this is a data repository class
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
     
	//select * from devopsproducts where UPPER(productName)=UPPER(?1)
	//List<Product> findByProductNameIgnoreCase(String productName);
	
	//select * from devopsproducts where price=?1
//	List<Product> findByPriceEquals(Double price);
	
	//
	//List<Product> findByPriceGreaterThanEqual(Double price);

	//Optional<List<Product>> findByProductNameOrPrice(String productName, Double price);
	Optional<List<Product>> findByPriceGreaterThanEqual(Double price);



	Optional<List<Product>> findByProductNameOrPrice(String productName,Double price);




	Optional<List<Product>> findByProductNameLike(String productName);



	Optional<List<Product>> findByPriceIn(Collection<Double> prices);



	Optional<List<Product>> findByProductNameIgnoreCase(String productName);



}

