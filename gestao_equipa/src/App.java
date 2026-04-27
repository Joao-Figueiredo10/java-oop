public class App {
    public static void main(String[] args) throws Exception {

        Viatura carro = new Viatura();
        carro.setNumRodas(8);
        carro.setTipoCarro("Camião desportivo");
        carro.setVelMax(367);

        carro.mostraInfo();

    }
}
