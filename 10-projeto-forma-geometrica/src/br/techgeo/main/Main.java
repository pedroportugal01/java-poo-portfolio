package br.techgeo.main;

import br.techgeo.forma.Cilindro;
import br.techgeo.forma.Circulo;
import br.techgeo.forma.Forma;
import br.techgeo.forma.Volume;
import br.techgeo.ponto.Ponto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> lista = new LinkedList<>();
        lista.add(new Circulo(2, new Ponto(2, 2)));
        lista.add(new Cilindro(3, 3, new Ponto(3, 3)));
        lista.add(new Circulo(2, new Ponto(2, 2)));
        lista.add(new Cilindro(3, 3, new Ponto(3, 3)));
        imprimir(lista);
    }

    private static void imprimir(List<Forma> lista) {
        for(Forma forma : lista) {
            System.out.println(forma);
            System.out.println("Área: " + forma.calcularArea());
            if(forma instanceof Volume) {
                System.out.println("Volume: " + ((Volume) forma).calcularVolume());
            }
            System.out.println();
        }
    }


}