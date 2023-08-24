package com.ada.pooii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {

    public static void main(String[] args) {

        List<String> listaStrings = new ArrayList<>(List.of("z", "a", "f"));
        listaStrings.add("c");

        Collections.sort(listaStrings);

        System.out.println(listaStrings);
    }
}
