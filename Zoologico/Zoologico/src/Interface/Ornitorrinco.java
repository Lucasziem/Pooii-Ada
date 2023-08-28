package Interface;

public class Ornitorrinco implements Nadador, Amamentador {

    @Override
    public void alimentar() {
        System.out.println("Ornitorrinco está se alimentando de pequenos animais.");
    }

    @Override
    public void amamentar() {
        System.out.println("Ornitorrinco amamentando seus filhotes");
    }

    @Override
    public void movimentar() {
        nadar();
    }
}
