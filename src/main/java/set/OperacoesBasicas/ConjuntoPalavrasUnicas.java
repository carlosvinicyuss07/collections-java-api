package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        for (String p : palavrasSet) {
            if (p.equalsIgnoreCase(palavra)) {
                palavraParaRemover = p;
                break;
            }
        }
        palavrasSet.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        for (String p : palavrasSet) {
            if (p.equalsIgnoreCase(palavra)) {
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        System.out.println("*** Lista de Palavras ***");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Peixe");
        conjuntoPalavrasUnicas.adicionarPalavra("Abacaxi");
        conjuntoPalavrasUnicas.adicionarPalavra("Árvore");
        conjuntoPalavrasUnicas.adicionarPalavra("Corinthians");
        conjuntoPalavrasUnicas.adicionarPalavra("Abacaxi");

        System.out.println("*** Lista de Palavras ***");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Abacaxi");

        System.out.println("*** Lista de Palavras ***");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("CORINTHIANS"));
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Barcelona"));

    }
}
