package sets02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import modelCollection.Pessoa;

public class MainSet {

    public static void main(String[] args) {

        Set<Pessoa> pessoas = new LinkedHashSet<Pessoa>();
        // HashSet não garante ordem -> LinkedHashSet garante ordem
        System.out.println(pessoas.add(new Pessoa(1, "TreinaWeb 01")));
        System.out.println(pessoas);
        System.out.println(pessoas.add(new Pessoa(2, "TreinaWeb 02")));
        System.out.println(pessoas.add(new Pessoa(3, "TreinaWeb 03")));
        System.out.println(pessoas.add(new Pessoa(4, "TreinaWeb 04")));
        System.out.println(pessoas.add(new Pessoa(5, "TreinaWeb 05")));
        System.out.println(pessoas.add(new Pessoa(6, "TreinaWeb 06")));
        System.out.println(pessoas.add(new Pessoa(7, "TreinaWeb 07")));
        System.out.println(pessoas.add(new Pessoa(8, "TreinaWeb 08")));
        System.out.println(pessoas.add(new Pessoa(9, "TreinaWeb 09")));
        System.out.println(pessoas.add(new Pessoa(10, "TreinaWeb 10")));
        System.out.println(pessoas.add(new Pessoa(11, "TreinaWeb 11")));
        System.out.println(pessoas.add(new Pessoa(12, "TreinaWeb 12")));
        System.out.println(pessoas.add(new Pessoa(13, "TreinaWeb 13")));
        System.out.println(pessoas.add(new Pessoa(14, "TreinaWeb 14")));
        System.out.println(pessoas.add(new Pessoa(15, "TreinaWeb 15")));
        System.out.println(pessoas.add(new Pessoa(16, "TreinaWeb 16")));
        System.out.println(pessoas.add(new Pessoa(17, "TreinaWeb 17")));
        System.out.println(pessoas.add(new Pessoa(18, "TreinaWeb 18")));
        System.out.println(pessoas);
    }
}
