package visao2;

import jogoprinc.JogoPrinc;

public class JogoDigital extends JogoPrinc{
    public String anoCriacao;
    public String produtora;

    public JogoDigital(String anoCriacao, String produtora) {
        this.anoCriacao = anoCriacao;
        this.produtora = produtora;
    }
    
    //Get & Set

    public String getAnoCriacao() {
        return anoCriacao;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setAnoCriacao(String anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }
    
    
    
}
