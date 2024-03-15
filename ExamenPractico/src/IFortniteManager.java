public interface IFortniteManager {
     /*
     Metodos para implemetar en las Clases
     */
     void agregarSkin(Skin skin);

     void agregarArma(Arma arma);

     void buscarSkinsPorRareza(String rareza);

     void buscarArmaPorTipo(String tipo);

     void eliminarSkin(String nombre);

     void eliminarArma(String tipo);

}
