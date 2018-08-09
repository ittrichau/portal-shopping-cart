package portal.shopping.portalshoppingproduct.service.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import portal.shopping.portalshoppingcart.entity.Cart;

@Repository
public class CartService {
	
	/*@Autowired
	private CartRepository cartRepo;*/
	@PersistenceContext
	private EntityManager em;
	
	public List<Cart> getCartWithCartId(Long cartId) {
		return em.createNamedQuery("CART.findByCartId", Cart.class).setParameter("id", cartId).getResultList();
	}
	
	
	
//	public Product getProduct(Long productId) {
//		return cartRepo.findById(productId).map(pr->{
//			pr.setCategories(new ArrayList<>());
//			return pr;
//		}).orElse(null);
//	}
	
	/*public List<Product> getProductsByCategory(Long categoryId) {
		return productRepo.findByCategoriesId(categoryId).stream().map(pr->{
			pr.setCategories(new ArrayList<>());
			return pr;
		}).collect(Collectors.toList());
	}*/
	
	@Transactional
	public Cart update(Cart cart) {
		return em.merge(cart);
	}

}
