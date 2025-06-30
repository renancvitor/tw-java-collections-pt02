package javaCollectio02;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import modelCollection.Pessoa;

public class MainMap {

    public static void main(String[] args) {

        // Map<String, Pessoa> mapaPessoa = new HashMap<String, Pessoa>(); // Não garante ordem, "mais leve"
        Map<String, Pessoa> mapaPessoa = new LinkedHashMap<String, Pessoa>(16, 0.75f, true); // Garante ordem, "mais pesado"
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
        Pessoa p = mapaPessoa.get("Legal");
        System.out.println(p);
        System.out.println(mapaPessoa);
    }
}
