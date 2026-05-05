public class Barco extends Viatura {

    private boolean temPiscina;

    public boolean isTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }

    public Barco() {
        super("Barco", 0, 0);
    }

    @Override
    public void mostraInfo(){
        System.out.println("Vou mostrar a informação da viatura: ");
        System.out.println("tipo de viatura = " + getTipoCarro());
        System.out.println("Numero de rodas = " + getNumRodas());
        System.out.println("velocidade maxima = " + getVelMax());

        if(temPiscina){
            System.out.println("Tem piscina :-)");
        }else {
            System.out.println("Não tem piscina :-(");
        }
    }   
}
