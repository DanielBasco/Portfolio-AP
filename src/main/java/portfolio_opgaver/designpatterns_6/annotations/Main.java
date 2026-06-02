package portfolio_opgaver.designpatterns.annotations;

public class Main {
    public static void main(String[] args) {

        User admin = new User("Alice", "admin");
        User normal = new User("Bob", "user");

        System.out.println("--- Alice (admin) ---");
        Service proxy = new SecureServiceProxy(new SecureService(), admin);
        proxy.deleteAllUsers();
        proxy.viewProfile();
        proxy.help();

        System.out.println("\n--- Bob (user) ---");
        proxy = new SecureServiceProxy(new SecureService(), normal);
        proxy.deleteAllUsers();
        proxy.viewProfile();
        proxy.help();
    }
}
