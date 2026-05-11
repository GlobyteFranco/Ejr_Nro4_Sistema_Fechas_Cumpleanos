
import controller.CumpleController;
import view.AmistadView;
import view.View;

public class App {
    public static void main(String[] args) {
        View miVista = new AmistadView();
        miVista.enterData();
        miVista.displayData();
        System.out.println("Gracias por usar el programa!");

    }
}