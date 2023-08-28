package Interface;

public interface Animal {

    default void alimentar() {
        System.out.println("Alimentando");
    }

    void movimentar();
}
