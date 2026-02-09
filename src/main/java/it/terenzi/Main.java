package it.terenzi;

public class Main {
    public static void main(String[] args) {
        ContoBancario conto1 = new ContoBancario("IT1234567890", 1000.0);
        System.out.println(conto1);
        conto1.deposita(500.0);
        System.out.println(conto1);
        conto1.preleva(200.0);
        System.out.println(conto1);
        conto1.preleva(1500.0);
        System.out.println(conto1);
    }
}