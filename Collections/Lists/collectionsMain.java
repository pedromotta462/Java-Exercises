import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;

//testando lists e alguns de seus metodos

public class collectionsMain{

    public static List<Float> adicionaNotas(List<Float> notasList){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        boolean aleatorio = false,sai;

        do{
            System.out.println("O usuario vai preencher a lista? caso nao, ela sera aleatoria!\ns)sim \nn)nao ");
            String escolha = scan.next().toLowerCase();
            switch (escolha) {
                case "s":
                    aleatorio = false;
                    sai = true;
                    break;
                case "n":
                    aleatorio = true;
                    sai = true;
                    break;
                default:
                    System.out.println("resposta invalida!");
                    sai = false;
                    break;
            }
        }while(sai == false);
        
        for (int index = 0; index < 7; index++) {
            if (aleatorio == false) {
                System.out.println("Digite a " + (index+1) + "ª nota:");
                notasList.add(Math.round(scan.nextFloat()*100f)/100f);
            }else{
                notasList.add(Math.round(random.nextFloat(10.0f)*100f)/100f);
            }
            
        }
        System.out.println("Eis as notas: " + notasList);
        return notasList;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Float> notas = new ArrayList<>();

        System.out.println("Crie uma lista e adicione as 7 notas: ");

        notas = adicionaNotas(notas);

        System.out.println("Exiba a quinta nota: " + notas.get(5-1));
        System.out.println("adicione na lista a nota 8.0 na posicao(index) 4: ");
        notas.add(4, 8.0f);
        System.out.println("nova lista de notas: " + notas);
        System.out.println("Substitua a quinta nota por 6.0:");
        notas.set(4, 6.00f);
        System.out.println("nova lista de notas: " + notas);
        System.out.println("Verifique existe uma nota 5.0 na lista: " + notas.contains(5.0f));
        System.out.println(
        "Exiba a maior e a menor nota, respectivamente, alem de sua posicao:\nmaior: " + 
        Collections.max(notas) +" posicao: " + notas.indexOf(Collections.max(notas)) 
        + "\nMenor: " + Collections.min(notas) + " posicao: " + notas.indexOf(Collections.min(notas))
        );

        float soma = 0f;
        for (int i = 0; i < notas.size(); i++) {
            
            soma += notas.get(i);
        }
        System.out.println("soma dos elementos da lista: " + soma);

        //outra forma de somar os elementos da lista 
        /*
        Iterator<Float> iterator = notas.iterator();
        soma = 0f;
        while(iterator.hasNext()){
            float next = iterator.next();
            soma += next;
        }
        System.out.println("soma2: " + soma);
         */
        float media = Math.round((soma/notas.size())*1000f)/1000f;
        System.out.println("Exiba a media das notas: " + media);
        System.out.println("Remova a nota no index 0 e as notas que forem 0: ");
        notas.remove(0); notas.remove(0f);
        System.out.println("nova lista de notas: " + notas);
        System.out.println("Remova todas as notas menores que 5:");

         
        Iterator<Float> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            float next = iterator1.next();
            if (next<5) iterator1.remove();
        }
        System.out.println("nova lista de notas2: " + notas);

        //outra forma de remover as notas menores que 5 da lista
    /*  List<Float> copiaNotas = new ArrayList<>();
        copiaNotas = notas;
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) < 5f) {
                copiaNotas.remove(notas.get(i));      
            }
        }
        notas = copiaNotas;
        System.out.println("nova lista de notas: " + notas); */

        System.out.println("Apague toda a lista:");
        notas.clear();
        System.out.println("A lista esta fazia? " + notas + " " + notas.isEmpty());



    }
}