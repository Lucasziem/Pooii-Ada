import java.util.ArrayList;
import java.util.List;

public class Agrupador<T> {

    private final Sorteador<T> sorteador;

    public Agrupador(List<T> elementos) {
        this.sorteador = new Sorteador<>(elementos);
    }

    public List<Grupo<T>> agrupar(int numeroDeGruposEsperados) {

        List<Grupo<T>> grupos = inicializarGrupos(numeroDeGruposEsperados);

        int indiceDoGrupoAtual = 0;
        while (sorteador.possuiElementos()) {
            T elementoSorteado = sorteador.sortear();
            Grupo<T> grupoAtual = grupos.get(indiceDoGrupoAtual);
            grupoAtual.adicionarNoGrupo(elementoSorteado);
            indiceDoGrupoAtual++;
            if (indiceDoGrupoAtual == numeroDeGruposEsperados) {
                indiceDoGrupoAtual = 0;
            }
        }

        return grupos;
    }

    private List<Grupo<T>> inicializarGrupos(int numeroDeGruposEsperados) {
        List<Grupo<T>> grupos = new ArrayList<>();

        for (int i = 0; i < numeroDeGruposEsperados; i++) {
            grupos.add(new Grupo(i));
        }
        return grupos;
    }
}
