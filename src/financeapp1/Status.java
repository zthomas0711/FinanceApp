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
public class Status {
    Status(int _errorCode, boolean _isSuccess, String _msg)
    {
        errorCode = _errorCode;
        isSuccess= _isSuccess;
        msg= _msg;
    }
       public void SetErrorCode(int _errorCode)
    {
        errorCode = _errorCode;
        isSuccess = false;
        msg = "Unsuccessful command";
        
    }
    
    public int errorCode = 0;
    public String msg = "Success";
    public boolean isSuccess = true;
 
};
