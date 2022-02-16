import java.util.Scanner;

public class A1E16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //definir variables-
        int Primero;
        int Segundo;
        int Tercero;

        //perdir valores
        System.out.print("Ingrese el primer numero: ");
        Primero = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        Segundo = scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        Tercero = scanner.nextInt();

        //hacer condiciones para ver en cual cumple 
        if ((Primero > Segundo) && (Primero > Tercero)) {

            System.out.println(Primero + " es el mayor numero");

        } else if ((Segundo > Primero) && (Segundo > Tercero)) {

            System.out.println(Segundo + " es el mayor numero");

        } else {

            System.out.println(Tercero + " es el mayor numero");

        }
    }

}
