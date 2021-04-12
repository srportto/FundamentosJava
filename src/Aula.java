import java.util.Objects;
import java.util.UUID;

// Obs.:  Classe usada no estudo de collections

// para poder classificar uma coleção de objeto criada por min é preciso implementar  Comparable e sobrescrever o metodo
// de comparação com meus critérios
public class Aula implements Comparable<Aula>{
    String id;
    String nomeMateria;
    String nomeProfessor;

    public Aula( String id,String nomeMateria, String nomeProfessor) {
        //this.id = UUID.randomUUID().toString().replace("-", "");
        this.id = id;
        this.nomeMateria = nomeMateria;
        this.nomeProfessor = nomeProfessor;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id='" + id + '\'' +
                ", nomeMateria='" + nomeMateria + '\'' +
                ", nomeProfessor='" + nomeProfessor + '\'' +
                '}';
    }


    @Override
    public int compareTo( Aula outraAula) {
        // a - ascendente -> menor pra maior
        // d - descendente -> maior para menor
        char parametroCreiterio = 'd';

        if (parametroCreiterio == 'a'){
            return this.id.compareTo(outraAula.id);   //mantendo o critério de comparação em ordem alfabética idem critério de comparação de strings
        } else  {
            return this.id.compareTo(outraAula.id) * -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aula aula = (Aula) o;
        return id.equals(aula.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
