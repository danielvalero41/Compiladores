import java_cup.runtime.Symbol;
import java.lang.Math;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(new FileInputStream ("C:\\Users\\Daniel Valero\\Documents\\Compiladores\\Material para crear el compilador\\ast\\JFlex_CUP\\test\\t1_1"));
        Yylex lexico = new Yylex(reader);
        parser sintactico = new parser(lexico);
        System.out.println("Inicio");
        try {
            sintactico.parse();
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("Fin");
    }

}