import java.util.Scanner;

public class Usuario {
    // Atributos
    private String nombreUs;
    private String contraseña;
    private int saldoTotal;
    private int numeroDeCuenta;


    Scanner teclado = new Scanner(System.in);


    // Métodos
    public Usuario( ) {

    }

    public Usuario(String nombreUs, String contraseña, int saldoTotal, int numeroDeCuenta) {
        this.nombreUs = nombreUs;
        this.contraseña = contraseña;
        this.saldoTotal = saldoTotal;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getNombreUs() {

        return nombreUs;
    }

    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
        System.out.println(nombreUs);
    }
    public int getSaldoTotal() {

        return saldoTotal;
    }

    public void setSaldoTotal(int saldoTotal) {
        this.saldoTotal = saldoTotal;
    }


    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }


}