package javaCollectio02;

import java.util.Hashtable;
import modelCollection.Pessoa;

public class MainHashtable {

    public static void main(String[] args) {
        Hashtable<String,Pessoa> tabelaPessoas = new Hashtable<String, Pessoa>();
        tabelaPessoas.put("Legal", new Pessoa(1, "TreinaWeb 1"));
        System.out.println(tabelaPessoas);
        tabelaPessoas.put("Chato", new Pessoa(2, "TreinaWeb 2"));
        System.out.println(tabelaPessoas);
        System.out.println(tabelaPessoas.get("Legal"));
        tabelaPessoas.put("Legal", new Pessoa(3, "TreinaWeb 3"));
        System.out.println(tabelaPessoas.get("Legal"));
    }
}
