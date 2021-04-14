package es.iespuertodelacruz.nefta;

import es.iespuertodelacruz.nefta.exception.CuentaException;

public class GestionCuenta {

    Cuenta cuenta;

    double saldo;
    double cantidad;

    /**
     * Metodo para ingresar dinero en la cuenta
     * 
     * @param cantidad a ingresar
     * @throws CuentaException error controlado
     */
    public void ingresar(double cantidad) throws CuentaException {
        if (cantidad < 0) {
            throw new CuentaException("No se puede ingresar una cantidad negativa");
        } else {
            saldo = saldo + cantidad;
        }
    }

    /**
     * Metodo para retirar dinero de la cuenta
     * 
     * @param cantidad a retirar
     * @throws CuentaException error controlado
     */
    public void retirar(double cantidad) throws CuentaException {
        if (cantidad <= 0) {
            throw new CuentaException("No se puede retirar una cantidad negativa");
        } else if (saldo < cantidad) {
            throw new CuentaException("No se hay suficiente saldo");
        } else {
            saldo = saldo - cantidad;
        }
    }
}
