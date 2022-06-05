import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
    

/*Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra 'v';
f) Remova todas as cores que não começam com a letra 'v';
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;    */


public class ExercicioProposto1 {
    public static void main(String[] args) {
        System.out.println("Crie uma conjunto contendo as cores do arco-iris! ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("azul-escuro");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");

        //a) Exiba todas as cores o arco-íris uma abaixo da outra;
        System.out.println("Exiba todas as cores o arco-iris uma abaixo da outra: "); 
        for (String cor : coresArcoIris) {
            System.out.println("- " + cor);
        }

        //b) A quantidade de cores que o arco-íris tem;
        System.out.println("\nA quantidade de cores que o arco-iris tem: " + coresArcoIris.size()); 

        //c) Exiba as cores em ordem alfabética;
        System.out.println("\nExiba as cores em ordem alfabetica: "); 
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2 + "\n");
        
        //d) Exiba as cores na ordem inversa da que foi informada;
        System.out.println("Exiba as cores na ordem inversa da que foi informada "); 
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "azul-escuro", "azul", "verde", "amarelo", "laranja", "vermelho")
                );
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList + "\n");

        //e) Exiba todas as cores que começam com a letra 'v';
        System.out.println("Exiba todas as cores que comecam com a letra 'v': ");
        for (String cor: coresArcoIris) {
            if(cor.startsWith("v")){
                System.out.println("- " + cor);
            }
        }

        //f) Remova todas as cores que não começam com a letra 'v';
        System.out.println("\nRemova todas as cores que nao comecam com a letra 'v': ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) {
                iterator2.remove();
            }
        }
        System.out.println(coresArcoIris + "\n");

        //g) Limpe o conjunto;
        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        //h) Confira se o conjunto está vazio;
        System.out.println(
            "Confira se o conjunto esta vazio: " + coresArcoIris + " -> " + coresArcoIris.isEmpty()
            );
    }
}
