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
public class Transaction {
    Transaction(int _entryId, String _date, String _monthReconciled,
            String _description, double _amount, String _comments,
            String _category, String _department, boolean _isReconciled,
            String _lastEditedBy, String _documentLinkAddress, String _paymentNumber)
    {
    date = _date;
    description = _description;
    amount = _amount;
    comments = _comments;
    category = _category;
    department = _department;
    isReconciled = _isReconciled;
    monthReconciled = _monthReconciled;
    lastEditedBy = _lastEditedBy;
    documentLinkAddress = _documentLinkAddress;
    paymentNumber = _paymentNumber;
    entryId = _entryId; 
    isUpdated = true;
    };
    
    public void SetReconciliation(boolean _isReconciled, String _date)
    {
        isReconciled = _isReconciled;
        monthReconciled = _date;
        isUpdated = true;
    }
    
    public void UploadDocument(String _address)
    {
        documentLinkAddress = _address;
        isUpdated = true;
    }
    
    public void SetUpdateStatus(boolean _isUpdated)
    {
        isUpdated = _isUpdated;
    }
    
    public void UpdateEditor(User user)
    {
        lastEditedBy = user.GetName();
    }
    private String date;
    private String description;
    private double amount;
    private String comments;
    private String category;
    private String department;
    private boolean isReconciled = false;
    private String monthReconciled;
    private String lastEditedBy;
    private String documentLinkAddress;
    private String paymentNumber;
    private int entryId;
    private boolean isUpdated = false;
}
