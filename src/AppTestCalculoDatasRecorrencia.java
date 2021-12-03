import java.time.LocalDate;
import java.util.HashMap;

public class AppTestCalculoDatasRecorrencia {
    public static void main(String[] args) {

        LocalDate dataInicioRecorrencia = LocalDate.of(2021, 12, 31);
        LocalDate dataRecorrenciaMesVigente = LocalDate.of(2022, 1, 31);
        int qtdeRepeticoes = 5;

        DatasRecorrenciaCalculada datasRecorrenciaCalculada = calculaDatasRecorrencia(dataInicioRecorrencia, qtdeRepeticoes);
        HashMap<Integer, LocalDate> datasCalculadas = datasRecorrenciaCalculada.getDatasPagamentoRecorrencia();
        var dataDebitoProximaRecorrenciaCalculada = obtemDataProximoDebitoRecorrencia(datasCalculadas, dataRecorrenciaMesVigente, qtdeRepeticoes);

        System.out.println("*************>>> SET-UP <<<*************");
        System.out.println("dataInicioRecorrencia ...:" + dataInicioRecorrencia);
        System.out.println("qtdeRepeticoes ..........:" + qtdeRepeticoes);
        System.out.println("dataRecorrenciaVigente ..:" + dataRecorrenciaMesVigente);
        System.out.println("dataProximaRecorrencia ..:" + dataDebitoProximaRecorrenciaCalculada);
        System.out.println("\n");

        System.out.println("--------------------------------------------");
        System.out.println("Todas as datas de pagamento da recorrência:");
        for (int i = 1; i < qtdeRepeticoes; i++) {
            System.out.println("dataPagamentoRecorrencia[" + i + "] = " + datasCalculadas.get(i));
        }

    }

    public static DatasRecorrenciaCalculada calculaDatasRecorrencia(LocalDate dataInicioRecorrencia, Integer qtdeRepeticoes) {
        var dataAuxiliarCalculo = LocalDate.of(1900, 01, 01);
        var datasCalculadas = new HashMap<Integer, LocalDate>();

        for (int i = 1; i < qtdeRepeticoes; i++) {
            dataAuxiliarCalculo = dataInicioRecorrencia;
            dataAuxiliarCalculo = dataAuxiliarCalculo.plusMonths(i);

            if (dataAuxiliarCalculo.getDayOfMonth() != dataInicioRecorrencia.getDayOfMonth()) {
                dataAuxiliarCalculo = dataAuxiliarCalculo.plusDays(1);
            }

            datasCalculadas.put(i, dataAuxiliarCalculo);
        }

        var datasRecorrenciaCalculada =DatasRecorrenciaCalculada.builder()
                .dataFimRecorrencia(dataAuxiliarCalculo)
                .datasPagamentoRecorrencia(datasCalculadas)
                .build();

        return datasRecorrenciaCalculada;
    }

    public static LocalDate obtemDataProximoDebitoRecorrencia(HashMap<Integer, LocalDate> datasCalculadas, LocalDate dataRecorrenciaAtual, Integer qtdeRepeticoes) {
        int indexDataProximaRecorrencia = 0;

        for (int i = 1; i < qtdeRepeticoes; i++) {
            if (datasCalculadas.get(i).equals(dataRecorrenciaAtual)) {
                indexDataProximaRecorrencia+= i + 1;

                i = (qtdeRepeticoes + 1);
            }
        }

        return datasCalculadas.get(indexDataProximaRecorrencia);
    }
}