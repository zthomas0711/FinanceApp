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
public class Administrator extends User{
     Administrator(String _name, String _email, int _entryId)
    {
        name = _name;
        email = _email;
        entryId = _entryId;
    }
    
    @Override
    public void SetRoles() {
    canLogOfferings = true;
    canViewLedgers = true;
    canLogPurchases = true;
    canPerformTransfers = true;
    canReconcileAccounts = true;
    canUploadDocuments = true;
    canGenerateReports = true;
    canGenerateContributions = true;
    canUpdateVisitors = true;
    canManageBudget = true;
    canConfigureOptions = true;
    canManageUsers = true;
    }
    
}
