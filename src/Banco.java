import java.util.Scanner;

public class Banco {
    // Atributos
    private Administrador[] administradores = new Administrador[5];
    private Usuario[] usuarios = new Usuario[5];
    private CajeroAutomatico[] cajeros = new CajeroAutomatico[3];
    private int opción;

    int posicion = 0;
    int identificadorDeCajero ;
    //Métodos


    Scanner teclado = new Scanner(System.in);



   String ingresarUsuario(){
        String user;


        System.out.println("USUARIO");

        System.out.println("Ingrese su nombre porfavor: ");
        user = teclado.nextLine();



      return user;
    }

    String ingresarPassword(){
        String password;
        System.out.println("Ingrese contraseña porfavor: ");
        password = teclado.nextLine();

        return password;
    }
    void preguntarUsuaOAdmi() {


       identificadorDeCajero= escogerCajero();
        creacionUsuariosAdministradoresyCajeros();
        Scanner teclado = new Scanner(System.in);
        System.out.println("BIENVENIDO");
        System.out.println("1. Usuario");
        System.out.println("2. Administrador");
        System.out.print("INGRESE UNA OPCIÓN: ");
        opción = teclado.nextInt();
        System.out.println("--------------------");





        if (opción == 1) {





            String x = ingresarUsuario();
            String y = ingresarPassword();

            //Problema !!!!

           login("Luis" ,"amolapizza");





        } else if (opción == 2) {
            System.out.println("ADMINISTRADOR");

            loginAdmin("Sebastian" , "contrasena");

        } else {
            System.out.println("NO VÁLIDO. INTENTE DE NUEVO");
        }
    }


    void creacionUsuariosAdministradoresyCajeros() {


        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i] = new Usuario("","",0,0);
        }

        for (int j = 0; j <administradores.length ; j++) {
            administradores[j] = new Administrador("","");
        }

        for (int k = 0; k <cajeros.length ; k++) {
            cajeros[k] = new CajeroAutomatico(0,"",0);
        }



        usuarios[0] = new Usuario("Angel", "hola", 34563 ,800010);

        usuarios[1] = new Usuario("Luis", "amolapizza", 65788 ,800011);

        usuarios[2] = new Usuario("Alejandra", "soylamejor", 54364,800012);

        usuarios[3] = new Usuario("Daniel", "amoamiperro", 23456,800013);

        usuarios[4] = new Usuario("Jose", "amoprogramar", 123435,800014);

        administradores[0] = new Administrador("Angel","123456789");

        administradores[1] = new Administrador("Sebastian","contrasena");

        administradores[2] = new Administrador("Carolija","987654321");




       cajeros[0] = new CajeroAutomatico( 5000, "Miraflores",2021);


        cajeros[1] = new CajeroAutomatico(10000, "Sopocachi",2022);


        cajeros[2] = new CajeroAutomatico(20000, "Centro",2023);

    }


    void login (String user, String password ){


        for ( int  i = 0 ; i < usuarios.length ; i++) {

            if (usuarios[i].getNombreUs() == user&& usuarios[i].getContraseña() ==  password){


                System.out.println("Bienvenido " + usuarios[i].getNombreUs());

                System.out.println(i);

                posicion = i ;

                menuDeOperaciones();
            }


        }



    }

  void loginAdmin (String user, String password){



        for (int i = 0; i <administradores.length ; i++) {
            if(user == administradores[i].getNombreAdmi() && password == administradores[i].getContrasena()){

                posicion = i;
                System.out.println("Bienvenido Admin " + administradores[i].getNombreAdmi());

                menuOperacionesAdmin();

            }

        }

    }



    //------------------------

    void retirarDinero(int posicion) {


        int cantidad;

        System.out.println("INTRODUZCA CANTIDAD A RETIRAR: ");
        cantidad = teclado.nextInt();
        if(cantidad <= usuarios[posicion].getSaldoTotal() ) {

          usuarios[posicion].setSaldoTotal(usuarios[posicion].getSaldoTotal() - cantidad);
            System.out.println("RETIRAR: " +cantidad+"Bs.");
            System.out.println("SALDO ACTUAL: " + usuarios[posicion].getSaldoTotal() );

            cajeros[identificadorDeCajero].setDineroaCajero(cajeros[identificadorDeCajero].getDineroaCajero() - cantidad);

            System.out.println(cajeros[identificadorDeCajero].getDineroaCajero() + " Bs.");

        }
        else {
            System.out.println("TU SALDO ES INSUFICIENTE.");
        }
    }


    void consultarDinero(int posicion){
        System.out.println("Saldo Actual : " + usuarios[posicion].getSaldoTotal());
    }
    void depositarDinero(int posicion) {


        System.out.println("1) Cuenta Propia");

        System.out.println("2) Cuenta Terceros");


        int cantidad;
        int opcion = teclado.nextInt();
        if(opcion == 1){

            System.out.print("INTRODUZCA CANTIDAD A DEPOSITAR: ");

            cantidad =teclado.nextInt();

           usuarios[posicion].setSaldoTotal(usuarios[posicion].getSaldoTotal() + cantidad);

            System.out.println("DEPOSITAR: " + cantidad);
            System.out.println("SALDO ACTUAL: " + usuarios[posicion].getSaldoTotal());

            cajeros[identificadorDeCajero].setDineroaCajero(cajeros[identificadorDeCajero].getDineroaCajero() + cantidad);

            System.out.println(cajeros[identificadorDeCajero].getDineroaCajero() + " Bs.");


        }else if (opcion ==2){
            int destino ;
            int posicionDeEnvio ;
            System.out.println("Introduzca el numero de cuenta del Destinatario");
            destino =teclado.nextInt();

            for (int i = 0; i <usuarios.length ; i++) {
                if(destino == usuarios[i].getNumeroDeCuenta()){
                    posicionDeEnvio = i ;
                    System.out.print("INTRODUZCA CANTIDAD A DEPOSITAR: ");

                    cantidad =teclado.nextInt();

                    System.out.println("Enviando : " + cantidad + " A : " + usuarios[posicionDeEnvio].getNombreUs() );

                    usuarios[posicionDeEnvio].setSaldoTotal(usuarios[posicionDeEnvio].getSaldoTotal() + cantidad);

                    usuarios[posicion].setSaldoTotal(usuarios[posicion].getSaldoTotal() - cantidad);

                    System.out.println(" Fueron debitados : " + cantidad + " del usuario : " + usuarios[posicion].getNombreUs());
                    System.out.println(" Saldo Actual  : " + usuarios[posicion].getSaldoTotal() );

                    cajeros[identificadorDeCajero].setDineroaCajero(cajeros[identificadorDeCajero].getDineroaCajero() + cantidad);

                    System.out.println(cajeros[identificadorDeCajero].getDineroaCajero() + " Bs.");


                }
            }

        }


    }


    public void menuDeOperaciones() {
        Scanner teclado = new Scanner(System.in);
        int repetición = 0;
        int opcion = 0;

        do {
            do {

                System.out.println("\n1. Consultar saldo.");
                System.out.println("2. Depositar dinero.");
                System.out.println("3. Retirar dinero.");
                System.out.println("4. Finalizar operaciones." );
                System.out.print("\nSELECCIONE UNA OPCIÓN: ");
                opcion = teclado.nextInt();
                System.out.println("-----------------------");



                if(opcion >= 1 && opcion <= 4) {
                    repetición = 1;
                }
                else {
                    System.out.println("NO VÁLIDO. INTENTE DE NUEVO PORFAVOR");
                }
            }while(repetición==0);

            if(opcion==1) {
                System.out.println("\nCONSULTAR SALDO");
                System.out.println();
                consultarDinero(posicion);


            }

            else if(opcion==2) {
                System.out.println("\nDEPOSITAR DINERO");
                System.out.println("------------------");
                depositarDinero(posicion);

            }
            else if(opcion==3) {
                System.out.println("\nRETIRAR DINERO");
                System.out.println("----------------");
                retirarDinero(posicion);
            }
            else if(opcion==4) {
                System.out.println("\nOperaciones realizadas con exito. Vuelva pronto");
                System.out.println("-----------------------------------------------");
                repetición = 2;
            }
        }while(repetición !=2 );

    }

    void menuOperacionesAdmin() {
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
                int serie ;
                System.out.println("Ingrese el numero de serie del Cajero");
                serie = teclado.nextInt();
                int cantidad ;
                for (int i = 0; i <cajeros.length ; i++) {
                    if (serie == cajeros[i].getNumeroDeSerie()){


                        System.out.println("¿CUÁNTO DINERO DESEA RECARGAR AL CAJERO?");
                        cantidad = teclado.nextInt();

                        cajeros[i].setDineroaCajero(cajeros[i].getDineroaCajero() + cantidad);


                    }
                }


            }

            else if(opcion == 2) {
                System.out.println("CONSULTAR SALDO CAJERO");

                int serie ;
                System.out.println("Ingrese el numero de serie del Cajero");
                serie = teclado.nextInt();

                for (int i = 0; i <cajeros.length ; i++) {
                    if (serie == cajeros[i].getNumeroDeSerie()){


                        System.out.println("Dinero En el Cajero de :  " + cajeros[i].getUbicacion() + " Saldo : " + cajeros[i].getDineroaCajero());


                    }
                }

            }
        }while(true);
    }

    int escogerCajero (){
       System.out.println("Bienvenido ");
       System.out.println("1) miraflores ");

        System.out.println("2) Sopocachi ");

        System.out.println("3) Centro ");

        System.out.println("ingres una opcion");
        int n = teclado.nextInt();

        if(n==1){
            return 0;
        }else if (n==2){
            return 1;
        }else  {
            return 2;
        }
    }



}