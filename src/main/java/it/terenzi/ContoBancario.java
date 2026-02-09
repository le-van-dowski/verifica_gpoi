package it.terenzi;

public class ContoBancario {

    protected String iban;
    protected double saldo;

    public ContoBancario(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public void deposita(double importo) {
        this.saldo += importo;
    }

    public void preleva(double importo) {
        if (importo > saldo) {
            System.out.println("Fondi insufficienti");
        } else {
            this.saldo -= importo;
        }
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContoBancario [iban=" + iban + ", saldo=" + saldo + "]";
    }

    
    
}
