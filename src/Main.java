import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Divisões!");
        boolean continueLoop = true;
        do{
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o numerador: ");
            String a = sc.nextLine();

            System.out.println("Digite o denominador: ");
            String b = sc.nextLine();

            try {
                int result = div(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + result);
                continueLoop = false;
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida: " + e.getMessage());
            } catch (ArithmeticException ex){
                System.out.println("Entrada invalida: " + ex.getMessage());
            }
            finally {
                System.out.println("Finally");
            }
        }while (continueLoop);

        System.out.println("Continuando..");
    }

    public static int div(int a, int b){
        return a/b;
    }
}