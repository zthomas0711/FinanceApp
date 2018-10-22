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
public class Counter extends User{
    Counter(String _name, String _email, int _entryId)
    {
        name = _name;
        email = _email;
        entryId = _entryId;
    }
    
    @Override
    public void SetRoles() {
    canLogOfferings = true;
    canViewLedgers = true;
    canLogPurchases = false;
    canPerformTransfers = false;
    canReconcileAccounts = false;
    canUploadDocuments = true;
    canGenerateReports = false;
    canGenerateContributions = false;
    canUpdateVisitors = true;
    canManageBudget = false;
    canConfigureOptions = false;
    canManageUsers = false;
    }
    
}
