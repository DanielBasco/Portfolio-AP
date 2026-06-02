package portfolio_opgaver.designpatterns.annotations;

public class SecureService  implements Service{

    @Log(filename = "log.txt")
    @Role("admin")
    public void deleteAllUsers() {
        System.out.println("Alle brugere er slettet.");
    }

    @Role("user")
    public void viewProfile() {
        System.out.println("Profil vist.");
    }

    public void help() {
        System.out.println("Hjælp åbnet.");
    }
}
