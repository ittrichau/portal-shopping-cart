package portal.shopping.portalshoppingproduct.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import portal.shopping.portalshoppingcart.entity.Cart;
import portal.shopping.portalshoppingcart.entity.Product;
import portal.shopping.portalshoppingproduct.service.repository.CartService;
import portal.shopping.portalshoppingproduct.service.repository.ProductService;

@RestController
public class CartController {

	@Autowired
	CartService cartService;

	/*@GetMapping("/products/include-category/{id}")
	public Object getProductById(@PathVariable("id") Long id) {
		if (id == null) {
			return cartService.
		}
		return cartService.getProductWithCategory(id);
	}
	
	@GetMapping("/products/{id}")
	public Object getProductWithoutCategoryById(@PathVariable("id") Long id) {
		return productService.getProduct(id);
	}*/
	
	@GetMapping("/cart/{cartId}")
	public List<Cart> getCartWithCartId(@PathVariable("cartId") Long cartId) {
		System.out.println("asdasdsadsd");
		return cartService.getCartWithCartId(cartId);
	}

/*	@GetMapping("/products-include-category")
	public Object getAllProduct() {
		return productService.getAllProductWithCategory();
	}

	@PutMapping("/products/{id}")
	public Product updateProductCategory(@PathVariable("id") long id) {
		Product product = productService.getProductWithCategory(id);
		product.setCategories(new ArrayList<>());
		return productService.update(product);
	}
	
	@GetMapping("/cart/{id}")
	public Product getCart(@PathVariable("id") long id) {
		Product product = productService.getProductWithCategory(id);
		product.setCategories(new ArrayList<>());
		return productService.update(product);
	}*/
	

}
