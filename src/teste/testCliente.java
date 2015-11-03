/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import codigo.cliente;
import junit.framework.TestCase;

public class testCliente extends TestCase
{
    public void testGetClienteName()
    {
        cliente c1 = new cliente();
        c1.setFirstName("Gabriel");
        c1.setLastName("Huhn");
        assertEquals("Gabriel Huhn",c1.getClienteName());
        
        cliente c2 = new cliente();
        assertEquals("N/A N/A",c2.getClienteName());
        
        cliente c3 = new cliente();
        c3.setFirstName("Gabriel");
        assertEquals("N/A N/A",c3.getClienteName());
        
        cliente c4 = new cliente();
        c4.setLastName("Huhn");
        assertEquals("N/A Huhn",c4.getClienteName());
    }
}