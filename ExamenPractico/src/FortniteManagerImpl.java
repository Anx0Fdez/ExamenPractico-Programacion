import java.util.ArrayList;
import java.util.Objects;

public class FortniteManagerImpl implements IFortniteManager {

    ArrayList<Arma> listaArmas = new ArrayList<>();
    ArrayList<Skin> listaSkins = new ArrayList<>();

    /**
     * Agrega una skin al inventario
     */
    @Override
    public void agregarSkin(Skin skin) {
        listaSkins.add(skin);
        System.out.println("Skin: " + skin.getNombre() + " // " + skin.getRareza() + " --> añadido al inventario.");
    }

    /**
     * Agrega un arma al inventario
     */

    @Override
    public void agregarArma(Arma arma) {
        listaArmas.add(arma);
        System.out.println("Arma: " + arma.getTipo() + " // " + arma.getDaño() + " de daño --> añadido al inventario.");
    }


    /**
     * Busca por arma un tipo y muestra su información
     */

    @Override
    public void buscarArmaPorTipo(String tipo) {
        for (Arma arma : listaArmas) {
            if (Objects.equals(tipo, arma.getTipo())) {
                System.out.println("    Información sobre: " + tipo + " \n       Daño = " + arma.getDaño());
            } else {
                System.out.println("    Arma inexistente");
            }
        }
    }

    /**
     * Muestra todas las skins del inventario con una rareza específica
     */
    @Override
    public void buscarSkinsPorRareza(String rareza) {
        System.out.print("    Skins por su rareza: " + rareza + ":");
        for (Skin skin : listaSkins) {
            if (Objects.equals(rareza, skin.getRareza())) {
                System.out.println("        " + skin.getNombre());
            } else {
                System.out.println("    Skin inexistente");
            }
        }
    }

    @Override
    public void eliminarSkin(String nombre) {
        Skin s = new Skin();
        if (Objects.equals(nombre, s.getNombre())) {
            listaSkins.remove(s);
            System.out.println("Skin: " + s.getNombre() + " // " + s.getRareza() + " de rareza --> eliminada del inventario.");
        } else {
            System.out.println("Skin no encontrada.");
        }
    }

    /**
     * Elimina un arma del inventario por tipo
     */

    @Override
    public void eliminarArma(String tipo) {
        Arma a = new Arma();
        if (Objects.equals(tipo, a.getTipo())) {
            listaArmas.remove(a);
            System.out.println("Arma: " + a.getTipo() + " // " + a.getDaño() + " de daño --> eliminado del inventario.");
        } else {
            System.out.println("Arma no encontrada.");
        }
    }

    /**
     * Elimina una skin del inventario por nombre
     */

}
