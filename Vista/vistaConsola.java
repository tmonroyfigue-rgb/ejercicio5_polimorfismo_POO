package Vista;

import java.util.Scanner;

public class vistaConsola {

    private Scanner entrada;

    public vistaConsola() {
        entrada = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println(" Quetzal 2");
        System.out.println("1. Listar todos los modulos");
        System.out.println("2. Buscar modulo por ID");
        System.out.println("3. Buscar modulo por nombre");
        System.out.println("4. Ordenar modulos por costo");
        System.out.println("5. Salir");
    }

    public int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = entrada.nextLine();

            try {
                return Integer.parseInt(texto.trim());
            } catch (NumberFormatException e) {
                System.out.println(
                    "Entrada invalida. Escriba un numero entero."
                );
            }
        }
    }

    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine().trim();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}