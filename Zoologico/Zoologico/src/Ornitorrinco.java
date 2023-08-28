public class Ornitorrinco extends Aquatico {

    @Override
    public void alimentar() {
        System.out.println("Ornitorrinco está se alimentando de pequenos animais.");
    }

    @Override
    public void movimentar() {
        System.out.println("Ornitorrinco nadando e andando na terra.");
    }

    @Override
    public void nadar() {
        System.out.println("Ornitorrinco nadando em rios e riachos.");
    }
}
public class Ornitorrinco extends Mamifero {
    @Override
    public void amamentar() {
        System.out.println("Ornitorrinco amamenta seu filhote.");
    }
}

