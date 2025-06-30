package codigo.desafio.hashtables;

import java.util.*;
import java.util.function.*;

public class Desafio
{
    public static void main(String args[])
    {
        Hashtable<Integer, Produto> estoque = new Hashtable<Integer, Produto>();

        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(sc.hasNext()){
            estoque.put(++count, new Produto(sc.next(), sc.nextDouble()));
        }




        //Implemente o lambda nas variáveis funcaoAlterarEstoque e exibirEstoque
        BiFunction<Integer, Produto, Produto> funcaoAlterarEstoque = (chave, produto) -> {
            produto.setPreco(produto.getPreco() + 15);
            return produto;
        };

        BiConsumer<Integer, Produto> exibirEstoque =
                (chave, produto) -> {
                    System.out.println(
                            "[" + chave + "] " + produto.getNome() + " - "
                                    + "R$" + String.format("%.2f", produto.getPreco())
                    );
                };
        /*
        [1] celular - R$1014.99
        [2] computador - R$2514.90
        [3] tv - R$1314.50
        [4] drive - R$164.50
         */

                estoque.replaceAll(funcaoAlterarEstoque);
        estoque.forEach(exibirEstoque);
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome()
    {
        return this.nome;
    }

    public double getPreco()
    {
        return this.preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }
}
