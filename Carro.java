
package visao;


public class Carro {
    //ATRIBUTOS
    private String modelo;
    private String cor;
    private String marca;
    private String proprietario;
    private boolean tetoSolar;
    private boolean cambioAutoMatico;
    private int ano;
    private int chassi;
    private int velocMax;
    private int velocAtual;
    private int numPortas;
    private int numMarchas;
    private float volumeCombustivel;


    
    @Override
    public String toString() {
        return "****************************"+"\n<<<< Carro >>>>" + 
                "\nModelo: " + modelo + 
                "\nCor: " + cor +
                "\nAno: " + ano +
                "\n"+ marca + 
                "\nChassi: " + chassi +
                "\nVelocidade Max: " + velocMax +
                "\nVelocidade Atual: " + velocAtual + 
                "\nQuantas Portas: " + numPortas + 
                "\nTem teto solar: " + tetoSolar + 
                "\nQuantas marchas: " + numMarchas +
                "\nAutomatico: " + cambioAutoMatico +
                "\nNivel de combustivel: " + volumeCombustivel +
                "\n<<<< Propietario >>>>" + proprietario;
    
}
    public Carro (String modelo1, String cor1, String marca1, String propriet1, boolean teto1, boolean cambio1, 
            int ano1, int chassi1, int velocidMax1, int velociAtua1, int numPorta1,int numMarcha1, float voluComb1 ){
        
        this.modelo = modelo1;
        this.cor = cor1;
        this.marca = marca1;
        this.proprietario = propriet1;
        this.tetoSolar = teto1;
        this.cambioAutoMatico = cambio1;
        this.ano = ano1;
        this.chassi = chassi1;
        this.velocMax = velocidMax1;
        this.velocAtual = 0;
        this.numPortas = numPorta1;
        this.numMarchas = numMarcha1;
        this.volumeCombustivel = voluComb1;
        
    }
    
    public void acelerar(){
        this.setVelocAtual(this.getVelocAtual()+1);
    }
    public  void freia(){
        this.setVelocAtual(0);
    }
    
     public void trocaMarcha(){
        if(this.numMarchas < 6){
            this.setNumMarchas(this.getNumMarchas()+1);
        }else{
            System.out.println("O veiculo tem no maximo 6 Marchas.");
        }
        
    }
     
     public void reduzMarcha(){
        if (this.numMarchas > 0) {
            this.setNumMarchas(this.getNumMarchas()-1);
        } else {
            System.out.println("O veiculo possui 6 Marchas Possitivas.");
        }
    }
     
     public void marchaRe(){
        if (this.numMarchas > 0) {
            System.out.println("Marcha acima de 0. A marchar ré não será"
                    + " engatada.");
        }else{
            System.out.println("Engatando a ré.");
        }
    }
     
     public void calcAutonomia(float km, float combustivel){
        float consumoMedio = km/combustivel;
        System.out.printf("O veiculo vai fazer %.2f litros por km.",consumoMedio);
        System.out.println("");
    }
     
     public void combustivel(){
        System.out.printf("O combustivel ta com %.2f porcento da capacidade.",this.volumeCombustivel);
    }
   
    
   
    //GET

    public String getModelo1(){
        return this.modelo;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getProprietario(){
        return this.proprietario;
    }
    public boolean getTetoSolar(){
        return this.tetoSolar;
    }
    
    public boolean getCambioAutomatico(){
        return this.cambioAutoMatico;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public int getChassi(){
        return this.chassi;
    }
    
    public int getVelocMax(){
        return this.velocMax;
    }
    
    public int getVelocAtual(){
        return this.velocAtual;
    }
    
    public int getNumPortas (){
        return this.numPortas;
    }
    
    public int getNumMarchas(){
        return this.numMarchas;
    }
    
    public float getVolumeCombustivel(){
        return this.volumeCombustivel;
    }
    
    
    //SET
    public void setModelo(String modelo2){
        this.modelo = modelo2;
    }
    
    public void setCor(String cor2){
        this.cor = cor2;
    }
    
    public void setMarca(String marca2){
        this.marca = marca2;
    }
    
    public void setProprietario(String proprietario2){
        this.proprietario = proprietario2;
    }
    
    public void setTetoSolar(boolean teto2){
        this.tetoSolar = teto2;
    }
    
    public void setCambioAutomatico(boolean cambio2){
        this.cambioAutoMatico = cambio2;
    }
    
    public void set(int ano2){
        this.ano = ano2;
    }
    
    public void setChassi(int chassi2){
        this.chassi = chassi2;
    }
    
    public void setVelocMax(int velocMax2){
        this.velocMax = velocMax2;
    }
    
    public void setVelocAtual(int velocAtual2){
        this.velocAtual = velocAtual2;
    }
    
    public void setNumPortas(int numPortas2 ){
        this.numPortas = numPortas2;
    }
    
    public void setNumMarchas(int numMarchas2){
        this.numMarchas = numMarchas2;
    }
    
    public void setVolumeCombustivel(float volumeComb2){
        this.volumeCombustivel = volumeComb2;
    }
         

    
    
    
    
    
    
    
}
