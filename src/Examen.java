import java.util.Scanner;

public class Examen {
    private double N1, N2;

    public Examen(double n1, double n2) {
        N1 = n1;
        N2 = n2;
    }

    public double sumar() {
        return N1 + N2;
    }

    public double restar() {
        return N1 - N2;
    }

    public double multiplicar() {
        return N1 * N2;
    }

    public double dividir() {
        if (N2 == 0) {
            System.out.println("¡No se puede dividir por cero!");
            return 0;
        } else {
            return N1 / N2;
        }
    }

    public double exponencial() {
        return Math.pow(N1, N2);
    }

    public void setN1(double n1) {
        N1 = n1;
    }

    public void setN2(double n2) {
        N2 = n2;
    }

    public static void operaciones(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double resul;
        do {
            System.out.println("===== CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Exponencial");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            System.out.println("\n");
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    double N1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double N2 = scanner.nextDouble();
                    Examen calSum = new Examen(N1, N2);
                    resul = calSum.sumar();
                    System.out.println(N1 + " + " + N2 + " = " + resul);
                    break;

                case 2:
                    System.out.print("Ingrese el primer número: ");
                    N1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    N2 = scanner.nextDouble();
                    Examen calResta = new Examen(N1, N2);
                    resul = calResta.restar();
                    System.out.println(N1 + " - " + N2 + " = " + resul);
                    break;

                case 3:

                    System.out.print("Ingrese el primer número: ");
                    N1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    N2 = scanner.nextDouble();
                    Examen calMulti = new Examen(N1, N2);
                    resul = calMulti.multiplicar();
                    System.out.println(N1 + " x " + N2 + " = " + resul);
                    break;

                case 4:
                    System.out.print("Ingrese el dividendo: ");
                    N1 = scanner.nextDouble();
                    System.out.print("Ingrese el divisor: ");
                    N2 = scanner.nextDouble();
                    Examen calDiv = new Examen(N1, N2);
                    resul = calDiv.dividir();
                    if (resul != 0) {
                        System.out.println(N1 + " / " + N2 + " = " + resul);
                    }
                    break;

                case 5:
                    System.out.print("Ingrese la base: ");
                    N1 = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    N2 = scanner.nextDouble();
                    Examen calExp = new Examen(N1, N2);
                    resul = calExp.exponencial();
                    System.out.println(N1 + " ^ " + N2 + " = " + resul);
                    break;

                case 6:
                    System.out.println("\n");
                    System.out.println("¡Usted decidió salir del programa, nos vemos!");
                    System.out.println("Creado por: Yael Moises May Caamal");
                    System.out.println("Universidad Del Sur");
                    System.out.println("Materia: Lingüistica computacional");
                    System.out.println("© Todos los derechos reservados.");
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Opción incorrecta, ¡intente otra vez!.");
                    System.out.println("\n");
            }

        } while (opcion != 6);
        scanner.close();
    }
}
