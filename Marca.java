
package visao;


public class Marca {
    private int anoLancamento;
    private int codigoIndentificador;
    
    
    public Marca(int anoLancamento, int codigoIndentificador) {
        this.anoLancamento = anoLancamento;
        this.codigoIndentificador = codigoIndentificador;
    
}
    
    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getCodigoIndentificador() {
        return codigoIndentificador;
    }

    public void setCodigoIndentificador(int codigoIndentificador) {
        this.codigoIndentificador = codigoIndentificador;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "<<<< Detalhes >>>>" + "\nAno de Lançamento: " + anoLancamento + 
                "\nIndentificador: " + codigoIndentificador ;
    }
}

