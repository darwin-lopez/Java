import java.util.Scanner;

public class PrincipalModularidad {

    public static int leerEntero(){
        int e = 0;
        Scanner sc;
        try {
            sc = new Scanner(System.in);
            e = sc.nextInt();
        } catch (Exception ex){
            System.out.println("Error: ingrese un numero válido.");
        }
        return e;
    }
    public static int leerEnt(){
        return new Scanner(System.in).nextInt();
    }
    public static int sumar(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
    public static int restar(int num1, int num2){
        int dif = num1 - num2;
        return dif;
    }
    public static int multiplicar(int num1, int num2){
        int prod = num1 * num2;
        return prod;
    }
    public static int dividir(int num1, int num2){
        int cos = num1 / num2;
        return cos;
    }
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("###### MENU ######");
            System.out.println("  0- Salir.");
            System.out.println("  1- Sumar.");
            System.out.println("  2- Restar.");
            System.out.println("  3- Multiplicar.");
            System.out.println("  4- Dividir.");
            System.out.print(" POR FAVOR INGRESE UN OPERADOR : ");
            opcion = leerEntero();
            int num1 = 0;
            int num2 = 0;
            if (opcion != 0) {
                System.out.print("Ingrese un numero entero: ");
                num1 = leerEntero();
                System.out.print("Ingrese otro numero entero: ");
                num2 = leerEntero();
            } else {
                System.out.println("Gracias por usar esta triste calculadora. Vuelva pronto");
            }
                try {
                    switch ( opcion ){
                        case 1:
                            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sumar(num1, num2));
                            break;
                        case 2:
                            System.out.println("La diferencia de " + num1 + " y " + num2 + " es: " + restar(num1, num2));
                            break;
                        case 3:
                            System.out.println("El producto de " + num1 + " y " + num2 + " es: " + multiplicar(num1, num2));
                            break;
                        case 4:
                            System.out.println("El cosiente de " + num1 + " y " + num2 + " es: " + dividir(num1, num2));
                            break;
                        default:
                            System.out.println("Esa opcion no es válida.");
                            break;
                    }
                } catch (ArithmeticException e) {
                    System.out.println(" Error 404 : ingrese otro valor valido por favor... ");
                }
        } while ( opcion != 0 );
    }
}