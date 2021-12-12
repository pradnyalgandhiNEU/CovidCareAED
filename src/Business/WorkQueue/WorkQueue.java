/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public Order addWorkRequestList(String message, UserAccount sender, UserAccount receiver, String status) {
        Order temp = new Order(message, sender, receiver, status);
        workRequestList.add(temp);
        return temp;
    }
    
    public VaccinatePatient addWorkRequestList2(String message, UserAccount sender, UserAccount receiver, String status){
        VaccinatePatient temp = new VaccinatePatient(message, sender, receiver, status);
        workRequestList.add(temp);
        return temp;
    }
}