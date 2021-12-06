/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VacinationCenter;

import java.util.ArrayList;

/**
 *
 * @author ayushgupta
 */
public class VaccinationCenterStaffDirectory {
    ArrayList<VaccinationCenterStaff> VaccinationCenterstaffList;
    
    public VaccinationCenterStaffDirectory(){
        VaccinationCenterstaffList = new ArrayList<VaccinationCenterStaff>();
    }

    public ArrayList<VaccinationCenterStaff> getVaccinationCenterstaffList() {
        return VaccinationCenterstaffList;
    }

    public void setVaccinationCenterstaffList(ArrayList<VaccinationCenterStaff> VaccinationCenterstaffList) {
        this.VaccinationCenterstaffList = VaccinationCenterstaffList;
    }
}
