package javaCollectio02;

import java.util.HashMap;
import java.util.Map;
import modelCollection.Pessoa;

public class MainMap {

    public static void main(String[] args) {

        Map<String, Pessoa> mapaPessoa = new HashMap<String, Pessoa>();
        System.out.println(mapaPessoa.put("Legal", new Pessoa(1, "TreinaWeb 1")));
        System.out.println(mapaPessoa);
        System.out.println(mapaPessoa.put("Legal", new Pessoa(2, "TreinaWeb 2")));
        System.out.println(mapaPessoa);
        mapaPessoa.put(null, new Pessoa(-1, "TreinaWeb N U L O"));
        System.out.println(mapaPessoa);
        mapaPessoa.put(null, new Pessoa(-2, "TreinaWeb N U L O {2}"));
        System.out.println(mapaPessoa);
        mapaPessoa.put("Teste", null);
        System.out.println(mapaPessoa);
    }
}
