import java.util.Calendar;
public class Calendario {
    public static void main(String[] args){

        int mes;
        String mensagem;

        Calendar data = Calendar.getInstance();
        mes = data.get(Calendar.MONTH);

        String [] minhaMatriz;
        minhaMatriz = new String[12];

        minhaMatriz[0] = "janeiro";
        minhaMatriz[1] = "fevereiro";
        minhaMatriz[2] = "março";
        minhaMatriz[3] = "abril";
        minhaMatriz[4] = "maio";
        minhaMatriz[5] = "junho";
        minhaMatriz[6] = "julho";
        minhaMatriz[7] = "agosto";
        minhaMatriz[8] = "setembro";
        minhaMatriz[9] = "outubro";
        minhaMatriz[10] = "novembro";
        minhaMatriz[11] = "dezembro";

        System.out.println("O mes e " + minhaMatriz[mes] + "!");

    }
}
