import java.util.Scanner;

public class Administrador {

    // Atributos
    private String nombreAdmi;
    private String contrasena;



    // Métodos

    public Administrador(){

    }

    public Administrador(String nombreAdmi, String contrasena) {
        this.nombreAdmi = nombreAdmi;
        this.contrasena = contrasena;
    }

    public String getNombreAdmi() {
        return nombreAdmi;
    }

    public void setNombreAdmi(String nombreAdmi) {
        this.nombreAdmi = nombreAdmi;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}