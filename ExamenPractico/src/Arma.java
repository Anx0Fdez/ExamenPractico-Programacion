public class Arma {
    private String tipo;
    private int daño;

    public Arma() {
    }

    public Arma(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
}
