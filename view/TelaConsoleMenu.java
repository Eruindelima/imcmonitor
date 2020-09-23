import java.util.Scanner;
import java.util.ArrayList;


class TelaConsoleMenu {

  Scanner teclado = new Scanner(System.in);
  ArrayList<Atleta> matriculas = new ArrayList<Atleta>();

  public void executar() {
    
    boolean sair = false;
    int op;
    

    while(!sair){

      System.out.println("\nMENU *****");
      System.out.println("1 [+] ATLETA");
      System.out.println("11 [>] LISTAGEM");
      System.out.println("0 [X] SAIR");
      System.out.println("--------------------");
      System.out.println("opcao:_");
      op = teclado.nextInt();

      if(op == 1){
        this.incluirNovoAtleta();
      }

      if(op == 11){
        this.listarAtletas();
      }

      if(op == 0){
        sair = true;
      }
    }

  System.out.println("fim, telaconsolemenu");
  }

  private void incluirNovoAtleta(){
    System.out.println("Novo Atleta");

    System.out.println("Nome:_");
    String nome = teclado.next();


    System.out.println("Idade:_");
    int idade = teclado.nextInt();

    Atleta novo = new Atleta();
    novo.setNome(nome);
    novo.setIdade(idade);

    //matriculas = novo;
    matriculas.add(novo);
  }

    private void listarAtletas(){

    System.out.println("\nListagem de Atletas:");

    if(matriculas.size() > 0){
    int cont = 1;
    for(Atleta atemp : matriculas){
      System.out.println(cont++ + ") " + atemp.getNome() + " (" + atemp.getIdade() + ")");
      }
    } else {
      System.out.println("Nenhum atleta matriculado!");
    }
  }
}