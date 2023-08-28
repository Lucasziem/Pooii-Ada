public class Morcego extends Mamifero {

    @Override
    public void alimentar() {
        System.out.println("Morcego se alimentando de insetos.");
    }

    @Override
    public void movimentar() {
        System.out.println("Morcego voando no ar noturno.");
    }

    @Override
    public void amamentar() {
        System.out.println("Morcego amamentando seu filhote.");
    }
}
public class Morcego extends Aves {

    @Override
    public void voar() {
        System.out.println("Morcego voa pela caverna");
    }

    public void sonar() {
        System.out.println("Morcego usa seu sonar para se localizar.");
    }
}