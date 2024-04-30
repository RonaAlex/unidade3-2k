package Exemplos;
public class TesteCconta {
public static void main(String[] args) {
   CONTA c = new CONTA();
   c.depositar(100);
   c.depositar(50);
    System.out.println("Saldo: " + c.saldo);
    }

}
