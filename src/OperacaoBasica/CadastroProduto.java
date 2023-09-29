package OperacaoBasica;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //atributo

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet); //usado para deixar organizado, em vez do collection
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtoPorPreco= new TreeSet<>();
        produtoSet.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProduto.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProduto.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProduto.adicionarProduto(4L, "Teclado", 50d, 15);

        System.out.println(cadastroProduto.produtoSet);

        System.out.println(cadastroProduto.exibirProdutoPorNome());

        System.out.println(cadastroProduto.exibirProdutoPorPreco());
    }
}

