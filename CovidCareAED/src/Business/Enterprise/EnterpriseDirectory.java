/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;
import Business.Enterprise.Enterprise.Type;
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
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new Hospital(ID, name, address, phonenumber, email, totalbeds);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.Distributor){
            enterprise=new DistributorEnterprise(name);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
            return enterprise;
    }
}
