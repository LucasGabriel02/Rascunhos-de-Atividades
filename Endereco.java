
package visao;


public class Endereco {
    
    private String proprietario;
    
    public Endereco(String proprietario2){
        this.proprietario = proprietario2;
    }
    
    @Override
    public String toString() {
        return "Endereco{" + "Proprietario=" + proprietario + '}';
    }
    
    public String getProprietario(){
        return this.proprietario;
    }
    public void setDono(Proprietario dono){
        this.proprietario = proprietario;
    }
    
}
