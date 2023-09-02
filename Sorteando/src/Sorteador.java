//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteador<T> {
    private final List<T> elementos;

    public Sorteador(List<T> elementos) {
        this.elementos = elementos;
    }

    public T sortear() {
        if (this.elementos.isEmpty()) {
            return null;
        } else {
            int indiceSorteado = ThreadLocalRandom.current().nextInt(this.elementos.size());
            T elementoSorteado = this.elementos.remove(indiceSorteado);
            return elementoSorteado;
        }
    }

    public List<Grupo<T>> agrupar(int numeroDeGruposEsperados) {
        List<Grupo<T>> grupos = inicializarGrupos(numeroDeGruposEsperados);
        int indiceDoGrupoAtual = 0;

        while(this.possuiElementos()) {
            T elementoSorteado = this.sortear();
            Grupo<T> grupoAtual = (Grupo)grupos.get(indiceDoGrupoAtual);
            grupoAtual.adicionarNoGrupo(elementoSorteado);
            ++indiceDoGrupoAtual;
            if (indiceDoGrupoAtual == numeroDeGruposEsperados) {
                indiceDoGrupoAtual = 0;
            }
        }

        return grupos;
    }

    private boolean possuiElementos() {
        return !this.elementos.isEmpty();
    }

    private static <T> List<Grupo<T>> inicializarGrupos(int numeroDeGruposEsperados) {
        List<Grupo<T>> grupos = new ArrayList();

        for(int i = 0; i < numeroDeGruposEsperados; ++i) {
            grupos.add(new Grupo(i));
        }

        return grupos;
    }
}
