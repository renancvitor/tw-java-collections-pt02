package codigo.desafio.map;

import com.sun.source.tree.IfTree;

import java.util.*;
import java.util.function.*;

public class DesafioMap {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Produto> estoque = new TreeMap<>((n1, n2) -> {
            boolean n1Impar = n1 % 2 != 0;
            boolean n2Impar = n2 % 2 != 0;

            if (n1Impar && n2Impar) {
                return Integer.compare(n2, n1); // Ímpares decrescente
            } else if (!n1Impar && !n2Impar) {
                return Integer.compare(n1, n2); // Pares crescente
            } else if (n1Impar) {
                return -1; // Ímpar antes de par
            } else {
                return 1;  // Par depois de ímpar
            }
        });

        int entradas = 6; // ou um valor lido do usuário
        for (int i = 0; i < entradas; i++) {
            int id = sc.nextInt();
            String nome = sc.next();
            double preco = sc.nextDouble();
            estoque.put(id, new Produto(nome, preco));
        }

        estoque.forEach((chave, valor) -> System.out.println(String.format("%d=%s", chave, valor)));
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return String.format("%s - R$%5.2f", nome, preco);
    }
}
