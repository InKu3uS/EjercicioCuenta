package es.iespuertodelacruz.nefta;

import es.iespuertodelacruz.nefta.exception.CuentaException;

public class Main {

    public static void main(String[] args) {
        GestionCuenta gestion = new GestionCuenta();
        Cuenta cuenta;
        double saldoActual;

        cuenta = new Cuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta.getSaldo();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            gestion.retirar(2300);
        } catch (CuentaException e) {
            System.out.print("Fallo al retirar \n");
        }
        try {
            System.out.println("Ingreso en cuenta \n");
            gestion.ingresar(695);
        } catch (CuentaException e) {
            System.out.print("Fallo al ingresar \n");
        }
    }
}
