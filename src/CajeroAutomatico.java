public class CajeroAutomatico {
    // Atributos
    private int dineroaCajero = 10000;
    private String ubicacion;
    // Métodos
    public CajeroAutomatico(int dineroaCajero, String ubicacion) {
        this.dineroaCajero = dineroaCajero;
        this.ubicacion = ubicacion;
    }
    public int getDineroaCajero() {
        return dineroaCajero;
    }

    public void setDineroaCajero(int dineroaCajero) {
        this.dineroaCajero = dineroaCajero;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


}