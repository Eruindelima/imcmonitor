class TestAtleta{

  public void testNome() throws Exception{

    Atleta atleta = new Atleta();
    String nome;

    nome = "ABCD";
    atleta.setNome(nome);
    if (!atleta.getNome().equals("ABCD"))
      throw new Exception (" [Erro] falha manipulando IDADE " + nome);
      

    nome = " ";
    atleta.setNome(nome);
    if (!atleta.getNome().equals(" "))
      throw new Exception (" [Erro] falha manipulando IDADE " + nome);
      

    nome = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    atleta.setNome(nome);
    if (!atleta.getNome().equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"))
      throw new Exception (" [Erro] falha manipulando IDADE " + nome);
  }

  public void testIdade() throws Exception {

    Atleta atleta = new Atleta();
    int idade;

    idade = 10;
    atleta.setIdade(idade);
    if (atleta.getIdade() != idade)
      throw new Exception(" [Erro] falha manipulando IDADE " + idade + " esta retornando" + atleta.getIdade());

    idade = 9999;
    atleta.setIdade(idade);
    if (atleta.getIdade() != idade)
      throw new Exception(" [Erro] falha manipulando IDADE " + idade + " esta retornando" + atleta.getIdade());


    idade = -9;
    atleta.setIdade(idade);
    if (atleta.getIdade() != idade)
      throw new Exception(" [Erro] falha manipulando IDADE " + idade + " esta retornando" + atleta.getIdade());

    idade = 0;
    atleta.setIdade(idade);
    if (atleta.getIdade() != idade)
      throw new Exception(" [Erro] falha manipulando IDADE " + idade + " esta retornando" + atleta.getIdade());
  }
}