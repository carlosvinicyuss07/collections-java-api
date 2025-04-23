package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : itemList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.printf("O valor total do carrinho é: R$%.2f\n", carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.adicionarItem("Bola", 29.90, 3);
        carrinhoDeCompras.adicionarItem("Caneta", 1.00, 5);
        carrinhoDeCompras.adicionarItem("Caixa de Bombom", 12.50, 1);
        carrinhoDeCompras.adicionarItem("Leite em pó", 4.80, 2);
        System.out.printf("O valor total do carrinho é: R$%.2f\n", carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();
    }
}
