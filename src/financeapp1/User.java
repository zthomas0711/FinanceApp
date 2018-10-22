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
    public abstract void SetRoles();
    public void SetName(String _name){name = _name;};    
    public String GetName(){return name;};
    public void SetEmail(String _email){email = _email;};
    public String GetEmail(){return email;};
    public int GetEntryId(){return entryId;};
    public boolean CanLogOfferings(){return canLogOfferings;}
    public boolean CanViewLedgers(){return canViewLedgers;};
    public boolean CanLogPurchases(){return canLogPurchases;};
    public boolean CanPerformTransfers(){return canPerformTransfers;};
    public boolean CanReconcileAccounts(){return canReconcileAccounts;};
    public boolean CanUploadDocuments(){return canUploadDocuments;};
    public boolean CanGenerateReports(){return canGenerateReports;};
    public boolean CanGenerateContributions(){return canGenerateContributions;};
    public boolean CanUpdateVisitors(){return canUpdateVisitors;};
    public boolean CanManageBudget(){return canManageBudget;};
    public boolean CanConfigureOptions(){return canConfigureOptions;};
    public boolean CanManageUsers(){return canManageUsers;};
    protected String email;
    protected String name;
    protected int entryId;
    protected boolean canLogOfferings;
    protected boolean canViewLedgers;
    protected boolean canLogPurchases;
    protected boolean canPerformTransfers;
    protected boolean canReconcileAccounts;
    protected boolean canUploadDocuments;
    protected boolean canGenerateReports;
    protected boolean canGenerateContributions;
    protected boolean canUpdateVisitors;
    protected boolean canManageBudget;
    protected boolean canConfigureOptions;
    protected boolean canManageUsers;
    
}

