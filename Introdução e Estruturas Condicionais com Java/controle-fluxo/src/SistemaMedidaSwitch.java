import java.util.Scanner;

public class SistemaMedidaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sigla = scanner.nextLine();

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}