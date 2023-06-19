import Conicas1.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circunferencia circulo = new Circunferencia(3.4f,5.6f,2,6.5f,8,5.5f);
        ELIPSEE elipsee = new ELIPSEE(6.54f,12.44f,5.5f,6.8f,8.6f,8);
        Hiperbole hiperbole = new Hiperbole(4.54f,10.24f,5.6f,6.2f,2.6f,5.6f,5);
        Parabola parabola = new Parabola(7.8f,8.8f,4,8.6f);

        int opcion;
        do{
            System.out.println("\n****** Menu Conicas del Grupo 1 *****");
            System.out.println("1. Circunferencia");
            System.out.println("2. Elpise");
            System.out.println("3. Hiperbole");
            System.out.println("4. Parabola");
            System.out.println("5. Salir");
            System.out.print("Ingrese una de las opciones del menu: ");
            opcion = sc.nextInt();
            switch (opcion){

                case 1:
                    System.out.println("Ejercicio de la Circunferencia");
                    circulo.imprimir();
                    break;

                case 2:
                    System.out.println("Ejercicio de la Elipse");
                    elipsee.imprimirelipse();
                    break;

                case 3:
                    System.out.println("Ejercicio de la hiperbole");
                    hiperbole.hallar_vertices();
                    break;

                case 4:
                    System.out.println("Ejercicio de la parabola");
                    parabola.imprimirParabola();
                    break;

                case 5:
                    System.out.println("Adios :D");
                    break;
                default:
                    System.out.println("Opcion no disponible!!!!");
                    break;
            }

        }while (opcion !=5);

    }
}
