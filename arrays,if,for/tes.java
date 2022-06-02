import java.util.Arrays;
import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,quant;
        System.out.println("Digite um numero: ");
        a = scan.nextInt();
        System.out.println("Digite outro numero: ");
        b = scan.nextInt();

        System.out.println("soma: " + (a+b));

        System.out.println("digite quantos números vc quer somar:");
        quant = scan.nextInt();
        System.out.println(" ");
        int [] soma = new int[quant];
        for (int i=0; i<quant; i++) {
            System.out.println("Digite um numero: ");
            soma[i] = scan.nextInt();
        }

        System.out.println("eis a soma do array: " + Arrays.stream(soma).sum());

        if (Arrays.stream(soma).sum() >= 0) {
            System.out.println("A soma nao e negativa!");            
        }else{
            System.out.println("A soma eh negativa");
        }

    }
}
