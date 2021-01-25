package helpdesk;

public class NodoColaTiquete {
    
    private Tiquete tiquete;
    private NodoColaTiquete atras;

    public NodoColaTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public NodoColaTiquete getAtras() {
        return atras;
    }

    public void setAtras(NodoColaTiquete atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return tiquete + "";
    }
    
    
    
}
