import java.util.ArrayList;
import java.util.List;

public class EstudandoCalculos {

    public void somarNumeros(int[] numeros) {
        int resultado = 0;

        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i];

        }
        System.out.println("O resultado da soma eh: "+resultado+"\n");

    }

    public void subtrairNumeros(int numero01, int numero02) {
        int resultado = 0;

        resultado = numero01 - numero02;

        System.out.println("O resultado da subtracao eh: \n"+resultado);
    }


    public int multiplicarNumeros(int[] numeros) {
        int resultado = 1;

        for (int i = 0; i < numeros.length; i++) {
            resultado *= numeros[i];

        }
        return resultado;

    }

    public void dividirNumeros(int numero01, int numero02) {
        int resultado = 0;
        int restoDaDivisao = -1;

        if (numero02 == 0) {
            throw new ArithmeticException("não é permitido divisões por 0 ");
        }

        resultado = numero01 / numero02;
        restoDaDivisao = (numero01 % numero02);

        if (restoDaDivisao == 0) {
            System.out.println("O resultado da divisão eh: " + resultado + " e dividiu redondinho (sem restos) \n");
        } else {
            System.out.println("O resultado da divisão eh: " + resultado + " e não deu redondinho (tem restos " + restoDaDivisao + ") \n");
        }

    }

    public void verificarNumeroPar(int numero) {

        int restoDaDivisao = -1;

        //mod 2
        restoDaDivisao = (numero % 2);

        if (restoDaDivisao == 0) {
            System.out.println("O numero "+ numero+" eh PAR \n");
        } else {
            System.out.println("O numero "+ numero+" eh IMPAR \n");
        }

    }

    // exemplo: 2², 2³
    public void elevarNumeroAUmaPotencia(int numero, int numero02) {

        double resultado = 0;

        resultado = Math.pow(numero, numero02);

        System.out.println("O resultado da potenciação eh: "+resultado+ "\n");

    }
}
