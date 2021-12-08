/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;
import Business.Enterprise.Enterprise;
/**
 *
 * @author shreya.ghate
 */
public class EnterpriseDirectory {
        private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(Enterprise.EnterpriseType type, String ID, String name, String address, int phonenumber, String email, int totalbeds){
        Enterprise enterprise=null;
        if( null!=type)switch (type) {
                case Hospital:
                    enterprise=new Hospital(ID, name, address, phonenumber, email, totalbeds);
                    enterpriseList.add(enterprise);
                    break;
                case TestingLab:
                    enterprise=new TestingLab(ID, name, address, phonenumber, email, totalbeds);
                    enterpriseList.add(enterprise);
                    break;
                case VaccinationCenter:
                    enterprise=new VaccinationCenter(ID, name, address, phonenumber, email, totalbeds);
                    enterpriseList.add(enterprise);
                    break;
                case VaccineManufacturer:
                    enterprise=new VaccinationManufacturer(ID, name, address, phonenumber, email, totalbeds);
                    enterpriseList.add(enterprise);
                    break;
                default:
                    break;
            }
            return enterprise;
    }
}
