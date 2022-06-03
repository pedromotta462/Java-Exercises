import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class ExercicioProposto2 {

    public static int veredicto(List<String> perguntas,int guitylevel, Scanner scan){

        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println(perguntas.get(i));
            String res = scan.next().toLowerCase();
            switch (res) {
                case "s":
                    guitylevel++;
                    break;
                case "n":
                    break;
                default:
                    System.out.println("Resposta invalida");
                    i--;
                    break;
            }

        }
        return guitylevel;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        List<Float> respostas = new ArrayList<>();
        List<String> perguntas = List.of(
            "Telefonou para a vitima?", "Esteve no local do crime?", "Mora perto da vitima?",
             "Devia para a vitima?", "Ja trabalhou com a vitima?"
        );
        int guitylevel = 0;
        guitylevel = veredicto( perguntas, guitylevel, scan);

        switch (guitylevel) {
            case 0:
            case 1:
                System.out.println("Voce eh inocente!");
                break;
            case 2:
                System.out.println("Voce eh Suspeita!");
                break;
            case 3:
            case 4:
                System.out.println("Voce eh Cumplice!!");
                break;
            case 5:
                System.out.println("Voce eh Assassina!!!");
                break;
        }
        
    }
}
