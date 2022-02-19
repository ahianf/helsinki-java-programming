
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account cuenta = new Account("Matthews account", 1000.0);
        Account miCuenta = new Account("My account", 0.0);

        cuenta.withdrawal(100);
        miCuenta.deposit(100);

        System.out.println(cuenta);
        System.out.println(miCuenta);

    }
}
