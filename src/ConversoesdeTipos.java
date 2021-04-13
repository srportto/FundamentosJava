public class ConversoesdeTipos {

    public void deStringParaInterger(String numeroStr){
        //float numeroInt = Integer.valueOf(numeroStr).intValue();
        int numeroInt=0;

        try {
            numeroInt= Integer.parseInt(numeroStr);
            System.out.println("converteu String pra int com sucesso, numero convertido:"+ numeroInt+" \n");
        } catch (Exception e) {
            throw new NumberFormatException("Conversao de String pra Int falhou");
        }
    }


    public void deIntergerParaString(int numeroInt){
        String numeroStr = Integer.toString(numeroInt);

        System.out.println("");
    }

}
