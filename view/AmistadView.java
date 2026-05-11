package view;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import controller.CumpleController;
import model.Amistad;

public class AmistadView implements View<Amistad> {
    CumpleController miController;
    Scanner input;

    public AmistadView() {
        this.miController = new CumpleController();
        this.input = new Scanner(System.in);
    }

    @Override
    public void displayData() {// todo
        System.out.println("Los datos de su amigo son:");
        List<Amistad> listaAmigos = miController.getListaAmigos();
        for (Amistad amigo : listaAmigos) {
            System.out.println("Nombre: " + amigo.getNombre());
            System.out.println("Apellido: " + amigo.getApellido());
            System.out.println("Fecha de nacimiento: " + amigo.getCumple());
        }
    }

    @Override
    public void enterData() {
        String nombre;
        String apellido;
        String fechaIngreso;
        LocalDate fecha;
        input = new Scanner(System.in);
        System.out.println("A continuacion ingrese un amigo o tipee 0 para terminar...");
        do {
            System.out.println("Ingrese el nombre: \n");
            nombre = input.nextLine();
            if (nombre.equals("0")) {
                break;
            }
            System.out.println("Ingrese el apellido: \n");
            apellido = input.nextLine();
            if (apellido.equals("0")) {
                break;
            }
            System.out.println("Ingrese su fecha de nacimiento: \n");
            fechaIngreso = input.nextLine();
            if (fechaIngreso.equals("0")) {
                System.out.println("Decidiste finalizar el programa!");
                break;
            }
            fecha = LocalDate.parse(fechaIngreso);
            miController.agregarAmigo(new Amistad(nombre, apellido, fecha));
        } while (true);
    }

}
