public class Tilapia extends Aquatico {

    @Override
    public void alimentar() {
        System.out.println("Tilapia se alimentando.");
    }

    @Override
    public void movimentar() {
        System.out.println("Tilapia se movimentando na água.");
    }

    @Override
    public void nadar() {
        System.out.println("Tilapia está nadando.");
    }
}