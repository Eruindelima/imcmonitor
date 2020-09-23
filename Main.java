class Main {
  public static void main(String[] args) throws Exception {

    // TesteSimples teste = new TesteSimples();
    TesteUnitario tu = new TesteUnitario();
    tu.executarAll();

    TelaConsoleMenu tela = new TelaConsoleMenu();
    tela.executar();
    
    System.out.println("\n\nimcmonitor, Fim!");
  }
}