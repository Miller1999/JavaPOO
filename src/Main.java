import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Miller Arias","Neurocirujano");
        myDoctor.showName();

        showMenu();

        Patient patient = new Patient("Leidy","lea@mail.com");
    }
}