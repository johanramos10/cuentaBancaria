public class Main {

    public static void main(String[] args) {
    private String nombres;
    private String apellidos;
    private String numeroCuenta;
    private String tipoCuenta;
    private double saldo;
    private double tasaI;
    
    public CuentaBancaria(String nombres, String apellidos, String numeroCuenta, String tipoCuenta,double tasaI) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
    }
    
    public void imprimirInformacion() {
        System.out.println("Titular: " + nombres + " " + apellidos);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: " + saldo);
    }
    
    public double consultarSaldo() {
        return saldo;
    }
    
    public void consignar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Se ha consignado " + valor + " en la cuenta.");
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
        }
    }
    public void aplicarT(){
        saldo= saldo*tasaI;
    }
    public void retirar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Se ha retirado " + valor + " de la cuenta.");
        } else {
            System.out.println("No es posible realizar el retiro. Verifica el valor o el saldo disponible.");
        }
    }
    
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", "Pérez", "123456789", "cuenta corriente");

        cuenta.imprimirInformacion();
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());

        cuenta.consignar(1000);
        System.out.println("Saldo después de consignación: " + cuenta.consultarSaldo());

        cuenta.retirar(500);
        System.out.println("Saldo después de retiro: " + cuenta.consultarSaldo());
    }
}
    }


