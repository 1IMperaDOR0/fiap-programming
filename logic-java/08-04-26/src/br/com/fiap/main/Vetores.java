package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Collections;

public class Vetores {
    public static void main(String[] args) {
        // Criando e instanciando objetos da classe ArrayList
        ArrayList<Integer> numeros = new ArrayList();
        ArrayList<String> carros = new ArrayList();

        // Adicionando elementos no ArrayList com o .add()
        numeros.add(10);
        numeros.add(20);
        numeros.add(1);
        numeros.add(2);
        carros.add("BYD");
        carros.add("Mercedes");
        carros.add("Dodge");

        System.out.println(numeros.size());
        System.out.println(carros.size());

        // Obtendo um valor do ArrayList com o .get()
        System.out.println(carros.get(0));

        // Substituindo um elemento em uma posição específica com o .set()
        carros.set(1, "MCLaren");

        System.out.println(carros.size());
        System.out.println(carros.get(1));

        // Removendo um elemento com o .remove()
        carros.remove(2);
        System.out.println(carros.size());

        // Removendo todos os elementos com o .clear()
        carros.clear();
        System.out.println(carros.size());

        // Percorrendo o ArrayList com um laço de repetição for
        for(int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }

        System.out.println();

        // Ordenando um ArrayList com o .sort() da classe Collections
        Collections.sort(numeros);

        // Percorrendo o ArrayList com o for-each
        for(Integer i: numeros) {
            System.out.print(i + " ");
        }
    }
}
