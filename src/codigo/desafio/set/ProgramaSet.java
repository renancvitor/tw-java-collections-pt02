package codigo.desafio.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramaSet {
    public static void main(String args[])
    {
        Set<Carro> colecao = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            colecao.add(new Carro(sc.next(), sc.next()));
        }

        System.out.println(colecao.size());
    }
}
