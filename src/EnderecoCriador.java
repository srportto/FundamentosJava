public class EnderecoCriador {
    String rua ;
    long cep;
    int numero;
    String cidade;
    String uf;

    public EnderecoCriador(String rua, long cep, int numero, String cidade, String uf) {
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "EnderecoCriador{" +
                "rua='" + rua + '\'' +
                ", cep=" + cep +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
