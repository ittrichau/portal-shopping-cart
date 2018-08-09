package portal.shopping.portalshoppingcart.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portal.shopping.portalshoppingcart.entity.Product;

@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartModel {
	
	private Long userId;
	private List<Product> product;
 
}
