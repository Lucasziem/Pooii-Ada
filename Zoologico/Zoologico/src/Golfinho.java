public class Golfinho extends Aquatico {

    @Override
    public void alimentar() {
        System.out.println("Golfinho está se alimentando de peixes");
    }

    @Override
    public void movimentar() {
        System.out.println("Golfinho está nadando graciosamente.");
    }

    @Override
    public void nadar() {
        System.out.println("Golfinho nadando com agilidade.");
    }

    public void pular() {
        System.out.println("Golfinho pula para fora da água.");
    }
}