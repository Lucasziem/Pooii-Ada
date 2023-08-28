package Interface;

public class Pardal implements Voador, Animal {

    @Override
    public void voar() {
        System.out.println("Voando baixo");
    }

    @Override
    public void movimentar() {
        voar();
    }

    @Override
    public void alimentar() {
        System.out.println("Pardal está se alimentando.");
    }
}
