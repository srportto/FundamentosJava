// Classe principal que possui o metodo main para explorar os fundamentos do java
public class App {

    public static void main(String[] args) {
        try {
        EstudandoTiposVariaveisPrimitivos primitivos = new EstudandoTiposVariaveisPrimitivos();
        System.out.println(primitivos.toString());

        // casting ou conversão de valores
        System.out.println(primitivos.castingIntPraShort(5000));    //risco de perder informacao na conversao int > short
        System.out.println(primitivos.castingDoublePraInt(50.33));   //perde a informação da parte fracionada

        EstudandoTiposVariaveisReferencias referencias = new EstudandoTiposVariaveisReferencias();
        System.out.println(referencias.toString());

        //Estruturas de repetição
        EstudandoEstruturasDeRepeticao estruturaFor = new EstudandoEstruturasDeRepeticao("for");
        estruturaFor.repetir();

        EstudandoEstruturasDeRepeticao estruturaWhile = new EstudandoEstruturasDeRepeticao("while");
        estruturaWhile.repetir();

        EstudandoEstruturasDeRepeticao estruturaDoWhile = new EstudandoEstruturasDeRepeticao("do-while");
        estruturaDoWhile.repetir();

        // exemplo forçando a cair na exceção
        EstudandoEstruturasDeRepeticao estruturaKkk = new EstudandoEstruturasDeRepeticao("kkk");
        estruturaKkk.repetir();

       }catch (Exception e){
           System.out.println("ocorreu um erro "+e);
        }


    }
}
