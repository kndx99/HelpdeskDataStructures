package helpdesk;

import UI.FMenuPrincipal;

public class Main {

    public static FMenuPrincipal menuPrincipal;
    
    public static void main(String[] args) {
        menuPrincipal = new FMenuPrincipal(new Cola(), new Tiquete());
        menuPrincipal.setVisible(true);    
    }
}
