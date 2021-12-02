import java.time.LocalDate;

public class AppTestCalculoMelhorData {
    public static void main(String[] args) {

        LocalDate dataInicioRecorrencia = LocalDate.of(2021, 12, 31);
        LocalDate dataRecorrenciaMesVigente = LocalDate.of(2022, 2, 28);
        LocalDate dataProximaRecorrencia = dataRecorrenciaMesVigente.plusMonths(1);

        int diaDeDebitoEscolhidoPeloCliente = dataInicioRecorrencia.getDayOfMonth();
        int diaDeDebitoProximaRecorrenciaAtual = dataProximaRecorrencia.getDayOfMonth();
        int mesDataProximaRecorrencia = dataProximaRecorrencia.getMonthValue();

        LocalDate dataCalculadaAux;

        for(int i = 2; i <= 10; i++) {
            if(diaDeDebitoProximaRecorrenciaAtual != diaDeDebitoEscolhidoPeloCliente) {
                if(diaDeDebitoProximaRecorrenciaAtual < diaDeDebitoEscolhidoPeloCliente) {
                    System.out.println("*--------------------------menor------------------------*");
                    System.out.println("Mês: " + i);
                    dataCalculadaAux = encontrarMelhorDiaQuandoDataDebitoAtualMenor(dataProximaRecorrencia, mesDataProximaRecorrencia, diaDeDebitoEscolhidoPeloCliente);
                    System.out.println("Data de debito sera: " + dataCalculadaAux);
                    System.out.println("\n");

                    dataProximaRecorrencia = dataCalculadaAux.plusMonths(1);
                    mesDataProximaRecorrencia = dataProximaRecorrencia.getMonthValue();
                    diaDeDebitoProximaRecorrenciaAtual = dataProximaRecorrencia.getDayOfMonth();

                } else {
                    System.out.println("*-------------------------maior------------------------*");
                    System.out.println("Mês: " + i);
                    dataCalculadaAux = encontrarMelhorDiaQuandoDataDebitoAtualMaior(dataProximaRecorrencia, mesDataProximaRecorrencia, diaDeDebitoEscolhidoPeloCliente);
                    System.out.println("Data de debito sera: " + dataCalculadaAux);
                    System.out.println("\n");

                    dataProximaRecorrencia = dataCalculadaAux.plusMonths(1);
                    mesDataProximaRecorrencia = dataProximaRecorrencia.getMonthValue();
                    diaDeDebitoProximaRecorrenciaAtual = dataProximaRecorrencia.getDayOfMonth();

                }

            } else {

                System.out.println("*-------------------------Igual-------------------------*");
                System.out.println("Mês: " + i);
                System.out.println("Data de debito sera: " + dataProximaRecorrencia);
                System.out.println("\n");

                dataProximaRecorrencia = dataProximaRecorrencia.plusMonths(1);
                mesDataProximaRecorrencia = dataProximaRecorrencia.getMonthValue();
                diaDeDebitoProximaRecorrenciaAtual = dataProximaRecorrencia.getDayOfMonth();
            }

        }


    }

    public static LocalDate encontrarMelhorDiaQuandoDataDebitoAtualMenor(LocalDate dataProximaRecorrencia, int mesDataProximaRecorrencia, int diaDeDebitoEscolhidoPeloCliente) {
        boolean melhorDataDebitoEncontrada = false;
        LocalDate dataProximaRecorrenciaCalculada;
        dataProximaRecorrenciaCalculada = dataProximaRecorrencia;

        while (melhorDataDebitoEncontrada == false) {
            dataProximaRecorrenciaCalculada =  dataProximaRecorrenciaCalculada.plusDays(1L);

            if (dataProximaRecorrenciaCalculada.getMonthValue() != mesDataProximaRecorrencia) {
                dataProximaRecorrenciaCalculada = dataProximaRecorrenciaCalculada.minusDays(1L);
                melhorDataDebitoEncontrada = true;
            } else {
                if (dataProximaRecorrenciaCalculada.getDayOfMonth() == diaDeDebitoEscolhidoPeloCliente) {
                    melhorDataDebitoEncontrada = true;
                }
            }
        }

        return dataProximaRecorrenciaCalculada;
    }

    public static LocalDate encontrarMelhorDiaQuandoDataDebitoAtualMaior(LocalDate dataProximaRecorrencia, int mesDataProximaRecorrencia, int diaDeDebitoEscolhidoPeloCliente) {
        boolean melhorDataDebitoEncontrada = false;
        LocalDate dataProximaRecorrenciaCalculada;
        dataProximaRecorrenciaCalculada = dataProximaRecorrencia;

        while (melhorDataDebitoEncontrada == false) {
            dataProximaRecorrenciaCalculada =  dataProximaRecorrenciaCalculada.minusDays(1L);

            if (dataProximaRecorrenciaCalculada.getMonthValue() != mesDataProximaRecorrencia) {
                dataProximaRecorrenciaCalculada = dataProximaRecorrenciaCalculada.plusDays(1L);
                melhorDataDebitoEncontrada = true;
            } else {
                if (dataProximaRecorrenciaCalculada.getDayOfMonth() == diaDeDebitoEscolhidoPeloCliente) {
                    melhorDataDebitoEncontrada = true;
                }
            }
        }

        return dataProximaRecorrenciaCalculada;
    }
}