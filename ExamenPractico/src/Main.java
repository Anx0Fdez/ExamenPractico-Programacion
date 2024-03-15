import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FortniteManagerImpl fm = new FortniteManagerImpl();
        /*
        Elegir que hacer
        */
        switch (Menu()) {
            case 1:
                fm.agregarSkin(crearSkin());
                break;
            case 2:
                fm.agregarArma(crearArma());
                break;
            case 3:
                fm.buscarSkinsPorRareza(buscarRareza());
                break;
            case 4:
                fm.buscarArmaPorTipo(buscarTipo());
                break;
            case 5:
                fm.eliminarSkin(buscarNombreParaEliminar());
                break;
            case 6:
                fm.eliminarArma(buscarTipoParaEliminar());
                break;
            case 7:
                break;
            default:
                System.out.println("ERROR: Opción no válida.");
        }

    }

    public static int Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("FORTNITE:");

        System.out.println("1. Añadir un skin al inventario.");

        System.out.println("2. Añadir una arma al inventario.");

        System.out.println("3. Buscar un skin por tipo y mostrar su información.");

        System.out.println("4. Mostrar todas las armas de una rareza específica.");

        System.out.println("5. Eliminar un skin del inventario.");

        System.out.println("6. Eliminar una arma del inventario.");

        System.out.println("7. Salir de Fortnite.");

        System.out.print("¿Qué deseas hacer?: ");
        return sc.nextInt();
    }

    /**
     * Creación de una nueva arma especificando: (TIPO, DAÑO)
     */

    public static Arma crearArma() {
        Scanner sc = new Scanner(System.in);
        Arma arma = new Arma();
        System.out.println("Creando nueva arma.");
        System.out.print("  Tipo del arma: ");
        arma.setTipo(sc.nextLine());
        System.out.print("  Daño del arma: ");
        arma.setDaño(sc.nextInt());
        return arma;
    }

    /**
     * Creación de una nueva Skin especificando: (NOMBRE, RAREZA)
     */

    public static Skin crearSkin() {
        Scanner sc = new Scanner(System.in);
        Skin skin = new Skin();
        System.out.println("Creando nueva skin.");
        System.out.print("Nombre de la Skin: ");
        skin.setNombre(sc.nextLine());
        System.out.print("Rareza de la Skin: ");
        skin.setRareza(sc.nextLine());
        return skin;
    }

    /**
     * Buscar por el tipo del Arma
     */

    public static String buscarTipo() {
        Scanner sc = new Scanner(System.in);
        Arma arma = new Arma();
        System.out.println("Buscando armas.");
        System.out.print("Introduce el nombre de la arma que quieres buscar: ");
        arma.setTipo(sc.nextLine());
        return arma.getTipo();
    }

    /**
     * Buscar por la Rareza de la Skin
     */

    public static String buscarRareza() {
        Scanner sc = new Scanner(System.in);
        Skin skin = new Skin();
        System.out.println("Buscando skins.");
        System.out.print("Introduce el nombre de la rareza que quieres buscar: ");
        skin.setNombre(sc.nextLine());
        return skin.getNombre();
    }


    /**
     * Buscador una arma para eliminarla
     */
    public static String buscarTipoParaEliminar() {
        Scanner sc = new Scanner(System.in);
        Arma arma = new Arma();
        System.out.println("Buscar un Arma para eliminar.");
        System.out.print("Introduce el nombre de la arma: ");
        try {
            arma.setTipo(sc.nextLine());
        } catch (InputMismatchException e) {
            System.out.println("ERROR.");
        }
        return arma.getTipo();
    }

    /**
     * Buscar skin para eliminarla
     */
    public static String buscarNombreParaEliminar() {
        Scanner sc = new Scanner(System.in);
        Skin skin = new Skin();
        System.out.println("Buscar una Skin para eliminar");
        System.out.print("Introduce el nombre de la skin: ");
        try {
            skin.setNombre(sc.nextLine());
        } catch (InputMismatchException e) {
            System.out.println("ERROR.");
        }
        return skin.getNombre();
    }

}