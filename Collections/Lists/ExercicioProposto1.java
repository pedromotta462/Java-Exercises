import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;


/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExercicioProposto1 {

    public static List<Float> adicionaTemperatura(List<Float> temperaturas, List<String> meses){
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
        
        for (int index = 0; index < 6; index++) {
            if (aleatorio == false) {
                System.out.println("Digite a " + (index+1) + "ª media de temperatura do mes de " + meses.get(index) + ":");
                temperaturas.add(Math.round(scan.nextFloat()*100f)/100f);
            }else{
                temperaturas.add(Math.round(random.nextFloat(30.0f)*100f)/100f);
            }
            
        }
        System.out.println("Eis as medias de temperatura: " + temperaturas);
        return temperaturas;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Float> temperaturas = new ArrayList<>();
        List<String> meses = List.of("janeiro", "fevereiro", "marco", "abril", "maio", "junho");

        System.out.println("Crie uma lista, com as 6 medias de temperatura: ");

        temperaturas = adicionaTemperatura(temperaturas, meses);

        Iterator<Float> iterator = temperaturas.iterator();
        float soma = 0f;
        while(iterator.hasNext()){
            float next = iterator.next();
            soma += next;
        }
        float media = Math.round((soma/temperaturas.size())*100f)/100f;
      
        System.out.println("eis a media semestral das temperaturas: " + media);
        System.out.println("temperaturas acima da media:");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > media) {
                System.out.println((i+1) + " - " + meses.get(i) + " temperatura media: " + temperaturas.get(i));                
            }
            
        }
        
    }
}
