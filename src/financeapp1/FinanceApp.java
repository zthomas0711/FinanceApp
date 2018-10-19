/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financeapp1;

import java.applet.Applet;
import java.awt.EventQueue;
import javax.swing.JFrame;
/**
 *
 * @author Zachary
 */
public class FinanceApp extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        
        JFrame j = new FinanceAppLogin();
        j.setVisible(true);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
