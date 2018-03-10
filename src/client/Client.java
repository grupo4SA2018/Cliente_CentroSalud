/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import serviciosweb.SQLException_Exception;

/**
 *
 * @author favio
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException_Exception {
        // TODO code application logic here
        Pantalla_principal nueva = new Pantalla_principal();
        nueva.show();
    }

    
}
