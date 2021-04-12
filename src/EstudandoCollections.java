import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstudandoCollections {
    /*
        Atributos
     */
    ArrayList alunos;
    List <Aula> aulas; //usando Generics para restringir os tipos de dados aceitos por referência genérica.


    /*
        Construtor
     */

    public EstudandoCollections() {
        this.alunos = new ArrayList();
        this.aulas = new ArrayList<>();
    }



    /*
        getters and setters
     */
    public ArrayList getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList alunos) {
        this.alunos = alunos;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }



    /*
        outros métodos
     */

    public void adicionarAluno(String nomeAluno){
        this.alunos.add(nomeAluno);
    }

    public void adicionarAula(String id,String nomeMateria, String nomeProfessor){
        Aula aula = new Aula(id ,nomeMateria, nomeProfessor);

        //eh verdade que na collection atual não tem o objeto aula?... se sim, deixa adicionar, se nao de a mensagem
        if (!this.aulas.contains(aula)){
            this.aulas.add(aula);
        } else {
            System.out.println("Nao foi possivel incluir ...objeto repetido!");
        }


    }

    public void ordenaAlunos(){
        Collections.sort(this.alunos);
    }

    public void ordenaAulas(){
        Collections.sort(this.aulas);
    }

}
