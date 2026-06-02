package portfolio_opgaver.designpatterns.annotations;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class SecureServiceProxy implements Service{

    private final Service realService;
    private final User user;

    public SecureServiceProxy(Service realService, User user){
            this.realService = realService;
            this.user = user;
    }

    @Override
    public void deleteAllUsers() {
        invoke("deleteAllUsers");
    }

    @Override
    public void viewProfile() {
        invoke("viewProfile");
    }

    @Override
    public void help() {
        invoke("help");
    }

    private void invoke(String methodName) {
        try {
            Method method = realService.getClass().getMethod(methodName);
            Role roleAnnotation = method.getAnnotation(Role.class);
            Log  logAnnotation  = method.getAnnotation(Log.class);

            boolean allowed = checkAccess(method, methodName, roleAnnotation);

            if (logAnnotation != null) {
                writeLog(logAnnotation.filename(), user.getName(), methodName, allowed);
            }

        } catch (NoSuchMethodException e) {
            System.out.println("Metoden '" + methodName + "' findes ikke.");
        } catch (Exception e) {
            System.out.println("Fejl: " + e.getMessage());
        }
    }

    private boolean checkAccess(Method method, String methodName, Role roleAnnotation)
            throws Exception {
        if (roleAnnotation == null) {
            System.out.println("'" + methodName + "' kræver ingen rolle – kaldes.");
            method.invoke(realService);
            return true;
        }
        if (user.getRole().equals(roleAnnotation.value())) {
            System.out.println("Adgang givet: " + methodName);
            method.invoke(realService);
            return true;
        } else {
            System.out.println("Adgang nægtet: " + methodName
                    + " (kræver '" + roleAnnotation.value()
                    + "', du har '" + user.getRole() + "')");
            return false;
        }
    }

    private void writeLog(String filename, String username,
                          String methodName, boolean allowed) {
        try (PrintWriter out = new PrintWriter(new FileWriter(filename, true))) {
            out.println(LocalDateTime.now()
                    + " | User: "   + username
                    + " | Method: " + methodName
                    + " | Allowed: " + allowed);
        } catch (IOException e) {
            System.out.println("Kunne ikke skrive til logfil.");
        }
    }
}


