public class Viatura {
    
    private String tipoCarro;
    private int numRodas;
    private int velMax;
    
    public Viatura() {
    }

    public Viatura(String tipoCarro, int numRodas, int velMax) {
        this.tipoCarro = tipoCarro;
        this.numRodas = numRodas;
        this.velMax = velMax;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }
    
    public void mostraInfo(){
        System.out.println("Vou mostrar a informação ?");
        System.out.println("tipo de carro = " + this.tipoCarro);
        System.out.println("tipo de carro = " + this.numRodas);
        System.out.println("tipo de carro = " + this.velMax);
    }   
}
