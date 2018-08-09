package portal.shopping.portalshoppingcart.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Id;

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
@NamedQuery(name="CART.findByCartId", query="FROM Cart c WHERE c.id=:id"),
@NamedQuery(name="CART.findByUserId", query="FROM Cart c WHERE c.userId=:id")
})
public class Cart {
	
	@Id
	private Long cartId;
	@Column
	private Long userId;
	@Column
	private String productId;
	@Column
	private Date dateOder;
	
	@Column
	private int amout;
	
	@OneToMany(mappedBy = "cart")
	private List<Product> product = new ArrayList<>();
 
}
