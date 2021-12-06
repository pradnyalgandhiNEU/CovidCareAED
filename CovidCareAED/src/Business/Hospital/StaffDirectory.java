/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Enterprise.Hospital;
import java.util.ArrayList;

/**
 *
 * @author ayushgupta
 */
public class StaffDirectory {
    ArrayList<Staff> staffList;
    Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    
    public StaffDirectory(){
        staffList = new ArrayList<Staff>();
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(ArrayList<Staff> staffList) {
        this.staffList = staffList;
    }
    
}
