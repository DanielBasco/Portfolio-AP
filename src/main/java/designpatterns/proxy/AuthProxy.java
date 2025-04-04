package designpatterns.proxy;

public class AuthProxy implements Service {
    private RealService realService;

    public void perform() {
        if (realService == null) {
            realService = new RealService();
        }
        System.out.println("Proxy: Checking access or caching...");
        realService.perform();
    }
}