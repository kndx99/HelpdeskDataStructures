package Estructuras;

import helpdesk.Tiquete;

public class NodoLista {
    
    private Tiquete tiquete;
    private NodoLista next;

    public NodoLista(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
 }

    @Override
    public String toString() {
        return " " +tiquete + " \n " ;
    }
    
}
