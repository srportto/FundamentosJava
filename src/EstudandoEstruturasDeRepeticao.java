public class EstudandoEstruturasDeRepeticao {

    /*
        Atributo
     */
    private String nomeEstrutura;

    /*
        Construtor
     */

    public EstudandoEstruturasDeRepeticao(String nomeEstrutura) {
        switch (nomeEstrutura) {
            case "for":
                System.out.println("Usando For...");
                break;

            case "while":
                System.out.println("Usando While...");
                break;

            case "do-while":
                System.out.println("Usando Do-While...");
                break;

            default:
                System.out.println("Estrutura desconhecida");
                throw new IllegalArgumentException("Estrutura desconhecida");
        }

        this.nomeEstrutura = nomeEstrutura;
    }

    /*
     *  getters and setters
     */

    public String getNomeEstrutura() {
        return nomeEstrutura;
    }

    public void setNomeEstrutura(String nomeEstrutura) {
        this.nomeEstrutura = nomeEstrutura;
    }

    public void repetir() {
        /*
            Lembrando que sempre é possível quebrar a repetição com as chamadas quebra de laços
            usando as seguintes palavras reservadas: break ou continue
         */


        if (this.nomeEstrutura == "for") {
            /*  Detalhes da estrutura
                for (<inicialização>;<condição lógica>;<incremento ou decremento>){ <Instruções>}
            */

            //logica de implementação
            // comece de 0; faça até I ser maior que 10(falso); enquanto menor ou igual a 10 (verdade) faça e incremente
            for (int i = 0; i <= 10; i++) {
                System.out.println("Ohhh palmares nao tem mundial " + i);
            }
        }


        if (this.nomeEstrutura == "while") {
            /*  Detalhes da estrutura
               while ( <condição> ) { <Instruções>}
}
            */

            //logica de implementação
            // enquanto I menor ou igual a 10 faça ...
            int i = 0;
            while (i <= 10) {
                System.out.println("Ohhh palmares nao tem mundial " + i);
                i++;
            }
        }

        if (this.nomeEstrutura == "do-while") {
            /*  Detalhes da estrutura
               do {<Instruções>} while ( <condição> );
}
            */

            //logica de implementação
            // faça e depois avalie se é verdade,enquanto verdade continue a fazer e checar...
            int i = 12;

            do {
                System.out.println("Ohhh palmares nao tem mundial " + i);
                i++;
            } while (i <= 10);
        }

    }
}
