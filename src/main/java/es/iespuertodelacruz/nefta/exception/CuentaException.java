package es.iespuertodelacruz.nefta.exception;

public class CuentaException extends Exception {

    private static final long serialVersionUID = 9142260052625799351L;

    public CuentaException(String mensaje) {
        super(mensaje);
    }

    public CuentaException(String mensaje, Exception causa) {
        super(mensaje, causa);
    }
}
