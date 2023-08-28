package Interface;

public class Tilapia implements Nadador {

    @Override
    public void alimentar() {
        System.out.println("Tilapia se alimentando.");
    }

    @Override
    public void movimentar() {
        nadar();
    }
}