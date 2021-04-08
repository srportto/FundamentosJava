public class EstudandoTiposVariaveisReferencias  {
    /*tipos referencia
     * Os programas utilizam as variáveis de tipos por referência para armazenar as localizações de objetos na memória do computador.
     * Esses objetos que são referenciados podem conter várias variáveis de instância e métodos dentro do objeto apontado.
     *
     * Para trazer um objeto os seus métodos de instância, é preciso ter referência a algum objeto. As variáveis de referência
     * são inicializadas com o valor “**null**” (nulo).
     *
     */

    // tipo reference nativo do java
    String nomeCriador;
    EnderecoCriador endereco;


    public EstudandoTiposVariaveisReferencias() {
        this.nomeCriador = "Caique S. Porto";
        this.endereco = new EnderecoCriador("Alexandrini vargas", 06502, 122, "Osasco", "SP");
    }

    @Override
    public String toString() {
        return "EstudandoTiposVariaveisReferencias{" +
                "nomeCriador='" + nomeCriador + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
