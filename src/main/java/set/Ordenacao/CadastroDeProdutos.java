package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroDeProdutos {
    private Set<Produto> produtoSet;

    public CadastroDeProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, double preco, long codigo, int quantidade){
        produtoSet.add(new Produto(nome, preco, codigo, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;

    }

    public static void main(String[] args) {
        CadastroDeProdutos cadastroDeProdutos = new CadastroDeProdutos();

        cadastroDeProdutos.adicionarProduto("Produto 5", 5,1, 5);
        cadastroDeProdutos.adicionarProduto("Produto 0", 20,2, 10);
        cadastroDeProdutos.adicionarProduto("Produto 3", 10,1, 2);
        cadastroDeProdutos.adicionarProduto("Produto 9", 2,9, 2);

        System.out.println(cadastroDeProdutos.produtoSet);

        System.out.println(cadastroDeProdutos.exibirProdutosPorNome());
        System.out.println(cadastroDeProdutos.exibirProdutoPorPreco());

    }
}
