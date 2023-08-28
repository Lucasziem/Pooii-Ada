public class Vaca extends Mamifero {

    @Override
    public void alimentar() {
        System.out.println("Vaca está se alimentando de pasto.");
    }

    @Override
    public void movimentar() {
        System.out.println("Vaca está caminhando pelo campo.");
    }

    @Override
    public void amamentar() {
        System.out.println("Vaca amamentando seu filhote.");
    }
}