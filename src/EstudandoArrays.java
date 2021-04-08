public class EstudandoArrays {
    //formas de declarar um array
    private int[] notas1;                   //sem tamanho atribuído - terá que ser informado posteriormente;
    private int notas2[] = new int[2];      // com tamanho atribuído

    //declarando e passando valores
    private int[] notas3 = {1, 2, 3, 4, 5};

    private String carros[] = {"Fiesta", "Fusca", "Ford ka", "Gol", "Impala"};

    // array multidimensional ouy matriz
    private int nota4 [][] = new int[2][2];

    /*
        Construtor
     */

    public EstudandoArrays(int tamanhoNota1) {
        this.notas1 = new int[tamanhoNota1];
        /*
            25, 50
            75, 100
         */
        this.nota4 [0][0] =25;      //index 0 (linha 01) e coluna 0(coluna 1)
        this.nota4 [0][1] =50;      //index 0 (linha 01) e coluna 1(coluna 2)
        this.nota4 [1][0] =75;      //index 1 (linha 02) e coluna 0(coluna 1)
        this.nota4 [1][1] =10;      //index 1 (linha 02) e coluna 1(coluna 2)

    }
    /*
        getters and setters
    */

    public int[] getNotas1() {
        return notas1;
    }

    public void setNotas1(int posicao, int novovalor) {
        this.notas1[posicao] = novovalor;
    }

    public int[] getNotas2() {
        return notas2;
    }

    public void setNotas2(int[] notas2) {
        this.notas2 = notas2;
    }

    public int[] getNotas3() {
        return notas3;
    }

    public void setNotas3(int[] notas3) {
        this.notas3 = notas3;
    }

    public String[] getCarros() {
        return carros;
    }

    public void setCarros(String[] carros) {
        this.carros = carros;
    }

    public int[][] getNota4() {
        return nota4;
    }

    public void setNota4(int[][] nota4) {
        this.nota4 = nota4;
    }
}
