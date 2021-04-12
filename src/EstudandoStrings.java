public class EstudandoStrings {

    // declaração das variáveis (como atributo da classe)
    String primeiroNome01;
    String segundoNome01;
    String ultimoNome01;

    String primeiroNome02;
    String segundoNome02;
    String ultimoNome02;

    String primeiroNome03;
    String segundoNome03;
    String ultimoNome03;

    /*
        Construtor
     */
    public EstudandoStrings() {
        //instanciando os objetos de Strings e passando valor ao objeto que a variável controla
        this.primeiroNome01 = new String("Caique");
        this.segundoNome01 = new String("Silva");
        this.ultimoNome01 = new String("Porto");

        this.primeiroNome02 = new String("caique");
        this.segundoNome02 = new String("silva");
        this.ultimoNome02 = new String("porto");

        // Apenas passando valor para as variáveis
        this.primeiroNome03 = "Caique";
        this.segundoNome03 = "Silva";
        this.ultimoNome03 = "Porto";
    }

    public void comparacaoErrada(String nome1, String nome2) {
        if (nome1 == nome2) {
            // se o conteudo das strings forem o mesmo, mas a forma de declaracão for diferente nunca ira cai aqui
            // exemplo: nome1 foi declarada , teve o objeto de sreing criado e passando valor, já
            //          nome2 foi apenas declarada e passado valor
            System.out.println("sim , sao iguais");
        } else {
            System.out.println("Nao são iguais embora...conteudo nome1=" + nome1 + " e conteudo nome2=" + nome2);
        }
    }

    // Eh case sensitive , ou seja, Caique e caique são considerados diferentes
    public void comparacaoCorreta01(String nome1, String nome2) {
        if (nome1.equals(nome2)) {
            System.out.println("sim , sao iguais");
        } else {
            System.out.println("Nao são iguais embora...conteudo nome1=" + nome1 + " e conteudo nome2=" + nome2);
        }
    }

    // Não eh case sensitive , ou seja, Caique e caique são considerados iguais
    public void comparacaoCorreta02(String nome1, String nome2) {
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("sim , sao iguais");
        } else {
            System.out.println("Nao são iguais embora...conteudo nome1=" + nome1 + " e conteudo nome2=" + nome2);
        }
    }

    public String concatenarString (String nome, String sobreNome,String ultimoNome){
        String nomeCompleto = nome.concat(" ").concat(sobreNome).concat(" ").concat(ultimoNome);
        return nomeCompleto;
    }

    // palavra ou letra
    public int encontrarArgumentoDentroDaString(String argumentoPesquisa, String stringEmQuestao){
        int posicao = stringEmQuestao.indexOf(argumentoPesquisa);

        if (posicao == -1) {
            // Não encontrou
            System.out.println("Não encontrou...");

        } else {
            // Encontrou
            System.out.println("Encontrou...começa no indice: "+ posicao +" e tamanho de: "+ argumentoPesquisa.length());

        }

        return posicao;
    }

    /*
        getters and setters
     */

    public String getPrimeiroNome01() {
        return primeiroNome01;
    }

    public void setPrimeiroNome01(String primeiroNome01) {
        this.primeiroNome01 = primeiroNome01;
    }

    public String getSegundoNome01() {
        return segundoNome01;
    }

    public void setSegundoNome01(String segundoNome01) {
        this.segundoNome01 = segundoNome01;
    }

    public String getUltimoNome01() {
        return ultimoNome01;
    }

    public void setUltimoNome01(String ultimoNome01) {
        this.ultimoNome01 = ultimoNome01;
    }

    public String getPrimeiroNome02() {
        return primeiroNome02;
    }

    public void setPrimeiroNome02(String primeiroNome02) {
        this.primeiroNome02 = primeiroNome02;
    }

    public String getSegundoNome02() {
        return segundoNome02;
    }

    public void setSegundoNome02(String segundoNome02) {
        this.segundoNome02 = segundoNome02;
    }

    public String getUltimoNome02() {
        return ultimoNome02;
    }

    public void setUltimoNome02(String ultimoNome02) {
        this.ultimoNome02 = ultimoNome02;
    }

    public String getPrimeiroNome03() {
        return primeiroNome03;
    }

    public void setPrimeiroNome03(String primeiroNome03) {
        this.primeiroNome03 = primeiroNome03;
    }

    public String getSegundoNome03() {
        return segundoNome03;
    }

    public void setSegundoNome03(String segundoNome03) {
        this.segundoNome03 = segundoNome03;
    }

    public String getUltimoNome03() {
        return ultimoNome03;
    }

    public void setUltimoNome03(String ultimoNome03) {
        this.ultimoNome03 = ultimoNome03;
    }
}
