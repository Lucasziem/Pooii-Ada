import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteador<T> {

    private final List<T> elementos;

    public Sorteador(List<T> elementos) {
        this.elementos = elementos;
    }

    public T sortear() {
        if (elementos.isEmpty()) {
            return null;
        }
        int indiceSorteado = ThreadLocalRandom.current().nextInt(elementos.size());
        T elementoSorteado = elementos.remove(indiceSorteado);
        return elementoSorteado;
    }

    public boolean possuiElementos() {
        return !elementos.isEmpty();
    }
}
