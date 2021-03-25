import java.util.Scanner;

public class Usuario {
    // Atributos
    private String nombreUs;
    private String contraseña;
    private int saldoTotal;
    private int numeroDeCuenta;



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

//
//    void retirarDinero() {
//        Scanner teclado = new Scanner(System.in);
//        int retiroDinero;
//        System.out.println("INTRODUZCA CANTIDAD A RETIRAR: ");
//        retiroDinero = teclado.nextInt();
//        if(retiroDinero <= getSaldoTotal() ) {
//            transacciones = getSaldoTotal();
//            setSaldoTotal(transacciones - retiroDinero);
//            System.out.println("RETIRAR: " +retiroDinero+"Bs.");
//            System.out.println("SALDO ACTUAL: " + getSaldoTotal() );
//
//        }
//        else {
//            System.out.println("TU SALDO ES INSUFICIENTE.");
//        }
//    }

//    void depositarDinero() {
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("INTRODUZCA CANTIDAD A DEPOSITAR: ");
//        depositarDinero = teclado.nextInt();
//        transacciones = getSaldoTotal();
//        setSaldoTotal(transacciones + depositarDinero);
//        System.out.println("DEPOSITAR: " + depositarDinero);
//        System.out.println("SALDO ACTUAL: " + getSaldoTotal());
//    }


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
                System.out.println("-----------------");
                System.out.println("SALDO ACTUAL: " + getSaldoTotal());

            }

            else if(opcion==2) {
                System.out.println("\nDEPOSITAR DINERO");
                System.out.println("------------------");
//                depositarDinero();

            }
            else if(opcion==3) {
                System.out.println("\nRETIRAR DINERO");
                System.out.println("----------------");
//                retirarDinero();
            }
            else if(opcion==4) {
                System.out.println("\nOperaciones realizadas con exito. Vuelva pronto");
                System.out.println("-----------------------------------------------");
                repetición = 2;
            }
        }while(repetición !=2 );

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