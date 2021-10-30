import java.math.BigDecimal;


public class Agendamento {

    private String agencia;
    private String conta;
    private String digito_conta;
    private long tipoConta;
    private BigDecimal valor;

    public Agendamento(String agencia, String conta, String digito_conta, long tipoConta, BigDecimal valor) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito_conta = digito_conta;
        this.tipoConta = tipoConta;
        this.valor = valor;
    }

    public Agendamento() {
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getDigito_conta() {
        return digito_conta;
    }

    public void setDigito_conta(String digito_conta) {
        this.digito_conta = digito_conta;
    }

    public long getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(long tipoConta) {
        this.tipoConta = tipoConta;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
