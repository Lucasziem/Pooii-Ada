public class Pardal extends Aves {

    @Override
    public void alimentar() {
        System.out.println("Pardal está se alimentando.");
    }

    @Override
    public void movimentar() {
        System.out.println("Pardal caminha de um lugar para outro.");
    }

    @Override
    public void voar() {
        System.out.println("Pardal voando no céu.");
    }
}