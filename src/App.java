// Classe principal que possui o metodo main para explorar os fundamentos do java
public class App {

    public static void main(String[] args) {
        EstudandoTiposVariaveisPrimitivos primitivos = new EstudandoTiposVariaveisPrimitivos();
        System.out.println(primitivos.toString());

        // casting ou conversao de valores
        System.out.println(primitivos.castingIntPraShort(5000));    //risco de perder informacao na conversao int > short
        System.out.println(primitivos.castingDoublePraInt(50.33));   //perde a informação da parte fracionada

        EstudandoTiposVariaveisReferencias referencias = new EstudandoTiposVariaveisReferencias();
        System.out.println(referencias.toString());

    }
}
