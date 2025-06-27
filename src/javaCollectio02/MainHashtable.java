package javaCollectio02;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import modelCollection.Pessoa;

public class MainHashtable {

    public static void main(String[] args) {
        Hashtable<String,Pessoa> tabelaPessoas = new Hashtable<String, Pessoa>(20, 0.6f);
        tabelaPessoas.put("Legal", new Pessoa(1, "TreinaWeb 1"));
        System.out.println(tabelaPessoas);
        tabelaPessoas.put("Chato", new Pessoa(2, "TreinaWeb 2"));
        System.out.println(tabelaPessoas);
        System.out.println(tabelaPessoas.get("Legal"));
        tabelaPessoas.put("Legal", new Pessoa(3, "TreinaWeb 3"));
        System.out.println(tabelaPessoas.get("Legal"));
        tabelaPessoas.put("Bla", new Pessoa(4, "TreinaWeb 4"));

        // Iteração
        // Fail-fast Iterator
//        Iterator<String> iteratorChaves = tabelaPessoas.keySet().iterator();
//        tabelaPessoas.remove("Legal");
//        while (iteratorChaves.hasNext()) {
//            String chave = iteratorChaves.next();
//            System.out.println(" - " + tabelaPessoas.get(chave).toString());
//        }
        // Non Fail-fast Iterator
        Enumeration<String> chaves = tabelaPessoas.keys();
        tabelaPessoas.remove("Legal");
        while (chaves.hasMoreElements()) {
            String chave = chaves.nextElement();
            System.out.println(" - " + tabelaPessoas.get(chave).toString());
        }

//        Pessoa p = null;
//        if (tabelaPessoas.containsKey("Legal")) {
//            p = tabelaPessoas.get("Legal");
//        } else {
//            p = new Pessoa(-1, "Não existe");
//        }
//        System.out.println(p);
        Pessoa p = tabelaPessoas.getOrDefault("Legal", new Pessoa(-1, "Não existe"));
        System.out.println(p);

//        if (!tabelaPessoas.containsKey("Legal")) {
//            tabelaPessoas.put("Legal", new Pessoa(1, "TreinaWeb 1"));
//        }
        tabelaPessoas.put("Legal", new Pessoa(1, "TreinaWeb 1"));
        System.out.println(tabelaPessoas);

        tabelaPessoas.forEach((chave, valor) -> {
            System.out.println(String.format("[%s] %s", chave, valor.toString()));
        });
    }
}
