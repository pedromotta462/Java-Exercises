/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jack, idade: 12, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jonny, idade: 18, cor: amarelo
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ordenacaodelistas {
    public static void main(String[] args) {

        List<Gato> myCats = new ArrayList<>(){{
            add(new Gato("Jack", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jonny", 18, "amarelo"));
        }};
        myCats.sort(Comparator.comparing(Gato::getNome));


        System.out.println("\n--\tOrdem de Insercao\t---\n");
        System.out.println(myCats);

        System.out.println("\n--\tOrdem aleatoria\t---\n");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("\n--\tOrdem Natural (Nome)\t---\n");
        Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("\n--\tOrdem Idade\t---\n");
//        Collections.sort(myCats, new ComparatorAge());
        myCats.sort(new ComparatorAge());
        System.out.println(myCats);

        System.out.println("\n--\tOrdem cor\t---\n");
//        Collections.sort(myCats, new ComparatorCollor());
        myCats.sort(new ComparatorCollor());
        System.out.println(myCats);

        System.out.println("\n--\tOrdem Nome/Cor/Idade\t---\n");
//        Collections.sort(myCats, new ComparatorNameCollorAge());
        myCats.sort(new ComparatorNameCollorAge());
        System.out.println(myCats);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorAge implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCollor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNameCollorAge implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}