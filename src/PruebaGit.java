import java.util.ArrayList;
import java.util.List;

public class PruebaGit {
    public static void main(String[] args) {
        List<String> lista = List.of("perro", "gato", "leon");
        System.out.println(lista);
        List<String> listaNueva = new ArrayList<String>();
        for(String s: lista){
            listaNueva.add(s);
        }
        listaNueva.add("pato");
        System.out.println(listaNueva);
    }
}