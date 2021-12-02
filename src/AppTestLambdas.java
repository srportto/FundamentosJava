import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class AppTestLambdas {
    public static void main(String[] args) {

        List<Agendamento> agendamentos = new LinkedList<>();

        //populando o arrayList
        var agd1 = new Agendamento("7375", "27459", "1", 1, BigDecimal.valueOf(1.1));
        var agd2 = new Agendamento("7375", "27459", "1", 5, BigDecimal.valueOf(1.33));

        for (int j = 1; j <= 5; j++) {
            agendamentos.add(agd1);
            agendamentos.add(agd2);
        }

        var valorTotal = agendamentos.stream()
                .map(agendamento -> agendamento.getValor())
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        var valorTotalContaCorrente = agendamentos.stream()
                .filter(agendamento -> agendamento.getTipoConta() == 1)
                .map(agendamento -> agendamento.getValor())
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        var valorTotalContaPoupanca = agendamentos.stream()
                .filter(agendamento -> agendamento.getTipoConta() == 5)
                .map(agendamento -> agendamento.getValor())
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Valor total agd geral: " + valorTotal);
        System.out.println("Valor total agd conta corrente: " + valorTotalContaCorrente);
        System.out.println("Valor total agd conta corrente: " + valorTotalContaPoupanca);
    }
}
