public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Account a1 = new Account("Corrente", 1234, "Jack Dantas", 220);

    
        a1.withdraw(20);

        System.out.println(a1.status());

        a1.deposit(55.60);

        System.out.println(a1.consultaSaldo());
    }
}
