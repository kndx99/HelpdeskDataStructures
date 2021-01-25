package helpdesk;

public class Cola {

    private NodoColaTiquete frente;
    private NodoColaTiquete ultimo;

    public NodoColaTiquete getFrente() {
        return frente;
    }

    public void encola(NodoColaTiquete d) {
        if (frente == null) {
            frente = d;
            ultimo = d;
        } else {
            ultimo.setAtras(d);
            ultimo = d;
        }
    }

    public boolean vacia() {
        NodoColaTiquete aux = frente;
        boolean vacia = false;
        if (aux == null) {
            vacia = true;
        } else {
            vacia = false;
        }
        return vacia;
    }

    public NodoColaTiquete atiende() {
        NodoColaTiquete aux = frente;

        if (frente != null) {
            frente = frente.getAtras();

            aux.setAtras(null);
        }
        return aux;
    }

    @Override
    public String toString() {
        String s = "";
        NodoColaTiquete aux = frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }
        return s;
    }

    public Tiquete atender() {
        NodoColaTiquete aux = frente;
        Tiquete t2 = new Tiquete();

        if (frente != null) {
            frente = frente.getAtras();
            t2 = frente.getTiquete();
            aux.setAtras(null);
        }
        return t2;
    }

    public Tiquete buscar(int IDEmpleadoaBuscar) {
        NodoColaTiquete aux = frente;
        Tiquete t1 = new Tiquete();
        while (aux != null) {
            if (aux.getTiquete().getIdEmpleado() == IDEmpleadoaBuscar) {
                t1 = aux.getTiquete();
            }
            aux = aux.getAtras();
        }
        return t1;
    }

    public boolean existe(int IDEmpleadoaBuscar) {
        NodoColaTiquete aux = frente;
        boolean encontre = false;
        while (aux != null) {
            if (aux.getTiquete().getIdEmpleado() == IDEmpleadoaBuscar) {
                encontre = true;
            }
            aux = aux.getAtras();
        }
        return encontre;
    }

}
