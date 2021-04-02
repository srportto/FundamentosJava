public class EstudandoTiposVariaveisPrimitivos {

    /*tipos primitivos
     * Existem oito tipos primitivos para armazenamento de informações. Tipos primitivos não são objetos,
     * eles são partes internas da linguagem Java, o que os torna mais eficientes
     *
     */

    // Dos oito tipos primitivos, quatro são para armazenar tipos números inteiros... são eles:
    int idadeInt;                   // 4 bytes	–2.147.483.648 a 2.147.483.647 (um pouco acima de 2 bilhões)  **** mais usado ***
    short idadeShort;               // 2 bytes	–32.768 a 32.767
    long idadeLong;                 // 8 bytes	–9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
    byte idadeByte;                 // 1 byte	-128 a 127

    // para valores de "ponto flutuante"/fracionados
    float pesoFloat;                // 4 bytes	aprox. +/- 3.40282347E+38F (6-7 dígitos decimais significativos)
    double valorDouble;             // 8 bytes	aprox +/- 1.797693134862311570E+308 (15 dígitos decimais significativos) **** mais usado ***


    // outros
    char vogalChar;                 // guarda/armazenar caracteres individuais
    boolean masculinoBoolean;       // guarda somente dois valores, verdadeiro (true) ou falso (false)


    // construtor
    public EstudandoTiposVariaveisPrimitivos() {
        //inteiros
        this.idadeInt = 27;
        this.idadeShort = 27;
        this.idadeLong = 27;
        this.idadeByte = 27;

        // fracionados
        this.pesoFloat = (float) 1.00;  //casting, pois 1.0 eh double estou forçando float
        this.valorDouble = 1200.00;

        //outros
        this.vogalChar = 'a';
        this.masculinoBoolean=true;

    }

    @Override
    public String toString() {
        return "EstudandoTipos Variaveis Primitivos{" +
                "idadeInt = " + idadeInt +
                ", idadeShort = " + idadeShort +
                ", idadeLong = " + idadeLong +
                ", idadeByte = " + idadeByte +
                ", pesoFloat = " + pesoFloat +
                ", valorDouble = " + valorDouble +
                ", vogalChar = " + vogalChar +
                ", masculinoBoolean = " + masculinoBoolean +
                '}';
    }
}
