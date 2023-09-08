import java.util.Scanner;

public class Main {

  //TODO: CRIE UM ALGORITMO QUE FAÇA A GESTÃO DE UMA FESTA x
  // SE O USUÁRIO TIVER 18+ ELE TA LIBERADO, SE NÃO ELE NAO ENTRA. x
  // CRIE OUTRO CENÁRIO, JOVENS DE 14 ANOS PODEM ENTRAR ACOMPANHADO DOS PAIS

  public static void main(String[] args) {
    int idade;
    String nome;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Como se chama?");
    nome = scanner.next();

    System.out.println("Digite sua idade");
    idade = scanner.nextInt();

    if (idade >= 18) {
      System.out.println("Pode entrar " + nome);

    } else if (idade >= 14) {
      System.out.println("Entra com responsavel, " + nome);

    } else {
      System.out.println("Espera fazer 18, " + nome);
    }
  }

}
// && é o operador E
// || é o operador OU