/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VacinationCenter;

import Business.Enterprise.VaccinationCenter;
import Business.Person.Person;

/**
 *
 * @author ayushgupta
 */
public class VaccinationCenterStaff extends Person{
    private int staffId;
    private String staffRole;
    VaccinationCenter vaccinationCenter;

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
}
