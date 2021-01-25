package Estructuras;

import helpdesk.Tiquete;
import java.util.HashSet;

public class Lista {

    private NodoLista cabeza;

    public NodoLista getCabeza() {
        return cabeza;
    }

    public void insert(Tiquete tiquete) {
        if (estaVacio()) {

            cabeza = new NodoLista(tiquete);

        } else if (masPequenoQue(tiquete)) {

            insertaIzquierda(tiquete);

        } else if (!tieneSiguiente(cabeza)) {

            cabeza.setNext(new NodoLista(tiquete));

        } else {

            enMedio(tiquete);
        }
    }

    public boolean estaVacio() {
        return cabeza == null;
    }

    public void enMedio(Tiquete tiquete) {
        NodoLista aux = cabeza;
        NodoLista temp = new NodoLista(tiquete);
        while (tieneSiguiente(aux) && masGrandeQue(aux, tiquete)) {
            aux = aux.getNext();
        }
        temp.setNext(aux.getNext());
        aux.setNext(temp);
    }

    public boolean tieneSiguiente(NodoLista NodoLista) {
        return NodoLista.getNext() != null;
    }

    public boolean masGrandeQue(NodoLista NodoLista, Tiquete Tiquete) {
//        return NodoLista.getNext().cabeza.getTiquete().getId() < Tiquete.getId();
        return  NodoLista.getNext().getTiquete().getPrioridad() < Tiquete.getPrioridad();
    }

    public boolean masPequenoQue(Tiquete tiquete) {
//        return Tiquete.getId() < cabeza.getTiquete().getId();
        return tiquete.getPrioridad() < cabeza.getTiquete().getPrioridad();
    }

    public void insertaIzquierda(Tiquete Tiquete) {
        NodoLista aux = new NodoLista(Tiquete);
        aux.setNext(cabeza);
        cabeza = aux;
    }

    @Override
    public String toString() {
        NodoLista aux = cabeza;
        String s = "-- Lista Simple--: \n";
        while (aux != null) {
            s += aux;
            aux = aux.getNext();
        }
        return s;
    }

    public Tiquete  buscar(int id){
    NodoLista aux = cabeza;
    Tiquete auxtktTiquete = new Tiquete();
    while (aux != null){
        if (aux.getTiquete().getIdEmpleado() == id) {
            auxtktTiquete = aux.getTiquete();
        }
       
        aux = aux.getNext();
    
    }
   return auxtktTiquete;
}
    
     public boolean existe(int id){
        // Crea una copia de la lista.
        NodoLista aux = cabeza;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (id == aux.getTiquete().getIdEmpleado()){
                // Canbia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getNext();
            }
        }
        // Retorna el resultado de la bandera.
        return encontrado;
     }
    
     public void modifica (Tiquete p) {
        if(existe(p.getIdEmpleado())){
            NodoLista aux = cabeza;
            while (aux.getTiquete().getIdEmpleado() != p.getIdEmpleado()){
                aux = aux.getNext();
            }
            
            aux.getTiquete().setPrioridad(p.getPrioridad());
            aux.getTiquete().setDescripcionProblema(p.getDescripcionProblema());
            aux.getTiquete().setEstado(p.getEstado());
     
        }
              
        
    }
     
     
     public void elimina (int id) {
        if (cabeza !=null){
            if(cabeza.getTiquete().getIdEmpleado()  == id){
                cabeza = cabeza.getNext();
        }else {
            NodoLista aux = cabeza;
            while (aux.getNext() != null && aux.getNext().getTiquete().getIdEmpleado()< id){
                aux = aux.getNext();
            }
            if (aux.getNext() != null && aux.getNext().getTiquete().getIdEmpleado() == id){
                aux.setNext(aux.getNext().getNext());
                
                NodoLista aux2 = aux.getNext();
                aux2.setNext(null);
            }
        }
        }
}
}
