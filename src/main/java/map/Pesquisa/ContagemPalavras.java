package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        } else {
            System.out.println("A lista de palavras está vazia");
        }
    }

    public void exibirContagemPalavras() {
        if (!palavrasMap.isEmpty()) {
            System.out.println(palavrasMap);
        } else {
            System.out.println("A lista de palavras está vazia");
        }
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorFrequencia = Integer.MIN_VALUE;
        if (!palavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
                if (entry.getValue() > maiorFrequencia) {
                    maiorFrequencia = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        contagemLinguagens.exibirContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        contagemLinguagens.exibirContagemPalavras();

        contagemLinguagens.removerPalavra("JavaScript");
        contagemLinguagens.removerPalavra("Go");

        contagemLinguagens.exibirContagemPalavras();

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
