import java.util.Calendar;
public class Calendario {
    public static void main(String[] args){

        int dia;
        int mes;
        int ano;
        String mensagem;

        Calendar data = Calendar.getInstance();

        dia = data.get(Calendar.DAY_OF_MONTH);
        mes = data.get(Calendar.MONTH);
        ano = data.get(Calendar.YEAR);

        mensagem = "Olha,  Hoje é dia ";
        mensagem += ((dia < 10) ? "0" : "") + dia + "/";
        mensagem += ((mes < 10)? "0" : "") + mes + "/";
        mensagem += ano;

        System.out.println(mensagem);


    }
}
