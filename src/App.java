import java.util.Arrays;

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

            //obtendo dados de um array multidimensional (também pode ser usado para setter dados)

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
