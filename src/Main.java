import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre = "";
        int edad = 0;
        double altura = 0;
        int tlf = 0;
        boolean valorCorrecto = false;
        boolean salir = false;
        int accionMenu = 0;
        int huecosAgenda = 0;
        Scanner inputAgenda = new Scanner(System.in);
        System.out.println("¿Cuántos huecos desea asignar a su agenda?: ");
        huecosAgenda = inputAgenda.nextInt();
        Agenda nuevaAgenda = new Agenda(huecosAgenda);
        Scanner input = new Scanner(System.in);

        while (!salir) {
            System.out.println("¿Qué desea hacer? \n1.Introducir un nuevo usuario \n2.Salir ");
            accionMenu = input.nextInt();
            input.nextLine(); //Limpia la entrada del scanner.
            System.out.println();
            switch (accionMenu) {
                case 1:
                    valorCorrecto = false; //Para las siguientes iteraciones
                    while (!valorCorrecto) {
                        try {
                            valorCorrecto = true;
                            System.out.println("Introduzca su nombre: ");
                            nombre = input.next();
                            input.nextLine();
                            System.out.println();
                        } catch (InputMismatchException ex) {
                            valorCorrecto = false;
                            ex.printStackTrace();
                            input.next();
                        }
                    }
                    System.out.println("Nombre: " + nombre);
                    valorCorrecto = false;

                    while (!valorCorrecto) {
                        try {
                            valorCorrecto = true;
                            System.out.println("Introduzca su edad: ");
                            edad = input.nextInt();
                            input.nextLine();
                            System.out.println();
                        } catch (InputMismatchException ex) {
                            valorCorrecto = false;
                            ex.printStackTrace();
                            input.next();
                        }
                    }
                    System.out.println("Edad: " + edad);
                    valorCorrecto = false;

                    while (!valorCorrecto) {
                        try {
                            valorCorrecto = true;
                            System.out.println("Introduzca su altura: ");
                            altura = input.nextDouble();
                            input.nextLine();
                            System.out.println();
                        } catch (InputMismatchException ex) {
                            valorCorrecto = false;
                            ex.printStackTrace();
                            input.next();
                        }
                    }
                    System.out.println("Altura: " + altura + "m");
                    valorCorrecto = false;

                    while (!valorCorrecto) {
                        try {
                            valorCorrecto = true;
                            System.out.println("Introduzca su número de teléfono: ");
                            tlf = input.nextInt();
                            input.nextLine();
                            System.out.println();
                        } catch (InputMismatchException ex) {
                            valorCorrecto = false;
                            ex.printStackTrace();
                            input.next();
                        }
                    }
                    System.out.println("Teléfono: " + tlf);
                    Perfil nuevoPerfil = new Perfil(nombre, edad, altura, tlf);
                    System.out.println(nuevoPerfil.toString()); //test
                    nuevaAgenda.addPerfilAgenda(nuevoPerfil);
                    System.out.println(nuevaAgenda.toString()); //test
                    break;
                case 2:
                    salir = true;
                    break;
            }
        }
    }
}
