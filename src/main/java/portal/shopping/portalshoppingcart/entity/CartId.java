package portal.shopping.portalshoppingcart.entity;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Embeddable
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor

public class CartId  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column
	private Long cartId;
	@Column
	private Long userId;
	@Column
	private String productId;
	@Column
	private Date dateOder;
 
}
