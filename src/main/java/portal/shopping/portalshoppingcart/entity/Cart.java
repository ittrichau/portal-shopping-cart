package portal.shopping.portalshoppingcart.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portal.shopping.portalshoppingcart.entity.Product;


@Entity
@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor

@NamedQueries({
@NamedQuery(name="CART.findByCartId", query="FROM Cart c WHERE p.id=:id"),
@NamedQuery(name="CART.findByUserId", query="FROM Cart c WHERE c.userId=:id")
})
public class Cart {
	
	@EmbeddedId
	private CartId cardId;
	
	@Column
	private int amout;
	
	@OneToMany(mappedBy = "cart")
	private List<Product> product = new ArrayList<>();
 
}
