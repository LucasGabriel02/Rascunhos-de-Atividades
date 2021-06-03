import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;


@Entity
public class Cliente {
	
	
	@Id @GeneratedValue
	private Integer id;
	private String nome;
	private String cpf;
	
	
	@OneToMany(mappedBy="cliente",cascade=CascadeType.ALL)
	private List<Venda> vendas;
	
	@OneToOne(cascade=CascadeType.ALL)
	
	private Endereco endereco;
	
	public List<Venda getVendas() {
		return vendas;
	}
	

	public Cliente() {
		super();
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
	
	

}
