/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.City;

import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author shreya.ghate
 */
public class City {
    private String cityName;
    private EnterpriseDirectory enterpriseDirectory;
    private ArrayList<Community> communityList;
    
    public City(){
        this.communityList = new ArrayList<Community>(); 
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public Community addCommunity(){
        Community community = new Community();
        communityList.add(community);
        return community;
        
    }
    
     public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
}
