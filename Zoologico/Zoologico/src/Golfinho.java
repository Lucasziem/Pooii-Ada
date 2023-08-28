public class Golfinho extends Mamifero {

    @Override
    public void alimentar() {
        System.out.println("Golfinho está se alimentando de peixes");
    }

    @Override
    public void movimentar() {
        System.out.println("Golfinho está nadando graciosamente.");
    }

    @Override
    public void amamentar() {
        System.out.println("Golfinho amamenta seus filhotes.");
    }

    public void pular() {
        System.out.println("Golfinho pula para fora da água.");
    }
}