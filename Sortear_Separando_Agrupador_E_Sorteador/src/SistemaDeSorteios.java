import java.util.ArrayList;
import java.util.List;

public class SistemaDeSorteios {

    public static void main(String[] args) {
        List<String> elementos  = new ArrayList<>();
        elementos.add("banana");
        elementos.add("maçã");
        elementos.add("abacate");
        elementos.add("tomate");
        elementos.add("ameixa");
        elementos.add("melancia");
        elementos.add("fruta do conde");
        elementos.add("mirtilo");
        Agrupador<String> agrupador = new Agrupador<>(elementos);
        List<Grupo<String>> grupos = agrupador.agrupar(3);
        System.out.println(grupos);

        List<Integer> inteiros  = new ArrayList<>();
        inteiros.add(1);
        inteiros.add(22);
        inteiros.add(45567);
        inteiros.add(777);
        inteiros.add(222);
        inteiros.add(77909);
        inteiros.add(1235);
        inteiros.add(42);
        Agrupador<Integer> agrupadorDeInteiros = new Agrupador<>(inteiros);
        List<Grupo<Integer>> gruposDeInteiros = agrupadorDeInteiros.agrupar(4);
        System.out.println(gruposDeInteiros);

    }
}
