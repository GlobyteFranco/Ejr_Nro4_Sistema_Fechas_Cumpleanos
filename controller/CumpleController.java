package controller;

import java.util.ArrayList;
import java.util.List;

import model.Amistad;

public class CumpleController {
    public List<Amistad> listaAmigos;

    public CumpleController() {
        this.listaAmigos = new ArrayList<Amistad>();
    }

    public void agregarAmigo(Amistad amigo) {
        listaAmigos.add(amigo);
    }

    public List<Amistad> getListaAmigos() {
        return this.listaAmigos;
    }
}
