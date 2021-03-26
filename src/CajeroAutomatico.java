import java.util.Scanner;

public class CajeroAutomatico {
    // Atributos
    private int dineroaCajero ;
    private String ubicacion;
    private int numeroDeSerie;
    // Métodos

    public CajeroAutomatico(int dineroaCajero, String ubicacion, int numeroDeSerie) {
        this.dineroaCajero = dineroaCajero;
        this.ubicacion = ubicacion;
        this.numeroDeSerie = numeroDeSerie;
    }


    //getters and setters

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

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    //metodos



}