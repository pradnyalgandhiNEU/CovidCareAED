/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

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
    public Enterprise createAndAddEnterprise(Enterprise.EnterpriseType type, String name){
        Enterprise enterprise=null;
        if( null!=type)switch (type) {
                case Hospital:
                    enterprise=new Hospital(name);
                    enterpriseList.add(enterprise);
                    break;
                case TestingLab:
                    enterprise=new TestingLab(name);
                    enterpriseList.add(enterprise);
                    break;
                case VaccinationCenter:
                    enterprise=new VaccinationCenter(name);
                    enterpriseList.add(enterprise);
                    break;
                case VaccineManufacturer:
                    enterprise=new VaccineManufacturer(name);
                    enterpriseList.add(enterprise);
                    break;
                default:
                    break;
            }
            return enterprise;
    }
}
