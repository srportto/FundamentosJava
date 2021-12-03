import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashMap;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DatasRecorrenciaCalculada {
    private LocalDate dataFimRecorrencia;
    private HashMap<Integer, LocalDate> datasPagamentoRecorrencia;
}
