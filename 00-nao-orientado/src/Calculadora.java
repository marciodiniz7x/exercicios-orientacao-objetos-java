import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {
    public static void main(String[] args) {

        System.out.println("Calculadora sem OO");
        char ch = "";
        while(true) {
            System.out.println("Para sair digite S ou s");
            ch = cinch();
            if (ch == "S" || ch == "s") {
                break;
            }
        }
    }
}
