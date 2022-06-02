public class testandojava {

    protected static float divide(int a, float b){
        return a/b;
    }

    protected static void antigomain(){
        int a;
        float b;  
        a=5;
        b=3.14f;
        final int JI = 10;
        //comentario é assim
        char k = 'b';
        String v = "pedro motta";
        boolean n = true;
        float I = a*b;
        System.out.println("numero 1: " + I + " numero 2: " + JI + "\n este e o char: " + k); 
        System.out.println(v + " " + n);
        System.out.print("funcao: " + divide(a,b));
    }
    
     public static void main(String[] args) {
        // Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercicio emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
        
        System.out.println("\n\n");
        antigomain();
     }
}