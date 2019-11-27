
package visao;


public class Proprietario {
    //ATRIBUTO
    private String nome;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
    private int cpf;
    private int rg;
    private int dataNasc;
    private int cep;
    
    
    public Proprietario(String nome, int cpf, int rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;        
    }
    
    @Override
    public String toString(){
        return "\nNome: " + nome + 
                "\nCPF: " + cpf + 
                "\nRG: " + rg +
                "\nData de Nascimento: "+ dataNasc + 
                "\nRua: " + rua + 
                "\nBairro: " + bairro + 
                "\nCidade: " + cidade + 
                "\nEstado: " + estado +
                "\nCEP: " + cep + 
                "\nComplemento: " + complemento+
                "\n****************************************";
    }
    
    //GET
    public String getNome(){
        return this.nome;
    }
    public String getRua(){
        return this.rua;
    }
    public String getBairro(){
        return this.bairro;
    }
    public String getCidade(){
        return this.cidade;
    }
    public String getEstado(){
        return this.estado;
    }
    public String getComplemento(){
        return this.complemento;
    }
    public int getCpf(){
        return this.cpf;
    }
    public int getRg(){
        return this.rg;
    }
    public int getcep(){
        return this.cep;
    }
    public float getDataNasc(){
        return this.dataNasc;
    }
    
    //SET
    
    public void setNome(String m2){
        this.nome = m2;
    }
    
    public void setRua(String r2){
        this.rua = r2;
    }
    public void setBairro(String b2){
        this.bairro = b2;
    }
    
    public void setCidade(String c2){
        this.cidade = c2;
    }
    
    public void setEstado(String e2){
        this.estado = e2;
    }
    
    public void setComplemento(String compl2){
        this.complemento = compl2;
    }
    
    public void setCpf(int cpf2){
        this.cpf = cpf2;
    }
    
    public void setRg(int rg2){
        this.rg = rg2;
    }
    
    public void setCep(int cep2){
        this.cep = cep2;
    }
    public void setDataNasc(int data2){
        this.dataNasc = data2;
    }
    
}
