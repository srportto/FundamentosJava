import java.util.ArrayList;
import java.util.List;

// Classe principal que possui o metodo main para explorar os fundamentos do java
public class App {

    public static void main(String[] args) {
        try {
            //------------------------------------------------------------------*
            // Trabalhando com tipos primitivos
            //------------------------------------------------------------------*
            EstudandoTiposVariaveisPrimitivos primitivos = new EstudandoTiposVariaveisPrimitivos();
            System.out.println(primitivos.toString());

            // casting ou conversão de valores
            System.out.println(primitivos.castingIntPraShort(5000));    //risco de perder informacao na conversao int > short
            System.out.println(primitivos.castingDoublePraInt(50.33));   //perde a informação da parte fracionada

            EstudandoTiposVariaveisReferencias referencias = new EstudandoTiposVariaveisReferencias();
            System.out.println(referencias.toString());

            System.out.println("\n");       //somente para pular linha na sysout

            //------------------------------------------------------------------*
            //Estruturas de repetição
            //------------------------------------------------------------------*
            EstudandoEstruturasDeRepeticao estruturaFor = new EstudandoEstruturasDeRepeticao("for");
            estruturaFor.repetir();
            System.out.println("\n");       //somente para pular linha na sysout

            EstudandoEstruturasDeRepeticao estruturaWhile = new EstudandoEstruturasDeRepeticao("while");
            estruturaWhile.repetir();
            System.out.println("\n");       //somente para pular linha na sysout

            EstudandoEstruturasDeRepeticao estruturaDoWhile = new EstudandoEstruturasDeRepeticao("do-while");
            estruturaDoWhile.repetir();
            System.out.println("\n");       //somente para pular linha na sysout
            //------------------------------------------------------------------*
            //Trabalhando com arrays
            // ------------------------------------------------------------------*
            EstudandoArrays estudandoArrays = new EstudandoArrays(5);
            String[] carros = estudandoArrays.getCarros();
            int nota4[][] = estudandoArrays.getNota4();

            //obtendo dados de um array multidimensional (também pode ser usado para setter dados)
            System.out.println("o tamanho do array matriz 2x2 eh: " + nota4.length);
            System.out.println("o valor de linha:0 e coluna:0 =" + nota4[0][0]);
            System.out.println("o valor de linha:0 e coluna:1 =" + nota4[0][1]);
            System.out.println("o valor de linha:1 e coluna:0 =" + nota4[1][0]);
            System.out.println("o valor de linha:1 e coluna:1 =" + nota4[1][1]);
            System.out.println("\n");       //somente para pular linha na sysout

            //Percorrendo array com for
            // Obs.: o .length abaixo é usado para descobrir o tamanho do array
            for (int i = 0; i < carros.length; i++) {
                System.out.println("percorrendo com for simples: " + carros[i]);
            }
            System.out.println("\n");       //somente para pular linha na sysout

            //usando for-each para percorrer um array
            //for( <TipoArray> <variávelDeUmaOcorDoArray> : <Array>) {instruções}
            for (String carro : carros) {
                System.out.println("percorrendo com for-each: " + carro);
            }
            System.out.println("\n");       //somente para pular linha na sysout

            //preenchendo um array
            estudandoArrays.setNotas1(0, 50);
            int[] nota1 = estudandoArrays.getNotas1();
            System.out.println("O valor que preenchi eh: " + nota1[0]);
            System.out.println("\n");       //somente para pular linha na sysout

            //------------------------------------------------------------------*
            // Trabalhando com Strings
            //------------------------------------------------------------------*
            EstudandoStrings estudandoStrings = new EstudandoStrings();

            //Comparações
            estudandoStrings.comparacaoErrada(estudandoStrings.getPrimeiroNome01(), estudandoStrings.getPrimeiroNome03());
            estudandoStrings.comparacaoCorreta01(estudandoStrings.getPrimeiroNome01(), estudandoStrings.getPrimeiroNome03()); //Case sensitive
            estudandoStrings.comparacaoCorreta01(estudandoStrings.getPrimeiroNome01(), estudandoStrings.getPrimeiroNome02()); //Case sensitive - exemplo erro
            estudandoStrings.comparacaoCorreta02(estudandoStrings.getPrimeiroNome01(), estudandoStrings.getPrimeiroNome02()); //Nao eh case sensitive

            //obtendo o tamanho de uma string
            System.out.println(estudandoStrings.getPrimeiroNome01().length());

            //concatenando Strings
            String nomeCompleto = estudandoStrings.concatenarString(estudandoStrings.getPrimeiroNome01(), estudandoStrings.getSegundoNome01(), estudandoStrings.getUltimoNome01());
            System.out.println("o nome completo eh: " + nomeCompleto);

            //Pesquisando dentro da String
            String argumentoPesquisa = new String("Caique");
            int encontrou = estudandoStrings.encontrarArgumentoDentroDaString(argumentoPesquisa, nomeCompleto); //indexof é case sensitive

            System.out.println("\n");       //somente para pular linha na sysout

            //Criando uma nova string com trecho da anterior
            String novaStrintg = new String("");
            if (encontrou == -1) {
                System.out.println("encontrou ? : " + false);
            } else {
                System.out.println("encontrou ? : " + true);
                novaStrintg = nomeCompleto.substring(encontrou, argumentoPesquisa.length());
                System.out.println(novaStrintg);
            }
            // deixando uma string em caixa alta ou baixa
            String st1 = novaStrintg.toUpperCase();     //alta
            System.out.println(st1);

            String st2 = novaStrintg.toLowerCase();     //baixa
            System.out.println(st2);

            // replace ou substituição
            String st3 = novaStrintg.replace('e', 'x');
            System.out.println(st3);

            // Split - quebrando uma String e gerando novas a partir de um delimitador
            String[] nomes = nomeCompleto.split(" ");

            for (String nome : nomes) {
                System.out.println("nome: " + nome);
            }

            //------------------------------------------------------------------*
            // Trabalhando com collections
            //------------------------------------------------------------------*

            EstudandoCollections curso1 = new EstudandoCollections();
            curso1.adicionarAluno("Janaina");
            curso1.adicionarAluno("Marcos");
            curso1.adicionarAluno("Caique");
            curso1.adicionarAluno("Bianca");
            curso1.adicionarAula ("9999","Java Jedi", "Pedro Henrique Porto");
            curso1.adicionarAula ("1111","Java Fundamentos", "Pedro Henrique Porto");
            curso1.adicionarAula ("3333","Java Profissional", "Pedro Henrique Porto");
            curso1.adicionarAula ("2222","Java Avançado", "Pedro Henrique Porto");



            System.out.println(curso1.getAlunos());
            System.out.println(curso1.getAulas()); //foi necessario sobrescrever o metodo toString

            //Ordenando alunos collection de strings
            curso1.ordenaAlunos();
            System.out.println("Alunos ordenados:\n"+ curso1.getAlunos());

            //Ordenando aulas collection de objetos criada por min
            curso1.ordenaAulas();
            System.out.println("aulas ordenadas:\n"+ curso1.getAulas());

            // O atributo alunos da classe EstudandoCollections é uma coleção (ArrayList) sem usar generics <> então da pra colocar qualquer coisa
            curso1.alunos.add(1.0); // o generics é justamente pra evitar isso
            System.out.println("Exemplo sem generics: "+curso1.getAlunos());

            //obtendo o tamanho da coleção
            System.out.println("O tamanho da collection alunos eh: "+curso1.alunos.size());
            System.out.println("O tamanho da collection aulas eh: "+curso1.aulas.size());

            //Testando o equals e hashcode
            curso1.adicionarAula ("2222","Java Avançado", "Pedro Henrique Porto");
            System.out.println("Test equals e hashcode:\n"+ curso1.getAulas());

            //------------------------------------------------------------------*
            // exemplo forçando a cair na exceção
            //------------------------------------------------------------------*
            EstudandoEstruturasDeRepeticao estruturaKkk = new EstudandoEstruturasDeRepeticao("kkk");
            estruturaKkk.repetir();

        } catch (Exception e) {
            System.out.println("ocorreu um erro " + e);
        }


    }
}
