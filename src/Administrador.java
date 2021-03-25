import java.util.Scanner;

public class Administrador {

    // Atributos
    private String nombreAdmi;



    // Métodos

    public Administrador(){

    }


    public Administrador(String nombreAdmi) {
        this.nombreAdmi = nombreAdmi;
    }

    public String getNombreAdmi() {
        return nombreAdmi;
    }


    public void setNombreAdmi(String nombreAdmi) {
        this.nombreAdmi = nombreAdmi;
    }

    void menuOperaciones() {
        Scanner teclado = new Scanner(System.in);
        int repetición = 0;
        int opcion = 0;
        do {
            do {
                System.out.println("1. RECARGAR CAJERO");
                System.out.println("2. CONSULTAR SALDO CAJERO");
                opcion = teclado.nextInt();
                System.out.println("-------------------------");

                if(opcion >= 1 && opcion <= 2) {
                    repetición = 1;
                }
                else {
                    System.out.println("NO VÁLIDO. INTENTE DE NUEVO PORFAVOR");
                }
            }while(repetición==0);

            if(opcion==1) {
                System.out.println("RECARGAR DINERO");
                System.out.println("¿CUÁNTO DINERO DESEA RECARGAR AL CAJERO?");

            }

            else if(opcion == 2) {
                System.out.println("CONSULTAR SALDO CAJERO");

            }
        }while(true);
    }
}