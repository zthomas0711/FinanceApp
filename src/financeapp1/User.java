/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financeapp1;

/**
 *
 * @author Zachary
 */
public abstract class User {
    public void SetName(String _name){name = _name;};    
    public String GetName(){return name;};
    public void SetEmail(String _email){email = _email;};
    public String GetEmail(){return email;};
    public int GetEntryId(){return entryId;};
    private String email;
    private String name;
    private int entryId;
   
}
