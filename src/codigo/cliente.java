/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author architect
 */
public class cliente
{
    private String firstName = null;
    private String lastName = null;
    
    public String getClienteName()
    {
        String returnValue = null;
        
        if((this.firstName != null) && (this.lastName != null))
            returnValue = this.firstName + " " + this.lastName;
        else if (this.firstName != null)
            returnValue = this.firstName + " N/A";
        else if (this.lastName != null)
            returnValue = "N/A " + this.lastName;
        else
            returnValue = "N/A N/A";
        
        return returnValue;
    }
    
    public void setFirstName(String pFirstName)
    {
        firstName = pFirstName;
    }
    
    public void setLastName(String pLastName)
    {
        lastName = pLastName;
    }
}
