public class Cruzeiro extends Barco {
    private int numQuartos;
    private int numPisos;
    private String nomeBarco;

    public Cruzeiro() {
        numQuartos = 78;
        numPisos = 4;
        nomeBarco = "Lusiadas Craft do tikiti";
    }

    public int getNumQuartos() {
        return numQuartos;
    }
    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }
    public int getNumPisos() {
        return numPisos;
    }
    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    public String getNomeBarco() {
        return nomeBarco;
    }
    public void setNomeBarco(String nomeBarco) {
        this.nomeBarco = nomeBarco;
    }

    public void mostrarInfoCruzeiro(){
        mostraInfo();
        System.out.println("Numeros de Quartos = " + numQuartos);
        System.out.println("Numero de pisos = " + numPisos);
        System.out.println("nome do barco = " + nomeBarco);
    }   
    
}
