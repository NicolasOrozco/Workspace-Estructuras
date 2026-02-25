package Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MetodosCollections {

    public static void main(String[] args ) { 

        LinkedList<String> cosas = new LinkedList<>();

        cosas.add("carro");
        cosas.add("arcangel");
        cosas.add("yoyo");

        System.out.println(cosas);

        Collections.sort(cosas);

        System.out.println(cosas);

        Collections.reverse(cosas);

        System.out.println(cosas);

        Collections.shuffle(cosas);

        System.out.println(cosas);
    }

}
