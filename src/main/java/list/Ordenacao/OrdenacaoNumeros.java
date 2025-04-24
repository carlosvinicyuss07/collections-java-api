package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosOrdemAscendente = new ArrayList<>(listaNumeros);
        Collections.sort(numerosOrdemAscendente);
        return numerosOrdemAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosOrdemDescendente = new ArrayList<>(listaNumeros);
        numerosOrdemDescendente.sort(Collections.reverseOrder());
        return numerosOrdemDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(33);
        ordenacaoNumeros.adicionarNumero(39);
        ordenacaoNumeros.adicionarNumero(-15);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(73);
        System.out.println(ordenacaoNumeros.listaNumeros);

        System.out.print("Ordem Ascendente: ");
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.print("Ordem Descendente: ");
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
