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
        System.out.println("Vou mostrar a informação da viatura: ");
        System.out.println("tipo de viatura = " + this.tipoCarro);
        System.out.println("Numero de rodas = " + this.numRodas);
        System.out.println("velocidade maxima = " + this.velMax);
    }   
}
