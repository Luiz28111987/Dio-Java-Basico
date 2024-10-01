import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(final String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        Number valor = null;

        try {
            valor = numberFormat.parse("a1.75");
        } catch (ParseException e) {
            System.err.println("Error parsing value: " + e.getMessage());
            // Handle the exception, e.g., provide a default value or perform alternative actions
            valor = 0; // Or any other appropriate default value
        }

        System.out.println(valor);
    }
}