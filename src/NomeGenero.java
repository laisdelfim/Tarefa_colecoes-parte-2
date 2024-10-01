import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NomeGenero {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String resposta = "";

        Set<Pessoa> pessoasM = new TreeSet<>();
        Set<Pessoa> pessoasF = new TreeSet<>();

        do {
            System.out.println("Digite o nome e o genero com espaçamento entre eles");
            String resultado = sc.nextLine();

            String[] grupo = resultado.split(" ");
            if (grupo.length < 2) {
                System.out.println("resposta inválida, digite o nome seguino do genero com espaço entre eles");
                continue;
            }

            String nome = grupo[0];
            String sexo = grupo[1];

            if (sexo.equalsIgnoreCase("masculino")) {
                Pessoa pessoa = new Pessoa(nome, sexo);
                pessoasM.add(pessoa);
            } else if (sexo.equalsIgnoreCase("feminino")) {
                Pessoa pessoa = new Pessoa(nome, sexo);
                pessoasF.add(pessoa);
            } else {
                System.out.println("Inválido.");
            }

            System.out.println("Adicionar mais pessoas? ");
            resposta = sc.nextLine();
        } while (resposta.equalsIgnoreCase("sim"));

        for (Pessoa pessoa : pessoasM) {
            System.out.println("Masculino: " + pessoa.getNome());
        }

        for (Pessoa pessoa : pessoasF) {
            System.out.println("Feminino: " + pessoa.getNome());
        }

        sc.close();
    }
}
