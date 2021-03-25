import java.util.Scanner;

public class Banco {
    // Atributos
    private Administrador[] administradores = new Administrador[5];
    private Usuario[] usuarios = new Usuario[5];
    private CajeroAutomatico[] cajeros;
    private int opción;
    //Métodos

    void preguntarUsuaOAdmi() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("BIENVENIDO");
        System.out.println("1. Usuario");
        System.out.println("2. Administrador");
        System.out.print("INGRESE UNA OPCIÓN: ");
        opción = teclado.nextInt();
        System.out.println("--------------------");


        if (opción == 1) {

            String user;
            String password;

            System.out.println("USUARIO");

            System.out.println("Ingrese su nombre porfavor: ");
            user = teclado.nextLine();


            creacionUsuariosyAdministradoresCajero();
            System.out.println("Ingrese contraseña porfavor: ");
            password = teclado.nextLine();


            int posicion = login("Angel","hola");


            usuarios[posicion].menuDeOperaciones();


        } else if (opción == 2) {
            System.out.println("ADMINISTRADOR");

        } else {
            System.out.println("NO VÁLIDO. INTENTE DE NUEVO");
        }
    }


    void creacionUsuariosyAdministradoresCajero() {


        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i] = new Usuario("","",0,0);
        }

        for (int j = 0; j <administradores.length ; j++) {
            administradores[j] = new Administrador("");
        }



        usuarios[0] = new Usuario("Angel", "hola", 34563 ,800010);

        usuarios[1] = new Usuario("Luis", "amolapizza", 65788 ,800011);

        usuarios[2] = new Usuario("Alejandra", "soylamejor", 54364,800012);

        usuarios[3] = new Usuario("Daniel", "amoamiperro", 23456,800013);

        usuarios[4] = new Usuario("Jose", "amoprogramar", 123435,800014);

        administradores[0] = new Administrador("Angel");

        administradores[1] = new Administrador("Sebastian");

        administradores[2] = new Administrador("Carolija");


//        System.out.println("CAJERO AUTOMÁTICO 01");
//        int dineroCajero = usuarios[0].getSaldoTotal() + usuarios[1].getSaldoTotal() + usuarios[2].getSaldoTotal() + usuarios[3].getSaldoTotal() + usuarios[4].getSaldoTotal();
//        cajeros[0] = new CajeroAutomatico(dineroCajero, "Miraflores");
//
//        System.out.println("CAJERO AUTOMÁTICO 02");
//        cajeros[1] = new CajeroAutomatico(dineroCajero, "Sopocachi");
//
//        System.out.println("CAJERO AUTOMÁTICO 01");
//        cajeros[2] = new CajeroAutomatico(dineroCajero, "Centro");

    }


    int login (String user, String password ){

            int posicion = 0;
        for (int i = 0; i <usuarios.length ; i++) {
            if (user == usuarios[i].getNombreUs() && password == usuarios[i].getContraseña()){
                System.out.println("Bienvenido " + usuarios[i].getNombreUs());
            }
        }

        return posicion;
    }

}