package Interface;

public class Golfinho implements Nadador, Amamentador {

    @Override
    public void movimentar() {
        nadar();
    }

        @Override
        public void alimentar() {
            System.out.println("Golfinho está se alimentando de peixes");
        }

        @Override
        public void amamentar() {
            System.out.println("Golfinho amamenta seus filhotes.");
        }

        public void pular() {
            System.out.println("Golfinho pula para fora da água.");
        }
    }

}
