package portal.shopping.portalshoppingproduct.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import portal.shopping.portalshoppingcart.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{
	
	List<Cart> findByCartId(Long cartId);

	List<Cart> findByUserId(Long userId);
}
