package ProjectJAVA;
import ProjectJAVA.Database.Database;
import ProjectJAVA.Pages.Login;

public class App {
    public static void main(String[] args) {
        new Database();
        Login.Start();
    }
}
