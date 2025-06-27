package codigo.desafio.set.desafio02;

import codigo.desafio.set.desafio01.Carro;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProgramaSet02 {

    public static void main(String args[])
    {
        Set<Carro02> colecao = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            colecao.add(new Carro02(sc.next(), sc.next(), sc.nextInt()));
        }

        for(Carro02 c : colecao)
            System.out.println(c);
    }
}
