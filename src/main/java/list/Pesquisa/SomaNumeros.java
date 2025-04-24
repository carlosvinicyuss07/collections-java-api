package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!listaNumeros.isEmpty()) {
            for (Integer num : listaNumeros) {
                soma += num;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNum = 0;
        if (!listaNumeros.isEmpty()) {
            for (int i = 0; i < listaNumeros.size(); i++) {
                if (i == 0) {
                    maiorNum = listaNumeros.get(i);
                } else {
                    if (listaNumeros.get(i) > maiorNum) {
                        maiorNum = listaNumeros.get(i);
                    }
                }
            }
        }
        return maiorNum;
    }

    public int encontrarMenorNumero() {
        int menorNum = 0;
        if (!listaNumeros.isEmpty()) {
            for (int i = 0; i < listaNumeros.size(); i++) {
                if (i == 0) {
                    menorNum = listaNumeros.get(i);
                } else {
                    if (listaNumeros.get(i) < menorNum) {
                        menorNum = listaNumeros.get(i);
                    }
                }
            }
        }
        return menorNum;
    }


    public List<Integer> exibirNumeros() {
        return listaNumeros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(-7);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(14);
        somaNumeros.adicionarNumero(-9);

        System.out.println(somaNumeros.exibirNumeros());
        System.out.println("=======================");
        System.out.println(somaNumeros.calcularSoma());
        System.out.println("=======================");
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println("=======================");
        System.out.println(somaNumeros.encontrarMenorNumero());
    }
}
