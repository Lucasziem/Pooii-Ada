package Interface;

public class Morcego implements Amamentador, Voador {

    @Override
    public void alimentar() {
        System.out.println("Morcego está se alimentando de insetos.");
    }

    @Override
    public void movimentar() {
        System.out.println("Morcego voando no ar noturno.");
    }

    @Override
    public void amamentar() {
        System.out.println("Morcego amamentando seu filhote.");
    }

    @Override
    public void voar() {
        System.out.println("Morcego voando pela caverna.");
    }

    public void sonar() {
        System.out.println("Morcego usa seu sonar para se localizar.");
    }
}