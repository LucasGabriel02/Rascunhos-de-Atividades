import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Venda {

	
	@Id @GeneratedValue
	private Integer id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Cliente cliente;
	
	
	@OneToMany(cascade=CascadeType.ALL)s
	private List<ItemVenda> itensVenda;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	

	
	
}
